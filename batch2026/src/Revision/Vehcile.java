package Revision;

import java.util.Objects;

public class Vehcile {

    String name;
    Integer modelYear;


    public Vehcile () {

    }
    public Vehcile(String name, Integer modelYear) {
        this.name = name;
        this.modelYear = modelYear;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getModelYear() {
        if (modelYear>0){
            this.modelYear = modelYear;
        } else
            System.out.println("Enter valid number");

        return 0;
    }

    public void setModelYear(Integer modelYear) {
        this.modelYear = modelYear;
    }

    public void display () {
        System.out.println("Vechile is displayed");
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Vehcile vehcile = (Vehcile) o;
        return Objects.equals(name, vehcile.name) && Objects.equals(modelYear, vehcile.modelYear);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, modelYear);
    }

    @Override
    public String toString() {
        return "Vehcile{" +
                "name='" + name + '\'' +
                ", modelYear=" + modelYear +
                '}';
    }
}
