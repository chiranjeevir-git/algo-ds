package com.codersbuffet.dsa.searching;

public class SearchingAlgoIterative {

    public void binarySearch(int[] inputArray, int searchValue) {

        int low = 0, mid = 0, high = inputArray.length - 1;

        while (low <= high) {

            mid = (low + high) / 2;

            if (inputArray[mid] == searchValue) {
                System.out.println(mid);
                return;
            }

            if (searchValue < inputArray[mid]) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }


    }

}
