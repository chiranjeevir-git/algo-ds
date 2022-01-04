package com.codersbuffet.dsa;

import javax.swing.plaf.IconUIResource;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Set;

public class IntegerWithEvenOccurrence {
    public static void main(String[] args) {

        int[] arr = {20, 40, 50, 40, 50, 20, 30, 30, 50, 20, 40, 40, 20};
//20 20 20 20 30 30 40 40 40 40 50 50 50
        //Arrays.sort(arr);
        HashMap<Integer, Integer> map = new HashMap<>();
        int count;
        for (int j : arr) {
            //int count = map.get(arr[i]);
            if (map.get(j) != null) {
                count = map.get(j);
                map.put(j, count + 1);
            } else {
                map.put(j, 1);
            }

        }

        map.forEach((num, occurence) -> {
            if (occurence % 2 == 1)
                System.out.println(num);
        });

    }
}
