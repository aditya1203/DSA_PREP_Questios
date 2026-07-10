package BinarySearch;

public class CountTheRotationInSortedArray {

    public static void main(String[] args) {
        System.out.println(findKRotation(new int[]{5,6,7,8,9 ,1 ,2 ,3 ,4}));
    }
    static int findKRotation(int arr[]) {
        // Code here

        int start=0,end=arr.length-1;
        if(arr.length==1)return 0;

        while(start<=end){
            int mid=start + (end-start)/2;

            if(mid>start && arr[mid]<arr[mid-1]){
                return mid;
            }
            if(mid<end && arr[mid]>arr[mid+1]){
                return mid+1;
            }
            if(arr[mid]<arr[start]){
                end=mid-1;
            }
            else{
                start=mid+1;
            }

        }

        return 0;
    }
}


