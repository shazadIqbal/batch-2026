package sets;

import java.util.Objects;

public class Plane implements Comparable<Plane> {
    private String name;

    public Plane() {
    }

    public Plane(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Plane plane = (Plane) o;
        return Objects.equals(name, plane.name);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(name);
    }

    @Override
    public String toString() {
        return "Plane{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    public int compareTo(Plane o) {
        return 0;
    }
}
