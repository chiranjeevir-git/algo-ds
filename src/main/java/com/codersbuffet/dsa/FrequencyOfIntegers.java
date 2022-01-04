package com.codersbuffet.dsa;

public class FrequencyOfIntegers {

    public static int getLeftMostPosition(int[] array, int target) {
        int low = 0, high = array.length, mid,leftMost = -1;

        while (low <= high) {
            mid = (low + high) / 2;

            if(array[mid]>target){
                high = mid-1;
            }else if(array[mid]<target){
                low = mid+1;
            }else{
                leftMost = mid;
                high = mid-1;
            }
        }
        return leftMost;
    }

    public static void main(String[] args) {
        int[] intArray = {1, 1,4,4,4, 4, 6};
        System.out.println(getLeftMostPosition(intArray, 5));
    }
}
