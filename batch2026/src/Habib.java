public class Habib {

    String location;
    Integer numOfAccounts;




    public Habib(String location, Integer numOfAccounts){
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