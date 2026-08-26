package Revision;

public class Car extends Vehcile{

    String name;
    Integer model;

    public Car(String name, Integer model) {
        this.name = name;
        this.model = model;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getModel() {
        return model;
    }

    public void setModel(Integer model) {
        this.model = model;
    }

    public Car(String name, Integer modelYear, String name1, Integer model) {
        super(name, modelYear);
        this.name = name1;
        this.model = model;
    }
}
