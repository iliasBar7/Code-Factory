package gr.aueb.cf.exarrays;

import java.util.Arrays;

/**
 *
 */

public class SecondSmallValueOfArray {
    public static void main(String[] args) {

        int arr[] = {111, 13, 25, 9, 34, 1};
        int n = arr.length;



        // sorting the array using
        // in-built sort function
        Arrays.sort(arr);


        // printing the desired element
        System.out.println("smallest element is " + arr[0]);
        System.out.println("second smallest element is "
                + arr[1]);


    }
}


