package com.codersbuffet.watermanagement;

import java.util.*;

class  A{
public void  m1(){

}

}

class B extends  A {

    public void m1() {
        List<Integer> c= new ArrayList<Integer>();

        System.out.println("child");
    }
}

class Animal{

}

class Dog extends  Animal{

}
public class ConstructorTest {
    public static void addDogs(List<? super Animal> list) {
        list.add(new Dog());
    }



    public static void main(String[] args) {
        PriorityQueue<Integer> p = new PriorityQueue<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(1,1);

A a = new B();
a.m1();
     }
}
