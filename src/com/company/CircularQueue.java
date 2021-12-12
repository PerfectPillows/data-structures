package com.company;

public class CircularQueue <T> {

    private T[] arr;
    private int len = 0;
    private int capacity = 0;
    private int front,rear;

    public CircularQueue() {
        this(16);
    }

    public CircularQueue(int capacity){
        this.capacity = capacity;
        arr = (T[]) new Object[capacity];
        this.front = -1;
        this.rear = -1;

    }

    public int size() {
        return len;
    }



    public boolean isEmpty() {
        return size() == 0;
    }

    public boolean isFull() {
        return (rear + 1) % capacity == front;
    }

    private void resize(){
        int k = 0;
        if ( capacity == 0 ) capacity = 1;
        else capacity *= 2;
        T[] new_arr = (T[]) new Object[capacity];
        for( int i = front; i <= rear;i++){
            if(i == arr.length - 1 && rear < front) i = 0;
            new_arr[k++] = arr[i];
        }

        arr = new_arr;
        front = 0;
        rear = k;
    }


    public void enqueue(T elem){
        //check if the size == capacity
        //if size is  capacity double the capacity
        if(isFull()) {
            resize();
        }
        if(isEmpty()){
            front = 0;
        }

        rear = (rear + 1) % capacity;
        len++;
        arr[rear] = elem;
    }


    public T dequeue(){
        if(isEmpty()) throw new RuntimeException("Queue is empty");
        T value = arr[front];

        front = (front + 1) % capacity;
        len--;

        if(front == rear) {
            front = -1;
            rear = -1;
        }

        return value;

    }

    public T Front() {
        if (isEmpty() == true) {
            throw new RuntimeException("Queue is empty");
        }
        return arr[front];
    }

    /** Get the last item from the queue. */
    public T Rear() {
        if (isEmpty() == true) {
            throw new RuntimeException("Queue is empty");
        }
        return arr[rear];
    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for( int i = front; i <= rear;i++){
            if(i == arr.length - 1 && rear < front) i = 0;
            sb.append(arr[i] + ",");
        }

        sb.append("]");

        return sb.toString();
    }

}
