package dsa;

import java.util.*;


public class DS_2_Arrays {
    public static void swaparr(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
//        System.out.println(arr[a]);
//        System.out.println(arr[b]);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void reversearr(int[] arr) { //1st method to reverse an array
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void revarr(int arr[], int a, int b) { //2nd method to reverse an array

        while (a < b) {
            int temp = arr[a];
            arr[a] = arr[b];
            arr[b] = temp;
            a++;
            b--;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void specificarr(int[] cr, int r, int s) {
        while (r < s) {
            int temp = cr[r];
            cr[r] = cr[s];
            cr[s] = temp;
            r++;
            s--;
        }
        for (int i = 0; i < cr.length; i++) {
            System.out.print(cr[i] + " ");
        }
    }

    public static void rotatearr(int[] xsr, int s, int e) {
        while (s < e) {
            int temp = xsr[s];
            xsr[s] = xsr[e];
            xsr[e] = temp;
            s++;
            e--;
        }
        System.out.println();
        for (int i = 0; i <= xsr.length - 1; i++) {
            System.out.print(xsr[i] + " ");
        }
    }
    public static int[] duplicatearray(){
        int[]trr = {0,0,1,1,1,2,2,3,3,4};
        int[]temp = new int[trr.length];
        int j= 0;
        for(int i = 0 ; i<trr.length-1 ; i++){
            if(trr[i]!=trr[i+1]){
                temp[j] = trr[i];
                j++;
            }
        }temp[j] = trr[trr.length-1];
        return temp;
    }



    public static void main(String[] args) {
        ArrayList<Integer> xr = new ArrayList<Integer>();
        xr.add(21);
        xr.add(72);
        xr.add(20);
        xr.add(7);
        xr.add(12);
        xr.add(2, 85);
//        xr.addLast(90);
//        xr.addFirst(10);
//        xr.removeLast();
//        xr.removeFirst();
        xr.remove(4);
        xr.set(3, 24);
//        System.out.println(xr);
//        System.out.println(xr.size());
        // sorting
//        Collections.sort(xr);
//        System.out.println(xr);
        // swapping the elements of arrays
//        int[] arr = {21,7,34,95};
//        int temp = arr[1];
//        arr[1] = arr[2];
//        arr[2] = temp;
//        System.out.println(arr[1]);
//        System.out.println(arr[2]);
//        int[] arr = {21,7,34,95};
//        swaparr(arr,1,2);
//        int[] arr = {1,2,3,4,5,6,7,8,9};
//        revarr( arr,0, arr.length-1);

        // Reverse specific part of the array
//        int[] cr = {10,20,30,40,50,60,70,80,90,100};
//        specificarr(cr,2,8);
        //10,20,90,80,70,60,50,40,30,100

        //Rotate the array k times //now k = 4
        int[] xsr = {0,1,2,3,4,5,6,7,8,9,10};
       rotatearr(xsr,0,xsr.length-1);
       rotatearr(xsr,0,4);
       rotatearr(xsr,5,xsr.length-1);

        //given array of n elements , count total no.of elements having at least 1 element
        //greater than itself
//        int [] arr = {-4,-3,7,9,3,9,4};
//        int [] arr = {3,4,11,8,2,10,9,11};
//        int count = 0;
//        int max = arr[0];
//        for(int i = 1 ; i<arr.length;i++){
//            if(arr[i]>max){
//                max = arr[i];
//            }
//        }
//        System.out.println(max);
//        for(int j = 0;j<arr.length;j++){
//            if(arr[j]==max){
//                count++;
//            }
//        }
//        if(count>0){
//            int valid =  arr.length - count;
//            System.out.println("The number of valid elements are " + valid);
//        }

        //Given n array elements check there if exist a pair(i,j) such that crr[i]+crr[j]==k and i!=j
        // where K is the sum of i and j (i and j are indexes)


//        int k = 9;
//        for(int i=0; i<crr.length; i++) {
//            for (int j = i+1; j < crr.length; j++) {
//                if(crr[i]+crr[j]==k){
////                    System.out.println(i +"\n" + j);
//
//                }
//            }
//        }


//        int[] arr = {1,2,3,4};
//        int temp = arr[1];
//        arr[1] = arr[2];
//        arr[2] = temp;
//        for(int i = 0;i<arr.length;i++){
//            System.out.print(arr[i] + " ");
//        }

//        int[] srr = {1,2,3,5};
//        for(int i = srr.length-1;i>=0;i--){
//            System.out.print(srr[i] + " ");
//        }
//        int[] crr = {1,2,3,5};

//        int s = 0;
//        int e = crr.length-1;
//        while(s<e){
//            int temp = crr[s];
//            crr[s] = crr[e];
//            crr[e] = temp;
//            s++;
//            e--;
//        }
//        for (int i = 0 ; i< crr.length ; i++){
//            System.out.print(crr[i] + " ");
//        }

//        int[] err = {2,4,6,7,9,12,15};
//        //reversing from index 1 to 4
//        int s = 1;
//        int e = 4;
//        while(s<e){
//            int temp = err[s];
//            err[s] = err[e];
//            err[e] = temp;
//            s++;
//            e--;
//        }
//        for (int i = 0 ; i< err.length ; i++){
//            System.out.print(err[i] + " ");
//        }

//        int[] rrr = {5, 7, 9, 3, 2, 8, 12, 16};
//        k = 3 (k = no. of rotations)
//        rotatearray(rrr,0,rrr.length-1);
//        System.out.println(); // for new line
//        rotatearray(rrr,0,2);
//        System.out.println(); // for new line
//        rotatearray(rrr,3,rrr.length-1);

//        int[] vrr = {2,4,6,9,21,10,21,12};
//        int max = vrr[0];
//        int count = 0;
//        for(int i = 1; i < vrr.length; i++){
//            if(max<vrr[i]){
//                max = vrr[i];
//            }
//        }
//        System.out.println(max);
//
//        for(int j = 0; j < vrr.length ; j++) {
//            if(max==vrr[j]){
//                count++;
//            }
//        }
//        System.out.println(count);
//
//        if(count>0){
//            int valid = vrr.length - count;
//            System.out.println("There are " + valid + " Valid Elements in the array");
//        }

        //frr[i] + frr[j] = k 
//        int[] frr = {2,5,6,8,10,9};
//        int k = 7;
//        for(int i = 0; i < frr.length ; i++){
//            for(int j = i+1; j < frr.length; j++){
//              if(frr[i] + frr[j] == k){
//                System.out.print(i + "\n" + j);
//
//            }
//            }

        //taking input in 2-d Arrays
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter No. of rows in the Array ");
//        int row = sc.nextByte();
//        System.out.println("Enter No. of columns in the Array");
//        int column = sc.nextByte();
//        int[][]arr = new int[row][column];
//
//        // Adding Elements in Array
//        for(int i = 0;i<row;i++){
//            for(int j = 0;j<column;j++){
//                arr[i][j] = sc.nextByte();
//            }
//        }
//
//        // Displaying array elements
//        for(int i = 0; i<row; i++) {
//            for(int j = 0; j<column; j++){
//                System.out.print(arr[i][j] + " ");
//            }
//            System.out.println();
//        }
//        System.out.println(arr[0][2]);

//        int[]trr = {0,0,1,1,1,2,2,3,3,4};
//        int[]temp = new int[trr.length];
//        int j= 0;
//        for(int i = 0 ; i<trr.length-1 ; i++){
//            if(trr[i]!=trr[i+1]){
//                temp[j] = trr[i];
//                j++;
//            }
//        }temp[j] = trr[trr.length-1];
//
//        for(int i = 0 ; i<=j ; i++){
//            System.out.print(temp[i] + " ");
//        }

        //Calculate the average of elements present in the array
//        int[]arr = {2,5,6,4};
//        int sum = 0;
//        for(int i = 0;i<arr.length;i++){
//            sum = sum + arr[i];
//        }
//        System.out.println(sum/arr.length);

        //Write a Java program to test if an array contains a specific value.
//        int[]rrr = {1,34,21,7,84};
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the Element");
//        int search = sc.nextInt();
//       int i = 0;
//       int count = 0;
//       while(i < rrr.length){
//           if(rrr[i] == search){
//               count++;
//           }
//           i++;
//       }
//       if(count==1){
//           System.out.println("Element is present in array");
//       }
//       else {
//           System.out.println("Element is not present in array");
//       }

        //Write a Java program to find the index of an array element.
//        int[]trr = {45,65,21,34,18};
//        System.out.println(findindex(trr,12));

        //Write a Java program to remove a specific element from an array.
//        int[]err = {2,5,3,4,1};
//        System.out.println("Before removing");
//        for(int r:err){
//            System.out.print(r + " ");
//        }
//        System.out.println(); // for next line
//        int remove = 3;
//        for(int i = 0; i <err.length;i++){
//            if(err[i] == remove){
//                err[i]=err[i+1];
//                err[i+1]=0;
//            }
//        }
//        System.out.println("After removing");
//        for(int i:err){
//            System.out.print(i + " ");
//        }

        //Write a Java program to insert an element (specific position) into an array.
//        int[] gxr = {3,2,4,2,5};
//        System.out.println("Before Adding");
//        for(int r:gxr){
//            System.out.print(r + " ");
//        }
//        System.out.println(); // for next line
//        int add = 6;
//        int index = 2;
//        for(int i = 0;i< gxr.length;i++){
//            if(i==index){
//                gxr[i]=add;
//            }
//        }
//        System.out.println("After Adding");
//        for(int f:gxr){
//            System.out.print(f + " ");
//        }

        //Write a Java program to find duplicate values in an array of string values
//        int[]xrr = {0,0,1,1,1,2,2,3,3,3,4,4,5,5};
//        int[]temp = new int[xrr.length];
//        int ind = 0;
//        for(int i=0; i<xrr.length-1; i++){
//            if(xrr[i]!=xrr[i+1]){
//                temp[ind] = xrr[i];
//                ind++;
//
//            }
//        }
//        xrr[xrr.length-1] = temp[ind];
//        for(int f:temp){
//            System.out.print(f + " ");
//        }

        // Write a Java program to find a missing number in an array
//        int[]mis = {1,2,3,5,6,7};
//        int sr = 0;
//        int last = mis[mis.length-1];
//        int sum = (last+1)*last/2;  // formula to calculate the sum of elements of an array in a range
//        for(int i=0; i<mis.length;i++){
//             sr = sr + mis[i];
//        }
//        int missing = sum - sr;
//        System.out.println("Missing element is " + missing);

        //Check if  both the arrays are equal
//        int[]mrr = {1,2,3,4};
//        int[]mrr1 = {1,2,3,4};
//        int count = 0;
//        for(int i = 0; i < mrr.length; i++){
//            for(int j = i; j<=i; j++){
//                if(mrr[i]==mrr1[j]){
//                    count++;
//                }
//            }
//        }
//        if(count == mrr.length){
//            System.out.println("Both the arrays are equal");
//        }
//        else{
//            System.out.println("Not equal");
//        }

        //convert Arraylist into Array
//        ArrayList<Integer> list = new ArrayList<Integer>();
//        list.add(21);
//        list.add(3);
//        list.add(10);
//        list.add(7);
//        Integer [] brr = new Integer[list.size()];
//        list.toArray(brr); // toArray is a method to convert arraylist into array
//        for(Integer cxr:brr){
//            System.out.println(cxr);
//        }

        //convert Arrays into ArrayList
//        int[] xsr = {3,2,1,5,6,3};
//        ArrayList<Integer> cr = new ArrayList<Integer>();
//        for(Integer x : xsr){
//            cr.add(x);
//        }
//
//        for(int i = 0 ; i< cr.size();i++){
//            System.out.print(cr.get(i) + " ");
//        }

        //Find the second largest element in an array
//        int[] lrg = {1,8,5,2,82,9};
//        for(int i = 0; i < lrg.length; i++){
//            for(int j = 0; j < lrg.length-1-i; j++){
//                if(lrg[j]>lrg[j+1]){
//                    int temp = lrg[j];
//                    lrg[j] = lrg[j+1];
//                    lrg[j+1] = temp;
//                }
//            }
//        }
//        for(int x:lrg){
//            System.out.print(x + " ");
//        }
//        System.out.println();//for new line
//        System.out.println("Second Largest element is " + (lrg[lrg.length-2]));
//        System.out.println("Second Smallest element is " + (lrg[1]));









    }


    public static void rotatearray(int[]rrr,int s, int e) {
        while (s < e) {
            int temp = rrr[s];
            rrr[s] = rrr[e];
            rrr[e] = temp;
            s++;
            e--;
        }
        for (int i = 0; i < rrr.length; i++) {
            System.out.print(rrr[i] + " ");
        }
    }
// Print matrix in a wave form
    public static void wavearray(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of Rows in Array");
        int row = sc.nextInt();
        System.out.println("Enter the number of Columns in Array");
        int column = sc.nextByte();
        int[][]wrr = new int[row][column];
        for(int i = 0 ; i < row ; i++){
            for(int j = 0 ; j < column ; j++){
                wrr[i][j] = sc.nextInt();
            }
        }

        for(int i = 0 ; i < row ; i++){
            if(i%2!=0){
                for(int j = column-1 ; j >= 0 ; j--) {
                    System.out.print(wrr[i][j] + " ");
                }
            }
            else {
                for(int j = 0 ; j < column ; j++){
                    System.out.print(wrr[i][j] + " ");
                }
            }
            System.out.println();
        }
    }

    public static int findindex(int[]trr , int element){
        for(int i = 0; i<trr.length;i++){
            if(element==trr[i]){
                System.out.println("Element is present at index " );
                return  i;
            }
        }
        return -1;
    }
}






