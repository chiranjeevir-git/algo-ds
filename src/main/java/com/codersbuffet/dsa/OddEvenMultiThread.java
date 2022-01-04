package com.codersbuffet.dsa;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class OddEvenMultiThread {
    public int n;
    public Object object = new Object();

    public void printOdd() {

        while (n > 0) {
            synchronized (this) {
                while (n % 2 == 0) {
                    try {
                        this.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println(n + " " + Thread.currentThread().getName());
                n--;
                notify();
            }
        }

    }

    public void printEven() {
        while (n > 0) {
            synchronized (this) {
                while (n % 2 == 1) {
                    try {
                        this.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println(n + " " + Thread.currentThread().getName());
                n--;
                notify();
            }
        }
    }

    public static void main(String[] args) {
        OddEvenMultiThread oddEvenMultiThread = new OddEvenMultiThread();
        oddEvenMultiThread.n = 100;
        Runnable r1 = oddEvenMultiThread::printEven;
        Runnable r2 = oddEvenMultiThread::printOdd;
        ExecutorService executorService = Executors.newCachedThreadPool();

        Thread t1 = new Thread(r1);
        Thread t2 = new Thread(r2);
        Queue<Integer> queue = new LinkedList<>();
        t1.start();
        t2.start();
    }
}