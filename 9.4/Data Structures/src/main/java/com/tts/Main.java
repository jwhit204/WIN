package com.tts;

import java.sql.SQLOutput;
import java.util.*;

public class Main {

    public static void main(String[] args) {

        String[] fruitArray = {"orange", "apple", "dragonfruit"};
        int[] intArray;
        boolean[] boolArray;

        System.out.println("==== Arrays ====");
        System.out.println("Element at index 1: " + fruitArray[1]);
        System.out.println("Length of fruitArray:" +fruitArray.length);

        System.out.println("==== Collections ====");


        List<String> stringList = new ArrayList<>();
        List<String> stringLinkedList = new LinkedList<>();
        List<String> stringVector = new Vector<>();
        List<String> stringStack = new Stack<>();

        stringList.add("dog");
        stringList.add("house");
        stringList.add("cell phone");

        //    {dog, house, cell phone}

        stringList.add(1, "cat");

        //    {dog, cat, house, cell phone}

        System.out.println("The element at index 0: " + stringList.get(2));

        stringList.remove(0);
        System.out.println("This is the size of my list: " +stringList.size());

        //this is completely remove all  elements from  your list
//        stringList.clear();


        Collections.reverse(stringList);
        System.out.println("Here is my list reversed: " + stringList);

        System.out.println("==== String Conversion ====");

        String myString = "I really love ice cream";
        // then I  take my string and split it at every whitespace
        // and turn it into a regular array
        String[] strArr = myString.split(" ");

        // setting up  arrayList and making the value
        // that of the strArr
        List<String> splitList = new ArrayList<>();
        splitList = Arrays.asList(strArr);

        System.out.println(splitList);

        List<String> carList = Arrays.asList("BMW", "Honda",  "Audi");
        Object[] carArr = carList.toArray();
        String carString = Arrays.toString(carArr);

        System.out.println(carString.replace("[",  "")
        .replace("]","")
        .replace(",", " "));

        System.out.println("====  Hashmap ====");

        HashMap<String,  Integer> personMap  =  new HashMap<>();

        personMap.put("Mary",  37);
        personMap.put("Bob",  21);
        personMap.put("Susan", 63);

        System.out.println(personMap);
        System.out.println("This is the value associated with Mary:" + personMap.get("Mary"));
        System.out.println(personMap.keySet());

        for (String i  :personMap.keySet()) {
            System.out.println("key: " + i + "\tvalue: " + personMap.get(i));
        }

        personMap.remove("Bob");
        System.out.println("Is Bob in my map?" + personMap.containsKey("Bob"));

        System.out.println("==== Iterating ====");

        List<String> fruitList = Arrays.asList("plum",  "grape", "fiji apple");

        // this is referred to as an enhanced for loop
        // enhanced for loops are strictly used for collection
        // String fruit represents any  given element in  our fruitList collection
        for (String  fruit :  fruitList) {
            System.out.println("Here is one of my fruits: " + fruit);
        }

        fruitList.forEach((fruit) -> System.out.println(fruit));
        fruitList.forEach(System.out::println);
//        line 101 is known as a method reference


        System.out.println("==== LinkedList ====");

        LinkedList<String> animalList = new LinkedList<String>();
        animalList.add("frog");
        animalList.add("giraffe");
        animalList.add("buffalo");
        animalList.add("mongoose");
        System.out.println(animalList);

        animalList.addFirst("shark");
        System.out.println(animalList);

        animalList.set(1, "emu");
        System.out.println(animalList);

        System.out.println("==== Queues ====");
        Queue<Integer> myQueue = new LinkedList<>();

//        add elements {5,6,7,8, 9} to queue
        for(int i=5;  i<10; i++){
            myQueue.add(i);
        }

        myQueue.add(12);

        System.out.println("Elements of queue: " + myQueue);

        int removedHead = myQueue.remove();
        System.out.println("removed element of myQueue: " + removedHead);

        System.out.println(myQueue);

//      To  view the head of queue
        int head = myQueue.peek();
        System.out.println("head of queue: " + head);

        int size = myQueue.size();
        System.out.println("Size of the queue: " + size);

        System.out.println("\n==== Stacks ====");

        Stack <Integer> myStack = new Stack<Integer>();
        myStack.push(1);
        myStack.push(2);
        myStack.push(3);
        myStack.push(4);

        System.out.println(myStack);

        //remove from a stack
        myStack.pop();
        System.out.println(myStack);

        //Queues:  First In, First Out
        //Stack: Last In, First Out

        int peek = myStack.peek();
        System.out.println(myStack);

        boolean empty = myStack.empty();
        System.out.println(empty);









    }

}
