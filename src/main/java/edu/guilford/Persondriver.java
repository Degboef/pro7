package edu.guilford;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

public class Persondriver {

    public static void main(String[] args) {

        final int NUM_ELEMENTS = 100000;
        ArrayList<Person> arrayList = new ArrayList<Person>();

        long startTime = System.nanoTime();
        for (int i = 0; i < NUM_ELEMENTS; i++) {
            arrayList.add(new Person());
        }
        long endTime = System.nanoTime();
        long duration = endTime - startTime;
        System.out.println("Time taken to add elements to the ArrayList: " + duration + " nanoseconds");

        // Sort the ArrayList
        startTime = System.nanoTime();
        Collections.sort(arrayList);
        endTime = System.nanoTime();
        duration = endTime - startTime;
        System.out.println("Time taken to sort elements in the ArrayList: " + duration + " nanoseconds");

        startTime = System.nanoTime();
        Collections.shuffle(arrayList);
        endTime = System.nanoTime();
        duration = endTime - startTime;
        System.out.println("Time taken to shuffle elements in the ArrayList: " + duration + " nanoseconds");

        // Get a random element from both lists 1,000,000 times
        startTime = System.nanoTime();
        for (int i = 0; i < 1000000; i++) {
            int index = (int) (Math.random() * NUM_ELEMENTS);
            Person p = arrayList.get(index);
        }
        endTime = System.nanoTime();
        duration = endTime - startTime;
        System.out.println("Time taken to get random elements from the ArrayList: " + duration + " nanoseconds");

        // get the elements sequentially from the arraylist
        startTime = System.nanoTime();
        for (int i = 0; i < NUM_ELEMENTS; i++) {
            Person p = arrayList.get(i);
        }
        endTime = System.nanoTime();
        duration = endTime - startTime;
        System.out.println("Time taken to get sequential elements from ArrayList: " + duration + " nanoseconds");

        LinkedList<Person> linkedList = new LinkedList<Person>();

        // Add elements to both lists

        startTime = System.nanoTime();
        for (int i = 0; i < NUM_ELEMENTS; i++) {
            linkedList.add(new Person());
        }
        endTime = System.nanoTime();
        duration = endTime - startTime;
        System.out.println("Time taken to add elements to the LinkedList: " + duration + " nanoseconds");

        // sort the linkedlist
        startTime = System.nanoTime();
        Collections.sort(linkedList);
        endTime = System.nanoTime();
        duration = endTime - startTime;
        System.out.println("Time taken to sort elements the LinkedList: " + duration + " nanoseconds");

        // Shuffle both lists

        startTime = System.nanoTime();
        Collections.shuffle(linkedList);
        endTime = System.nanoTime();
        duration = endTime - startTime;
        System.out.println("Time taken to shuffle elements in the LinkedList: " + duration + " nanoseconds");

        startTime = System.nanoTime();
        for (int i = 0; i < 1000000; i++) {
            int index = (int) (Math.random() * NUM_ELEMENTS);
            Person p = linkedList.get(index);
        }
        endTime = System.nanoTime();
        duration = endTime - startTime;
        System.out.println("Time taken to get random elements from the linkedlist: " + duration + " nanoseconds");

        // get the elements sequentially from the linkedlist
        startTime = System.nanoTime();
        for (int i = 0; i < NUM_ELEMENTS; i++) {
            Person p = linkedList.get(i);
        }
        endTime = System.nanoTime();
        duration = endTime - startTime;
        System.out.println("Time taken to get sequential elements from linkedlist: " + duration + " nanoseconds");
    }
}
