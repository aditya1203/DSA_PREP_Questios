package BinarySearch;

public class OrderAgnosticBS {

    public static void main(String[] args) {
        int []arr={1,2,3,4,5,6,7,8,9,10};
        int []arr2={99,89,78,67,56,45,23,12,1};
        int target=6;
        System.out.println("Hello");
        System.out.println(orderAgnosticBS(arr,target));
        System.out.println(orderAgnosticBS(arr2,12));
    }

    static int orderAgnosticBS(int []arr,int target){

        boolean order=arr[0]<arr[arr.length-1];

        int start=0,end= arr.length-1;

        while(start<=end){
            int mid=start +(end-start)/2;

            if(arr[mid]==target)
                return mid;

            if(order){
                if(arr[mid]<target){
                    start=mid+1;
                }
                else{
                    end=mid-1;
                }
            }
            else{
                if(arr[mid]<target){
                    end=mid-1;
                }
                else {
                    start=mid+1;
                }
            }

        }

        return -1;
    }

}
