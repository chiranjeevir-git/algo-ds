package com.codersbuffet.dsa;

public class Palindrome {
    public  static void nextPalindrome(int value){
        String stringValue = Integer.toString(value);
        int stringValueLength = stringValue.length();
        StringBuilder stringBuilder = new StringBuilder();
        String leftPart = stringValue.substring(0,stringValueLength/2);
        if(stringValueLength%2==1){
            String remaining = stringValue.substring(0,stringValueLength/2+1);
            String palString = remaining+stringBuilder.append(leftPart).reverse();
            int pal = Integer.parseInt(palString);
            if(pal>value)
                System.out.println(pal);
            else {
                stringBuilder.setLength(0);
                stringBuilder.append(palString).setCharAt(stringValueLength/2, (char) (palString.charAt(stringValueLength/2)+1));
                System.out.println(stringBuilder);
            }
        }else{
            String remaining = stringValue.substring(0,stringValueLength/2);
            String palString = remaining+stringBuilder.append(leftPart).reverse();
            int pal = Integer.parseInt(palString);

            if(pal<value) {

                stringBuilder.setLength(0);
                stringBuilder.append(palString).setCharAt(stringValueLength / 2, (char) (palString.charAt(stringValueLength / 2) + 1));
                stringBuilder.setCharAt(stringValueLength / 2-1, (char) (palString.charAt(stringValueLength / 2-1) + 1));
                System.out.println(stringBuilder);
            }else {

                System.out.println(palString);
            }
        }

    }

//BruteForce code--

//    public static void isPalindromeBruteForce(int value){
//        while(true) {
//            StringBuilder stringBuilder = new StringBuilder();
//            String svalue = String.valueOf(value);
//            String rvalue = stringBuilder.append(svalue).reverse().toString();
//            if(svalue.equals(rvalue)){
//                System.out.println(rvalue);
//                break;
//            }
//            value++;
//        }
//    }

    public static void main(String[] args) {
        nextPalindrome(561);
        nextPalindrome(1234);
        nextPalindrome(123);

    }
}
