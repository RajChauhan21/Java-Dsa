package dsa;

public class Sorting_Bubble_sort {

    public static void main(String[] args) {
        int[] arr ={7,8,3,1,2};
        for(int i=0;i< arr.length-1;i++) {
            for(int j=0;j< arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
//Time complexity of this technique is O(n^2)
        }
        for(int j = 0 ; j < arr.length ; j++){
            System.out.print(arr[j] + " ");
        }







    }
}
