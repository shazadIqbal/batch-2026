package Account;

public class SavingAccount extends Account{

    public SavingAccount() {
    }

    public SavingAccount(String title, Integer number, Double balance) {
        super(title, number, balance);
    }

    @Override
    public boolean withdraw(Double amount) {
        if (super.withdraw(amount)) {
            setBalance(getBalance() - (amount * 0.1));
            return true;
        }
        return false;
    }

    @Override
    public Double getProfitRate() {
        return 0.6;
    }

    public void monthlyProfit () {
        setBalance(getBalance()*0.60);
    }
}
