package com.codersbuffet.dsa;


import java.util.ArrayList;
import java.util.List;

public class GreyCode {

    public static int max_bin_length;

    public static String getInstanceToPadString(int currentInt) {
        int requiredLength = max_bin_length - Integer.toBinaryString(currentInt).length() - 1;
        StringBuilder s = new StringBuilder();
        for (int i = 0; i < requiredLength; i++) {
            s.append("0");
        }
        return s.toString();
    }

    public static void printGreyCode(int n) {
        max_bin_length = Integer.toBinaryString((int) Math.pow(2, n - 1)).length();
        String append = "";
        String zero = "0";
        String one = "1";

        if(n!=1) {
            for (int i = 0; i < Math.pow(2, n - 1); i++) {
                append = getInstanceToPadString(i);
                System.out.println(zero + append + Integer.toBinaryString(i));
            }

            for (int i = 0; i < Math.pow(2, n - 1); i++) {
                append = getInstanceToPadString(i);
                System.out.println(one + append + Integer.toBinaryString(i));
            }
        }
        else {
            System.out.println("0 1");
            List<Integer> list =new  ArrayList<>();
            String s="123";
        }
    }

    public static void main(String[] args) {
        printGreyCode(4);
    }
}
