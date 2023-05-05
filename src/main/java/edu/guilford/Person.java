package edu.guilford;

import java.util.Random;

public class Person implements Comparable<Person> {
    private String name;
    private int age;
    private String address;

    public Person() {
        Random rand = new Random();
        this.name = "Person " + rand.nextInt(1000);
        this.age = rand.nextInt(100);
        this.address = "Address " + rand.nextInt(1000);
    }

    // Getters and setters omitted for brevity

    @Override
    public int compareTo(Person other) {
        return this.name.compareTo(other.getName());
    }

    private String getName() {
        return null;
    }
}
