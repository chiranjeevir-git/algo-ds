package com.codersbuffet.dsa;


import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

class MyQueue<E> {
    private final int size;
    private final Queue<E> queue;
    private final ReentrantLock lock = new ReentrantLock();
    private final Condition notEmpty = lock.newCondition();
    private final Condition notFull = lock.newCondition();

    MyQueue(int size) {
        this.size = size;
        this.queue = new LinkedList<>();
    }

    void put(E element) {
        try {
            lock.lock();
            while (queue.size() == size) {
                try {
                    System.out.println("FULL");
                    notFull.await();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
            queue.add(element);
            notEmpty.signalAll();
        } finally {
            lock.unlock();
        }
    }

    E takeOut() {
        E element;
        try {
            lock.lock();
            while (queue.size() == 0) {
                try {
                    System.out.println("EMPTY");
                    notEmpty.await();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
            element = queue.remove();
            notFull.signalAll();

        } finally {
            lock.unlock();
        }

        return element;
    }

}

public class ProducerConsumerLocks {
    public static void main(String[] args) {
        MyQueue<Integer> myQueue = new MyQueue<>(1);
        Runnable producer = ()->{
            for(int i=0;i<100;i++) {
                myQueue.put(i);
                System.out.println("put "+i +" "+Thread.currentThread().getName());
            }
        };

        Runnable consumer = ()->{
            for(int i=0;i<200;i++) {
                Integer ele= myQueue.takeOut();
                System.out.println("takeout "+ele +" "+Thread.currentThread().getName());
            }
        };

        Thread t1 = new Thread(producer);
        Thread t2 = new Thread(consumer);

        t1.start();
        t2.start();
    }
}
