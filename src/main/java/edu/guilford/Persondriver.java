package edu.guilford;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

public class Persondriver {
    public static final int NUM_ELEMENTS = 1000;

    public static void main(String[] args) {
        ArrayList<Person> arrayList = new ArrayList<Person>();
        LinkedList<Person> linkedList = new LinkedList<Person>();

        // Add elements to both lists
        long startTime = System.nanoTime();
        for (int i = 0; i < NUM_ELEMENTS; i++) {
            arrayList.add(new Person());
            linkedList.add(new Person());
        }
        long endTime = System.nanoTime();
        long duration = endTime - startTime;
        System.out.println("Time taken to add elements: " + duration + " nanoseconds");

        // Sort both lists
        startTime = System.nanoTime();
        Collections.sort(arrayList);
        Collections.sort(linkedList);
        endTime = System.nanoTime();
        duration = endTime - startTime;
        System.out.println("Time taken to sort elements: " + duration + " nanoseconds");

        // Shuffle both lists
        startTime = System.nanoTime();
        Collections.shuffle(arrayList);
        Collections.shuffle(linkedList);
        endTime = System.nanoTime();
        duration = endTime - startTime;
        System.out.println("Time taken to shuffle elements: " + duration + " nanoseconds");

        // Get a random element from both lists 1,000,000 times
        startTime = System.nanoTime();
        for (int i = 0; i < 1000000; i++) {
            int index = (int) (Math.random() * NUM_ELEMENTS);
            Person p = arrayList.get(index);
            p = linkedList.get(index);
        }
        endTime = System.nanoTime();
        duration = endTime - startTime;
        System.out.println("Time taken to get random elements: " + duration + " nanoseconds");

        // Get each element from both lists sequentially
        startTime = System.nanoTime();
        int i;
        for (Person p : arrayList) {
            p = arrayList.get(i);
        }
        for (Person p : linkedList) {
            p = linkedList.get(i);
        }
        endTime = System.nanoTime();
        duration = endTime - startTime;
        System.out.println("Time taken to get sequential elements: " + duration + " nanoseconds");
    }
}

