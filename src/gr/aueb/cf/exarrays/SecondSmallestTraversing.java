package gr.aueb.cf.exarrays;

public class SecondSmallestTraversing {
    public static void main(String[] args) {

        int []arr = {11,33,45,66,10};
        int secondSmallest;

        secondSmallest = arrSort(arr);

        System.out.println(secondSmallest);



    }

    public static int arrSort (int[]arr){
        int secondSmallest = Integer.MAX_VALUE;
        int smallest = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++){
            if (arr[i] < smallest) {
                secondSmallest = smallest;  // Το παλιό smallest γίνεται το δεύτερο μικρότερο
                smallest = arr[i];  // Ενημερώνουμε το smallest με το νέο μικρότερο στοιχείο
            }
            else if (arr[i] < secondSmallest && arr[i] != smallest) {
                secondSmallest = arr[i];  // Βρίσκουμε το δεύτερο μικρότερο
            }
        }

        return  secondSmallest;
    }
}
