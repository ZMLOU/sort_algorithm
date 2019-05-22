package com.tech.queue;

public class ArrayQueue<E> implements Queue<E> {
    private Object[] arr;
    private int head;
    private int tail ;
    public ArrayQueue(int maxSize) {
     arr = new Object[maxSize];
    }

    @Override
    public void enQueue(Object o) {
        if(tail == arr.length){
            if(head == 0){
                System.err.println("队列已满");
                return;
            }else {
                for(int i = head; i < tail;i++){
                    arr[i - head] = arr[i];
                }
                tail = tail - head;
                head = 0;
            }
        }
        arr[tail++] = o;
    }

    @Override
    public E deQueue() {
        if(isEmpty()){
            System.err.println("队列已空");
            return null;
        }
        return (E)arr[head++];
    }

    @Override
    public E peek() {
        return (E)arr[head];//2 2 3 4 5
    }

    @Override
    public int getSize() {
        return tail - head;
    }

    @Override
    public boolean isEmpty() {
        return getSize() == 0;
    }
}
