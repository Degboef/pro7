package edu.guilford;

import java.util.Random;

public class Person implements Comparable<Person> {
    private String name;
    private int age;
    private String address;

    public Person() {
        Random rand = new Random();
        //create an array on names
        String[] names = {"John", "Mary", "Bob", "Sue", "Joe", "Jane", "Bill", "Anne", "Fred", "Jill"};
        this.name = names[rand.nextInt(names.length)];
        this.age = rand.nextInt(100);
        //create an array of addresses
        String[] addresses = {"123 Main St.", "456 Elm St.", "789 Oak St.", "321 Pine St.", "654 Maple St."};
        this.address = addresses[rand.nextInt(addresses.length)];
    }

    // Getters and setters 
    public String getName() {
        return this.name;
    }
    
    public int getAge() {
        return this.age;
    }

    public String getAddress() {
        return this.address;
    }



    //add a compare to method to compare the names of the people
    @Override
    public int compareTo(Person other) {
        return this.name.compareTo(other.getName());
    }


    // @Override
    // public int compareTo(Person other) {
    //     return this.name.compareTo(other.getName());
    // }

    // private String getName() {
    //     return null;
    // }
}
