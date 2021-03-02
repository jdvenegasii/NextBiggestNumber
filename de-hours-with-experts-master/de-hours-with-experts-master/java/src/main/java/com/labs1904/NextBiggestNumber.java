package com.labs1904;

import java.util.Arrays;

public class NextBiggestNumber {

    public static void main(String[] args) {
        Integer input = Integer.parseInt(args[0]);
        Integer nextBiggestNumber = getNextBiggestNumber(input);
        System.out.println("Input: " + input);
        System.out.println("Next biggest number: " + nextBiggestNumber);
    }


    public static int getNextBiggestNumber(Integer i) {
        //TODO: IMPLEMENT ME!

        //Step 1: Turn input integer into a string so that it may be loaded into a char[] to
        //        be sorted for comparison to NextBiggestNumber candidates later
        String number = String.valueOf(i);
        char[] chars = number.toCharArray();
        Arrays.sort(chars);

        //Step 2: Create an int[] of largest numbers per number of digits, find the length of
        //        input, pull the corresponding number from int[] and declare it the max.
        //        The max could just be hardcoded to max value of an Int but this saves time.
        int[] maxArray = {99, 999, 9999, 99999, 999999, 9999999, 99999999,999999999, 2147483647};
        int length = number.length();
        int max = maxArray[length-2];

        //Step 3: Create a second int temp, that is your input + 1. Turn it into a string, load
        //        it into a char[] and sort it. Compare it to the original sorted char[]. If it's
        //        equal, return temp. If not equal, add one and repeat until you reach max
        //        which would return -1.
        int temp;
        for (temp = i + 1; temp < max; temp++){
                String number2 = String.valueOf(temp);
                char[] chars2 = number2.toCharArray();
                Arrays.sort(chars2);

                if(Arrays.equals(chars, chars2)) { break; }
        }
        if (temp == max) {return -1;}
        else{return temp;}
    }
}

