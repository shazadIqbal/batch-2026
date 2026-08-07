package Account;

public class Account {

    private String title;
    private Integer number;
    private Double balance;

    public Account() {
    }

    public Account(String title, Integer number, Double balance) {
        this.title = title;
        this.number = number;
        this.balance = balance;
    }

    public void deposit(Double amount) {
        if(amount>0) {
            this.balance +=amount;
        }
        System.out.println("Incorrect Amount");
    }

    public boolean withdraw(Double amount){
        if (amount < this.balance && amount > 0 ) {
            this.balance -=amount;
            return true;
        }
        System.out.println("Insufficient Balance");
        return false;
    }

    public Double getProfitRate() {
        return 0.5;

    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public Integer getNumber() {
        return number;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }
}


