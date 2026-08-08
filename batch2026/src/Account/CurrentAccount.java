package Account;

public class CurrentAccount extends Account{

    public CurrentAccount() {
        System.out.println("In child constructor");
    }

    public CurrentAccount(String title, Integer number, Double balance) {
        super(title, number, balance);
    }

    @Override
    public boolean withdraw (Double amount) {
        boolean result = super.withdraw(amount);

        if (result) {
            setBalance(getBalance() - 2.0);
            return true;
        }
        return false;
    }

    @Override
    public Double getProfitRate() {
        return 0.0;
    }
}
