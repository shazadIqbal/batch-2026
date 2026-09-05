package cinema;

import java.util.Objects;

public class Customer {
    private String name;
    private Integer id;
    private String phoneNum;

    public Customer() {
    }

    public Customer(String name, Integer id, String phoneNum) {
        this.name = name;
        this.id = id;
        this.phoneNum = phoneNum;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Customer customer = (Customer) o;
        return Objects.equals(name, customer.name) && Objects.equals(id, customer.id) && Objects.equals(phoneNum, customer.phoneNum);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, id, phoneNum);
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", phoneNum=" + phoneNum +
                '}';
    }
}
