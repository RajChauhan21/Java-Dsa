package dsa;

public class Bit_Manipulation {
    public static void main(String[] args) {
        //find the unique element in the array using B.M
//        int[] arr = {2,2,1};
//        int sum = 0;
//        for(int i = 0; i < arr.length; i++){
//            sum = sum ^ arr[i];
//        }
//        System.out.println("Unique element is " + sum);
//        int a = 45;
//        System.out.println(10>>1);

        //OPERATION'S IN BIT MANIPULATION

        //GET BIT
//        int a = 5; //0101
//        int position = 2; //2nd position of the binary number is 1
//        int bitmask = 1<<position; // B.M ===> 0100
//        if((a&bitmask)==0){ //performing & operation on 0101 & 0100
//            System.out.println("Bit was 0");
//        }
//        else{
//            System.out.println("Bit was 1");
//        }
        //ANS will be '1' at 2nd position

        //SET BIT =====> SET'S '1' AT THE SPECIFIED POSITION
//        int r = 5;
//        int ps = 1;
//        int bitmask = 1<<ps;
//        int ans = bitmask|r;
//
//        System.out.println(ans);

        //CLEAR BIT ==> CLEAR'S THE BIT AT SPECIFIED POSITION MEANS - ASSIGNS '0'
//        int s = 5;
//        int ps = 2;
//        int bitmask = 1<<ps;
//        int ans = ~bitmask;
//        int xsr = ans&s;
//        System.out.println(xsr);

        //UPDATE BITS ===>CHANGES THE VALUE AT SPECIFIED POSITION (0===>1) , (1===>0)
        //UPDATING 1
//        Scanner sr = new Scanner(System.in);
//        System.out.println("Enter the value you want to update with the");
//        int operation = sr.nextInt();
//        int x = 5;
//        int pos = 1;
//        int bitmask = 1<<pos;
//        if(operation == 1){
//            int ans = bitmask|x;
//            System.out.println(ans);
//        }
//        else if(operation == 0) {
//            //UPDATING 0
//            int notbm = ~bitmask;
//            int ans2 = notbm & x;
//            System.out.println(ans2);
//        }

        //Reverse two bits
//        int n = 1;
//        int rev = 0;
//        int f = 31;
//        int l = 0;
//        while(f>l) {
//            if ((n & 1 << f) == 1) {
//                rev = rev | 1 << l;
//            }
//
//            if((n & 1<<l)==1) {
//                rev = rev | 1 << f;
//            }
//            f--;
//            l++;
//        }
//        System.out.println(rev);

        //Technique 2 - for reversing bits
//        int rev = 1;
//        int n = 1;
//        for(int i = 0 ; i < 32 ; i++){
//            rev = rev<<1;
//            rev = rev|(n&1);
//            n = n>>1;
//        }
//        System.out.println(rev);

        //no. of '1' bits
//        int n = 21;
//        int count = 0;
//        int mask = 1;
//        for(int i = 1 ;i <= 32 ; i++){
//            if((n&mask)!=0){
//                mask = mask<<1;
//                count++;
//            }
//
//        }
//        System.out.println(count);
//        System.out.println(mask);

        //Missing number
        //n*(n+1)/2 ====> formula for finding sum
//        int[] nums = {0,1,3};
//        int n = 3;
//        int sum = (n+1)*n/2;
//        int sum2 = 0;
//        for(int i=0; i<nums.length; i++){
//            sum2 = sum2 + nums[i];
//        }
//        System.out.println(sum2);
//        int ans = sum-sum2;
//        System.out.println("Missing number is " + ans);

        // Single number ====> Find unique element in the array
//        int[] arr = {1,1,3,2,3,2,4};
//        int sum = 0;
//        for(int i = 0; i < arr.length; i++){
//            sum = sum ^ arr[i];
//        }
//        System.out.println(sum);

        //Reverse bit
//        int rev = 0;
//        int n = 5;
//        for(int i = 0; i < 32; i++){
//            rev = rev<<1;
//            rev = rev + n&1;
//            n = n>>1;
//        }
//        System.out.println(rev);
//        System.out.println(n&1);

        //Missing Element
//        int[] xsr = {1,4,2,5,0};
//        int n = xsr.length;
//        int sum = (n+1)*n/2;
//        int sum2 = 0;
//        for(int i=0; i < xsr.length; i++){
//            sum2 = sum2 + xsr[i];
//        }
//        int ans = sum-sum2;
//        System.out.println("Missing Element is " + ans);

        //no. of bits
//        int count = 0;
//        int n = 11;
//        while(n!=0){
//            n = n & (n-1);
//            count++;
//        }
//        System.out.println(count);

//        single number
//        int[] num = {1,1,3,2,3,2,4};
//        int sum = 0;
//        for(int i = 0; i < num.length; i++){
//            sum = sum ^ num[i];
//        }
//        System.out.println(sum);

          // reverse bit
//          int rev = 0;
//          int n = 1;
//          for(int i = 0; i < 32; i++){
//              rev = rev<<1;
//              rev = rev | (n&1);
//              n = n>>1;
//          }
//        System.out.println(rev);

        //missing number
//        int[]arr = {0,1,4,5,3};
//        int n = arr.length;
//        int sum = (n+1)*n/2;
//        int sum1 = 0;
//        for(int i = 0; i < arr.length ; i++){
//            sum1 = sum1 + arr[i];
//        }
//        int ans = sum - sum1;
//        System.out.println("Missing Element is " + ans);

        //No. of '1' bits
        int count = 0;
        int n = 11;
        while(n!=0){
            n = n & (n-1);
            count++;
        }
        System.out.println(count);


    }
}
