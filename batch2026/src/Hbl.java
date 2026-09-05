public class Hbl {
    String location;
    Integer numOfAccounts;




    public Hbl(String location, Integer numOfAccounts){
        this.location = location;
        this.numOfAccounts = numOfAccounts;
    }
    @Override
    public String toString() {
        return "Habib{" +
                "location='" + location + '\'' +
                ", numOfAccounts=" + numOfAccounts +
                '}';
    }

}

