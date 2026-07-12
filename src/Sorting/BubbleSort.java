package Sorting;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
    int []arr={3,4,1,2,5};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void bubbleSort(int[] arr) {




        for(int j=arr.length-1;j>=0;j--){
            for(int i=1;i<=j;i++){
                if(arr[i]<arr[i-1]){
                    int temp=arr[i];
                    arr[i]=arr[i-1];
                    arr[i-1]=temp;
                }
            }
        }

    }
}
