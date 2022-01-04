package com.codersbuffet.dsa;

import java.util.*;

public class IntuitMain {

    public static List<Double> listOfElements = new ArrayList<>();

    public static int getIndex(Double d) {
        if (listOfElements.size() == 0)
            return 0;

        int l = 0;
        int h = listOfElements.size() - 1;

        while (l <= h) {
            int mid = (l + h) / 2;
            if (listOfElements.get(mid) > d) {
                h = mid - 1;

            } else {
                l = mid + 1;
            }
        }

        return l;

    }

    public static double getMedian() {
        Collections.sort(listOfElements);
        int mid = listOfElements.size() / 2;
        if (listOfElements.size() % 2 == 0) {

            return (listOfElements.get(mid) + listOfElements.get(mid - 1)) / 2;
        } else {
            HashSet<Integer> h = new HashSet<>();
            h.add(null);
            return listOfElements.get(mid);
        }

    }

    public static void updateMedian(Double d) {
        int i = getIndex(d);
        listOfElements.add(i, d);

    }


    public static void getColumnName(int i) {


        //map (1, a) (2,b)
        int a = i / 26;
        int b = i % 26;


    }


    public static int[] toffe(int input1, int input2) {

        int[] finalDist = new int[input2];
        Arrays.fill(finalDist, 0);
        int rotationCounter = 0;
        int remainingCandies = input1;
        int i = 0;
        while (remainingCandies > 0) {
            if (i >= input2) {
                i = 0;
                rotationCounter = input2;
            }
            if (remainingCandies >= rotationCounter + i + 1) {
                finalDist[i] = finalDist[i] + rotationCounter + i + 1;
                remainingCandies = remainingCandies - (rotationCounter + i + 1);
            } else {
                finalDist[i] = finalDist[i] + remainingCandies;
                remainingCandies = 0;
            }

            i++;
        }

        return finalDist;
    }


    public static void main(String[] args) {
        System.out.println(toffe(8,2));
    }
}
