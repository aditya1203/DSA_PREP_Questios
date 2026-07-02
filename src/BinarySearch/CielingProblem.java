package BinarySearch;

public class CielingProblem {

    public static void main(String[] args) {

        int []arr={2,3,5,8,9,14,16,18};
        System.out.println(findCieling(arr,4));

    }
    static int findCieling(int [] arr,int target){

        int start=0,end=arr.length-1;

        while(start<=end)
        {
            int mid=start + (end-start)/2;
            if(arr[mid]==target)
                return arr[mid];
            else if(arr[mid]<target){
                start=mid+1;
            }
            else {
                end=mid-1;
            }

        }
        return arr[start];
    }
}
