package org.example.week7;

public class Pool {

    private String name; //field or variable
    private double length; // another field
    private String address;
    private double maxDepth;

    //constructor example:
    public Pool(String name, double length) {
        this.name = name;
        this.length = length;
    }


    // instance method
    // instance is another word for an object
    // an instance of a class
    // a Pool object is an instance of the Pool class
    public double distanceForLaps(int laps) {
        // x number of laps of length y returns total
        double total = laps * this.length;
        return total;
    }

    @Override
    public String toString() {
        String description = this.name + " pool is " + this.length + " meters long.";
        return description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        if (length < 0 || length > 1000) {
            System.out.println("Not a recordable length");
            return;
        }
        this.length = length;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getMaxDepth() {
        return maxDepth;
    }

    public void setMaxDepth(double maxDepth) {
        this.maxDepth = maxDepth;
    }
}
