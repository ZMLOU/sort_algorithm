package com.tech.queue;

import java.sql.SQLOutput;
import java.sql.SQLType;

public class CircleLoopQueue<E> implements Queue<E> {
    private Object[] arr;
    private int head;
    private int tail ;
    private int size;
    public CircleLoopQueue(int maxSize) {
        arr = new Object[maxSize + 1];
    }

    @Override
    public void enQueue(Object o) {
        if((tail + 1) % arr.length == head){
            System.err.println("栈以满");
            return;
        }
        arr[tail] = o;
        tail = (tail + 1) % arr.length;
        size++;
    }

    @Override
    public E deQueue() {
        if(isEmpty()){
            System.err.println("栈已空");
            return null;
        }
        E temp = (E)arr[head];
        arr[head] = null;
        head = (head + 1) % arr.length;
        size--;
        System.out.println(head);
        return temp;
    }

    @Override
    public E peek() {
        if(isEmpty()){
            System.err.println("栈已空");
            return null;
        }
        return (E)arr[head];
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return head == tail;
    }
}
