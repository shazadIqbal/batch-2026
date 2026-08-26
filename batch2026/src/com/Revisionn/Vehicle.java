//package com.Revisionn;
//
//import java.util.Objects;
//
//public class Vehicle {
//
//    private String name;
//    private Integer modelYear;
//
//    public Vehicle() {
//    }
//
//    public Vehicle(String name, Integer modelYear) {
//        this.name = name;
//        this.modelYear = modelYear;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public Integer getModelYear() {
//        if(modelYear)
//        return modelYear;
//    }
//
//    public void setModelYear(Integer modelYear) {
//        this.modelYear = modelYear;
//    }
//
//    @Override
//    public boolean equals(Object o) {
//        if (o == null || getClass() != o.getClass()) return false;
//        Vehicle vehicle = (Vehicle) o;
//        return Objects.equals(name, vehicle.name) && Objects.equals(modelYear, vehicle.modelYear);
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(name, modelYear);
//    }
//
//    public void display(){
//        System.out.println("Vehicle is displayed");
//    }
//
//    @Override
//    public String toString() {
//        return "Vehicle{" +
//                "name='" + name + '\'' +
//                ", modelYear=" + modelYear +
//                '}';
//    }
//}
