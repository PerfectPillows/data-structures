package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        CircularQueue<Integer> list = new CircularQueue<Integer>(3);

        list.enqueue(5);
        list.enqueue(8);
        list.enqueue(10);
        System.out.println("FRONT : " + list.Front());
        System.out.println("REAR : " + list.Rear());
        System.out.println(list.toString());
        list.enqueue(15);
        System.out.println(list.dequeue());
        System.out.println("FRONT : " + list.Front());
        System.out.println("REAR : " + list.Rear());
        System.out.println(list.toString());

    }
}
