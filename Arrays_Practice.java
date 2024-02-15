package dsa;

public class Arrays_Practice {
    public static void main(String[] args) {
        // Average
//        int[]arr = {2,4,1,5,2};
//        int avg = 0;
//        for(int i = 0;i<arr.length;i++){
//            avg = avg + arr[i];
//        }
//        System.out.println(avg/ arr.length);

         //Element present in the array?
//        int[]rrr = {12,2,3,4,21,7};
//        int val = 12;
//        int count = 0;
//        for(int i = 0;i<rrr.length;i++){
//            if(rrr[i]==val){
//                count++;
//            }
//        }
//        if (count == 1){
//            System.out.println("Element is present in the array");
//        }
//        else{
//            System.out.println("Element is not present in the array");
//        }

         // find index of the element
//        int[] frr = {23,21,24,53,20,7};
//        int element = 2;
//        for(int i = 0; i < frr.length; i++){
//            if(frr[i] == element){
//                System.out.println("Element is present at index " + i);
//                break;
//            }
//        else {
//                System.out.println("Element is not present");
//        }
//        }

         //Remove an element
//        int[] err = {12,21,7,10,5,43};
//        int remove = 12;
//        for (int i = 0; i < err.length; i++) {
//            if(err[i]==remove){
//                err[i] = err[i+1];
//                err[i+1] = 0;
//            }
//        }
//        for(int x:err){
//            System.out.print(x + " ");
//        }

        //Insert an element
//        int[]wrr = {90,21,7,12,31};
//        int add = 3;
//        for(int i = 0; i < wrr.length; i++){
//            if(wrr[i]==wrr[4]){
//                wrr[i]=add;
//            }
//        }
//        for(int r:wrr){
//            System.out.print(r + " ");
//        }

        //Remove duplicate elements
//        int[]srr = {0,0,0,1,1,2,2,2,2,3,3,4,4,5,5,6,7};
//        for(int i = 0; i < srr.length-1; i++){
//            if(srr[i]!=srr[i+1]){
//                System.out.print(srr[i] + " ");
//            }
//        }
//        System.out.println(srr[srr.length-1]);

          //Convert array into arraylist
//        int[]trr = {21,7,8,12,90,100};
//        ArrayList<Integer> cr = new ArrayList<>();
//        for(int x:trr){
//            cr.add(x);
//        }
//        for(int x = 0 ; x < cr.size() ; x++){
//            System.out.print(cr.get(x) + " ");
//        }

        //Convert Arraylist into Arrays
//        ArrayList<Integer> fr = new ArrayList<>();
//        fr.add(21);
//        fr.add(24);
//        fr.add(2);
//        fr.add(1);
//        fr.add(7);
//
//        Integer[] er = new Integer[fr.size()];
//        fr.toArray(er); // A method to convert Arraylist into Arrays
//
//        for(int i = 0; i< er.length; i++){
//            System.out.print(er[i] + " ");
//        }

        //Is both the Arrays are equal?
//        int[]cr = {5,3,2,1,8,21};
//        int[]xr = {5,3,2,1,8,21};
//        int count = 0;
//        for(int i = 0; i < cr.length;i++){
//            if(cr[i]==xr[i]){
//                count++;
//            }
//        }
//        if(count==cr.length){
//            System.out.println("Arrays are equal");
//        }
//        else{
//            System.out.println("Arrays are not equal");
//        }

        //find missing element in array
//        int[] arr = {1,2,3,5,6,7};
//        int last = arr[arr.length-1];
//        int sum1 = 0;
//        int sum = (last+1)*last/2; //28
//        for(int i=0; i<arr.length; i++){
//            sum1 = sum1 + arr[i];
//        }
//        int ans = sum - sum1;
//        System.out.println("Missing element is " + ans);

        //find second largest and second smallest element
//        int[] zrr = { 1,2,92,4,45,21,1};
////        for(int i = 0; i < zrr.length; i++){
////            for(int j = 0; j < zrr.length-1-i; j++){
////                if(zrr[j]>zrr[j+1]){
////                    int temp = zrr[j];
////                    zrr[j] = zrr[j+1];
////                    zrr[j+1] = temp;
////                }
////            }
////        }
////        for(int i = 0 ; i<zrr.length; i++){
////            System.out.print(zrr[i] + " ");
////        }
////        System.out.println();
////        System.out.println(zrr[zrr.length-2] + " is the second largest element in the array");
////        System.out.println(zrr[1] + " is the second smallest element in the array");

        //Single Element - 2
//        int[] err = {2,2,3,2};
//        int value = 0;
//        for(int i = 0 ; i < 32 ; i++){
//            int countones = 0;
//            int temp = (1<<i);
//            for(int x:err){
//                if((x & temp)==0){
//                }
//                else{
//                    countones++;
//                }
//            }
//            if(countones % 3 == 1){
//                value = (value | temp);
//            }
//        }
//        System.out.println(value);


        // Calculate sum of the elements in the array
//        int[]arr = {2,4,6,1,2,8};
//        int sum = 0;
//        for(int i = 0 ; i < arr.length ; i++){
//            sum = sum + arr[i];
//        }
//        System.out.println(sum);

        //Check if array contains a specific value
//        int[] arr1 = {4,1,3,9,21,7};
//        int element = 21;
//        int count = 0;
//        for(int i = 0 ; i < arr1.length ; i++){
//            if(arr1[i] == element){
//                count++;
//            }
//        }
//        if(count==1){
//            System.out.println("Element is present in the array");
//        }
//        else{
//            System.out.println("Element is not present in the array");
//        }

        // Find the index of the specific element
//        int[] xsr = {3,6,4,8,21,7,12,10};
//        int element = 21;
//        for(int i = 0 ; i < xsr.length; i++){
//            if(xsr[i]==element){
//                System.out.println("Element is present at index "  + i);
//            }
//        }

        //Remove a specific element from an array
//        int [] frr = {2,3,7,12,18,21,84};
//        int remove = 12;
//        for(int i = 0 ; i < frr.length; i++){
//             if(frr[i]==remove){
//                 frr[i] = frr[i+1];
//                 frr[i+1] = 0;
//             }
//        }
//        for(int x :frr){
//            System.out.print(x   + " ");
//        }

        //Insert a element at a specific position
//        int[] drr = {9,3,7,12,18,15,21,90};
//        int add = 95;
//        for(int i = 0; i < drr.length ; i++){
//            if(drr[i]==drr[3]){
//                drr[i] = add;
//            }
//        }
//        for (int r:drr){
//            System.out.print(r + " ");
//        }

        //Find duplicates in the array
//        int[] drr = {1,1,2,4,4,6,9,9};
//        for (int i = 0; i < drr.length-1;i++){
//            if(drr[i]!=drr[i+1]){
//                System.out.print(drr[i] + " ");
//            }
//        }
//        System.out.println(drr[drr.length-1]);

        //Convert a array into arraylist
//        int[]err = {7,3,1,0,8,5,21};
//        ArrayList<Integer> cr = new ArrayList<Integer>();
//        for(int x:err){
//            cr.add(x);
//        }
//        for (int i = 0 ; i< err.length ; i++){
//            System.out.print(cr.get(i) + " ");
//        }

        //Single number - 2
//        int[] err = {2,2,3,2};
//        int value = 0;
//        for(int i = 0 ; i < 32 ; i++){
//            int countones = 0;
//            int temp = (1<<i);
//            for(int x:err){
//                if((x & temp)==0){
//                }
//                else {
//                    countones++;
//                }
//            }
//            if(countones % 3 == 1){
//                value = (value | temp);
//            }
//        }
//        System.out.println("" + value);

        //Single Number - 3
//        int[] arr = {1,2,1,3,2,5};
//        int sum = 0;
//        for(int x:arr){
//            sum = sum^x;
//        }
//        int lowestbit = sum&(-sum);
//        int[] ans = new int[2];
//
//        for(int s:arr){
//            if((lowestbit & s)==0){
//                ans[0] = ans[0]^s;
//            }
//            else{
//                ans[1] = ans[1]^s;
//            }
//        }
//        System.out.println(ans[0] + "\n" + ans[1]);

        //Single number - 2
//        int[] grr = {8,2,8,8};
//        int ans = 0;
//        for(int i = 0; i < 32 ; i++){
//            int countones = 0;
//            int temp = 1<<i;
//            for(int x:grr){
//                if((x & temp)==0){
//                }
//                else {
//                    countones++;
//                }
//            }
//            if(countones%3==1){
//                ans = ans | temp;
//            }
//        }
//        System.out.println(ans);

        //Single number - 3
//        int[] rtr = {1,2,1,3,2,5};
//        int sum = 0;
//        for(int x:rtr){
//            sum = sum^x;
//        }
//        int lowestbit = sum&(-sum);
//        int[] ans  = new int[2];
//        for(int r:rtr){
//            if((lowestbit & r)==0){
//                ans[0] = ans[0]^r;
//            }
//            else {
//                ans[1] = ans[1]^r;
//            }
//        }
//        System.out.println(ans[0]+"\n"+ ans[1]);

        //Divide two integer
        int dividend = 10;
        int divisor = 3;
        int ans = 0;
        while (dividend>=divisor){
            int sum =  divisor;
            int count = 1;
            while(sum<=dividend-sum){
                sum = sum + sum;
                count = count + count;
            }
            ans = ans + count;
            dividend = dividend - sum;
        }
        System.out.println(ans);
//        System.out.println(Integer.MAX_VALUE);
        int a = 7;
        int b = -3;
        System.out.println(a/b);













    }
}