package gr.aueb.cf.exarrays;

/**
 * Finds the second value of an array ,
 * the next max value of the min value .
 */

public class SecondValueOfArray {
    public static void main(String[] args) {
        int minValue = 0 ;
        int maxValue = 4 ;

        int [] arr = {80,20,30,40,50};

        int maxPosition = getMaxPosition(arr,minValue,maxValue);

        System.out.println("The position of max value is  " + maxPosition);





    }

    public static int getMaxPosition (int[]arr, int low, int high) {
          if (arr == null || arr.length < 1) return  -1;
          if (low < 0 ||  high > arr.length -1) return -1;
          if (low > high) return -1;

          int maxPosition = high;
          int maxValue = arr[high];

          for (int i = low; i <= high; i++ ) {
              if (arr[i] > maxValue ) {
                  maxPosition = i ;
                  maxValue = arr[i];

              }
          }
          return maxPosition;



    }


}
