package BinarySearch;

import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        int target;
        Scanner sc=new Scanner(System.in);

        int []arr= {2,5,9,12,15};

        System.out.println("Enter Target to be search");

        target=sc.nextInt();
        System.out.println(search(arr,target));
    }

    static boolean search(int [] arr,int target){

        int start=0,end=arr.length-1;
        int mid=(end+start)/2;

        while(start<=end){
            if(arr[mid]==target)
                return  true;
            else if(arr[mid]<=target){
                start=mid+1;
            }
            else {
                end=mid-1;
            }
            mid=(end+start)/2;
        }

        return false;
    }

}
