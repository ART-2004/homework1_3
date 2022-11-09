import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        double[] array = { 1, 2, -1, -4, 4, 3, 4, 5 };


        double sum = 0;
        double length = 0;
        boolean isNegative = false;

        for (int i = 0; i < array.length; i++) {
            if(array[i] < 0) {
               isNegative  = true;
            } else if (isNegative && array[i] > 0) {
                sum += array[i];
                length++;
            }

        }
        System.out.println(sum + "" +  "" + length);
        double average = sum / length;

        System.out.println("Average of array : "+average);

        int[] bubbleArray = {-2, -4, 3, 2, 8, 6};

        bubbleSort(bubbleArray);
        System.out.println("Array After Bubble Sort");
        for(int i=0; i < bubbleArray.length; i++){
            System.out.print(bubbleArray[i] + " ");
        }

    }


    public static void bubbleSort(int arr[]) {
        int n = arr.length;
        int temp = 0;
        for(int i=0; i < n; i++){
            for(int j=1; j < (n-i); j++){
                if(arr[j-1] > arr[j]){
                    //swap elements
                    temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                }

            }
        }
    }

}