import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * A simple calculator built with Java Swing (Java 11 compatible).
 *
 * Supports: + - * / , decimal point, sign toggle (+/-), percent (%),
 * clear (C), backspace, and keyboard input.
 */
public class Calculator extends JFrame implements ActionListener {

    private final JTextField display = new JTextField("0");

    // Calculation state
    private double accumulator = 0;   // running result / left operand
    private String pendingOp = null;  // operator waiting to be applied
    private boolean startNewNumber = true; // next digit starts a fresh number

    public Calculator() {
        super("Calculator");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new BorderLayout(5, 5));

        buildDisplay();
        buildButtons();

        pack();
        setMinimumSize(new Dimension(320, 400));
        setLocationRelativeTo(null); // center on screen
    }

    private void buildDisplay() {
        display.setEditable(false);
        display.setHorizontalAlignment(JTextField.RIGHT);
        display.setFont(new Font("SansSerif", Font.BOLD, 36));
        display.setBorder(BorderFactory.createEmptyBorder(15, 15, 15, 15));
        add(display, BorderLayout.NORTH);
    }

    private void buildButtons() {
        String[] labels = {
                "C", "±", "%", "÷",
                "7", "8", "9", "×",
                "4", "5", "6", "-",
                "1", "2", "3", "+",
                "0", ".", "⌫", "="
        };

        JPanel grid = new JPanel(new GridLayout(5, 4, 5, 5));
        grid.setBorder(BorderFactory.createEmptyBorder(0, 5, 5, 5));

        for (String label : labels) {
            JButton b = new JButton(label);
            b.setFont(new Font("SansSerif", Font.PLAIN, 22));
            b.setFocusable(false);
            b.addActionListener(this);
            grid.add(b);
        }
        add(grid, BorderLayout.CENTER);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String cmd = e.getActionCommand();
        switch (cmd) {
            case "0": case "1": case "2": case "3": case "4":
            case "5": case "6": case "7": case "8": case "9":
                inputDigit(cmd);
                break;
            case ".":
                inputDot();
                break;
            case "C":
                clear();
                break;
            case "⌫": // backspace
                backspace();
                break;
            case "±": // sign toggle
                toggleSign();
                break;
            case "%":
                percent();
                break;
            case "+": case "-": case "×": case "÷":
                applyOperator(cmd);
                break;
            case "=":
                equals();
                break;
            default:
                break;
        }
    }

    private void inputDigit(String digit) {
        if (startNewNumber) {
            display.setText(digit);
            startNewNumber = false;
        } else {
            String cur = display.getText();
            display.setText(cur.equals("0") ? digit : cur + digit);
        }
    }

    private void inputDot() {
        if (startNewNumber) {
            display.setText("0.");
            startNewNumber = false;
        } else if (!display.getText().contains(".")) {
            display.setText(display.getText() + ".");
        }
    }

    private void clear() {
        accumulator = 0;
        pendingOp = null;
        startNewNumber = true;
        display.setText("0");
    }

    private void backspace() {
        if (startNewNumber) return;
        String cur = display.getText();
        if (cur.length() <= 1 || (cur.length() == 2 && cur.startsWith("-"))) {
            display.setText("0");
            startNewNumber = true;
        } else {
            display.setText(cur.substring(0, cur.length() - 1));
        }
    }

    private void toggleSign() {
        String cur = display.getText();
        if (cur.equals("0") || cur.equals("0.")) return;
        display.setText(cur.startsWith("-") ? cur.substring(1) : "-" + cur);
    }

    private void percent() {
        display.setText(format(currentValue() / 100.0));
        startNewNumber = true;
    }

    private void applyOperator(String op) {
        if (pendingOp != null && !startNewNumber) {
            // Chain operations: evaluate what we have so far first.
            equals();
        } else {
            accumulator = currentValue();
        }
        pendingOp = op;
        startNewNumber = true;
    }

    private void equals() {
        if (pendingOp == null) return;
        double rhs = currentValue();
        double result;
        switch (pendingOp) {
            case "+": result = accumulator + rhs; break;
            case "-": result = accumulator - rhs; break;
            case "×": result = accumulator * rhs; break;
            case "÷":
                if (rhs == 0) {
                    display.setText("Error");
                    accumulator = 0;
                    pendingOp = null;
                    startNewNumber = true;
                    return;
                }
                result = accumulator / rhs;
                break;
            default: return;
        }
        accumulator = result;
        display.setText(format(result));
        pendingOp = null;
        startNewNumber = true;
    }

    private double currentValue() {
        try {
            return Double.parseDouble(display.getText());
        } catch (NumberFormatException ex) {
            return 0;
        }
    }

    /** Formats a result, dropping the trailing ".0" for whole numbers. */
    private String format(double value) {
        if (value == Math.rint(value) && !Double.isInfinite(value)) {
            return Long.toString((long) value);
        }
        return Double.toString(value);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new Calculator().setVisible(true));
    }
}
