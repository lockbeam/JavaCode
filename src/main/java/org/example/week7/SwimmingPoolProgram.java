package org.example.week7;

public class SwimmingPoolProgram {
    public static void main(String[] args) {

        Pool ymca = new Pool("YMCA", 50); //needs the two defined when creating the object in Pool

        double totalSwam = ymca.distanceForLaps(6); // can call method from pool object and
        System.out.println("The total distance is " + totalSwam + " meters");

        Pool como = new Pool("Como Park", 25);
        System.out.println(como.distanceForLaps(12));

        System.out.println(como);

        Pool edina = new Pool("Edina", 50);
        double distance = edina.distanceForLaps(12);
        System.out.println(distance);
        System.out.println(edina);

    }
}
