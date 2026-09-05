public class Bank {
    String location;
    Integer numOfAccounts;
    Integer numOfEmployees;

    public Bank(String location, Integer numOfAccounts, Integer numOfEmployees) {
        this.location = location;
        this.numOfAccounts = numOfAccounts;
        this.numOfEmployees = numOfEmployees;
    }

    public Bank(String location, Integer numOfAccounts){
        this.location = location;
        this.numOfAccounts = numOfAccounts;
    }
    public Bank(String location){
        this.location = location;
    }
    public Bank(Integer numOfAccounts) {
        this.numOfAccounts = numOfAccounts;
    }
    public Bank(){

    }


    @Override
    public String toString() {
        return "Habib{" +
                "location='" + location + '\'' +
                ", numOfAccounts=" + numOfAccounts +
                '}';
    }

}
