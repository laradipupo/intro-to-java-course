package com.cbfacademy;

import java.util.*;

public class CollectionsExercises {

    public LinkedList<Integer> useLinkedList() {
        LinkedList<Integer> integers = new LinkedList<>();//create an empty linked list
        integers.add(4);//  - add 4 as the first element of the list
        integers.add(5);
        integers.add(6);
        integers.add(8);
        integers.add(2);
        integers.add(9);//  - then add 5, 6, 8, 2, 9 to the list
        integers.addLast(2);//  - add another 2 as the last element of the list
        integers.add(2, 4);//  - add 4 as the 3rd element of the list
        System.out.print(integers.element());//  - invoke the method element() on the list and print the result on the screen
        return integers;//  - return the list
    }

    public Stack<Integer> useStack() {
        Stack<Integer> integers = new Stack<>();// TODO: create an empty stack
        integers.add(5);
        integers.add(6);
        integers.add(8);
        integers.add(9);//  - add 5, 6, 8, 9 to the stack
        System.out.println(integers.firstElement());//  - print the first element of the stack on the screen
        System.out.println(integers.lastElement());//  - print the last element of the stack on the screen
        System.out.println(integers.pop());//  - invoke the method pop() on the stack and print the result on the screen
        integers.push(4);//  - invoke the push(4) method on the stack
        return integers;//  - return the stack
    }

    public ArrayDeque<Integer> useArrayDeque() {
        ArrayDeque<Integer> integers = new ArrayDeque<>();// TODO: create an empty arrayDeque
        integers.add(5);
        integers.add(6);
        integers.add(8);
        integers.add(9);//  - add 5, 6, 8, 9 to the queue
        System.out.println(integers.getFirst());//  - print the first element of the queue on the screen
        System.out.println(integers.getLast());//  - print the last element of the queue on the screen
        System.out.println(integers.poll());//  - invoke the method poll() on the queue and print the result on the screen
        System.out.println(integers.element());//  - invoke the element() method on the queue and print the result on the screen
        return integers;//  - return the queue
    }

    public HashMap<Integer, String> useHashMap() {
        // Hashmap<Integer, String> integers = new Hashmaps<>();
        // TODO: create an empty hash map
        //  - add {1, TypeScript} entry to the map
        //  - add {2, Kotlin} entry to the map
        //  - add {3, Python} entry to the map
        //  - add {4, Java} entry to the map
        //  - add {5, JavaScript} entry to the map
        //  - add {6, Rust} entry to the map
        //  - determine the set of keys from the map and print it on the screen
        //  - determine the set of values from the map and print it on the screen
        //  - determine whether the map contains "English" as a language and print the result on the screen
        //  - return the map
        throw new RuntimeException("Not implemented");
    }

    public String getName() {
        return "Collections Exercises";
    }
}
