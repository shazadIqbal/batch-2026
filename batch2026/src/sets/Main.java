package sets;

import java.util.*;

public class Main {
    public static void main(String[] args) {


    Set<Plane> planes = new HashSet<>();

    planes.add(new Plane("737"));
    planes.add(new Plane("747"));
    planes.add(new Plane("767"));
    planes.add(new Plane("837"));
        planes.add(new Plane("737"));

        System.out.println(planes);
        System.out.println();

    List<Plane> planesList = new ArrayList<>();

    planesList.add(new Plane("737"));
    planesList.add(new Plane("747"));
    planesList.add(new Plane("767"));
    planesList.add(new Plane("837"));
        planesList.add(new Plane("737"));

        System.out.println(planes);
        System.out.println();

    Set<Plane> planesTree = new TreeSet<>();

    planesTree.add(new Plane("737"));
    planesTree.add(new Plane("747"));
    planesTree.add(new Plane("767"));
    planesTree.add(new Plane("837"));
        planesTree.add(new Plane("737"));

        System.out.println(planes);
        System.out.println();
    }
}