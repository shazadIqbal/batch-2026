package comparing;

public class Card {
    private String name;
    private Integer Id;
    private Integer ccv;
    private Integer expirydate;

    public Card(String name, Integer id, Integer ccv, Integer expirydate) {
        this.name = name;
        Id = id;
        this.ccv = ccv;
        this.expirydate = expirydate;
    }

    public String getName() {
        return name;
    }

    public Integer getId() {
        return Id;
    }

    public Integer getCcv() {
        return ccv;
    }

    public Integer getExpirydate() {
        return expirydate;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public void setCcv(Integer ccv) {
        this.ccv = ccv;
    }

    public void setExpirydate(Integer expirydate) {
        this.expirydate = expirydate;
    }

    @Override
    public String toString() {
        return "Card{" +
                "name='" + name + '\'' +
                ", Id=" + Id +
                ", ccv=" + ccv +
                ", expirydate=" + expirydate +
                '}';
    }
}
