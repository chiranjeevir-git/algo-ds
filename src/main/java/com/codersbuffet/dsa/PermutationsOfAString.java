package com.codersbuffet.dsa;

public class PermutationsOfAString {

    public static void permute(int index, char[] array) {
        if (index == array.length) {
            for (char c : array) {
                System.out.print(c);
            }
            System.out.println();
        }
        for (int i = index; i < array.length; i++) {
            swap(i, index, array);
            permute(index + 1, array);
            swap(i, index, array);
        }
    }

    public static void swap(int index1, int index2, char[] array) {
        char temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }

    public static void main(String[] args) {

        String input = "abcdefgh";
        char[] charArray = input.toCharArray();
        permute(0, charArray);

    }
}
