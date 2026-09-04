package com.revision;

import org.jetbrains.annotations.NotNull;

import java.util.Objects;

public class Student1 implements Comparable <Student1>{
    private String name;
    private Gender gender;

    public Student1(String name, Gender gender) {
        this.name = name;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Student1 student1 = (Student1) o;
        return Objects.equals(name, student1.name) && gender == student1.gender;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, gender);
    }

    @Override
    public String toString() {
        return "Student1{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                '}';
    }

    @Override
    public int compareTo(@NotNull Student1 o) {
        return this.name.compareTo(o.getName());
    }
}
