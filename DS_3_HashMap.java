package dsa;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.lang.Math;

public class DS_3_HashMap {
    public static void main(String[] args) {
        HashMap<Integer, Integer> xsr = new HashMap<>();
        xsr.put(10, 21);
        xsr.put(34, 0);
//        xsr.put(15,29);
        xsr.put(7, 90);
        xsr.put(15, 21); // here 15 is updated
//        System.out.println(xsr.size()); // Returns the number of keys in the hash map
//        int temp = xsr.put(15,21); // for increasing frequency
//        xsr.put(15,temp+1);
//        System.out.println(xsr.get(15));
//        System.out.println(xsr.containsKey(34));
//        System.out.println(xsr.get(15));
//        System.out.println(xsr.containsKey(15));
//        System.out.println(xsr.containsValue(100));
//        System.out.println(xsr.get(93)); //If there is no such key , it will return false
//        System.out.println(xsr.get(7));
//        xsr.remove(7);
//        System.out.println(xsr.get(7));
//        System.out.println(xsr.containsKey(7));

//        for(int rx : xsr.keySet()){ //returns the key one by one
//            System.out.println(rx);

        //Que 1 - Given N array elements & Q queries , for every query find frequency of element in the array
//        int[] arr = {2,6,3,8,2,8,2,3,8,10,6}; //N
//        int[] qry = {2,8,3,5};//Q
//        HashMap<Integer,Integer> hm = new HashMap<>();
//        for(int i = 0; i<arr.length;i++){
//            if(hm.containsKey(arr[i])==true){
//                int temp = hm.get(arr[i]);
//                hm.put(arr[i],temp+1);
//            }
//            else{
//                hm.put(arr[i],1);
//            }
//        }
//
//        for(int i = 0; i<qry.length;i++){
//            if(hm.containsKey(qry[i])==true){
//                System.out.println("Frequency of " + qry[i] + " is " + hm.get(qry[i]));
//            }
//            else{
//                System.out.println("Frequency of " + qry[i] + " is " + 0);
//            }
//        }
        //Time complexity will be o(n+m)

        //Que 2 - Find first non repeating elements
        HashMap<Integer, Integer> cxr = new HashMap<>();
        int[] frr = {3, 5, 4, 4, 21, 3, 6, 7, 5, 4, 6, 7, 2, 4, 4, 1, 8, 5, 4}; //only FIRST non repeating elements ie - 3
//        int[] frr = {3,5,4,4,3,6,7,5,4,8,6,7,2,2,4,4,1,1,8,5,4}; //Return -1 if all elements are repeating
//        System.out.println(nonRepeating(frr));
        int[] dis = {10, 10, 10, 20, 20};
//        distinctElements(dis);

        //Find arr[i]+arr[j]==k


        int[] ksum = {8, 9, 1, -2, 4, 5, 11, -6, 7, 5};
//
//        int minv = Integer.MAX_VALUE;
//        int maxv = Integer.MIN_VALUE;
//        for(int sum:ksum){
//            minv = Math.min(minv,sum);
//            maxv = Math.max(maxv,sum);
//            set.add(sum);
//        }
//        System.out.println(minv);
//        System.out.println(maxv);
//        System.out.println(set);

        int[] aps = {0, 0, 0};
//        System.out.println(checkAp(aps));
//        HashSet<Integer> dsr = new HashSet<>();
        HashMap<Integer, Integer> fr = new HashMap<>();
        fr.put(1, 21);
        fr.put(2, 3);
//        System.out.println(fr.values());
//        System.out.println(fr.get(1));
//        int[]arr = {0,0,1};
//        fr.put(1,2);
//        for(int c:arr){
//            if(fr.containsKey(c)==true){
//                int temp = fr.get(c);
//                fr.put(c,temp+1);
//            }
//            else{
//                fr.put(c,1);
//            }
//        }
//        System.out.println(fr.get(0));
//
//        for(int i = 0 ; i<fr.size();i++){
//            if(fr.get(i)<=1){
//                System.out.println(true);
//            }
//        }
//        String v = "XXI";
//        System.out.println(romanTointeger(s));
//        System.out.println(s.charAt(0));
        int[] nums = {6, 6, 9, 9, 2, 2, 6, 6, 6};
//        System.out.println(majorityElement(nums));

//        System.out.println(isHappy(2));

        int[] arr = {1, 2, 3, 4};
//        System.out.println(containsDuplicate(arr));

        String cs = "rat";
        String zr = "car";
//        System.out.println(anagram(cs,zr));

        int[] nums1 = {1,2,2,1};
        int[] nums2 = {2,2};
//        System.out.println(intersectionOfArrays(nums1,nums2));

        String s  = "aabb";
//        System.out.println(firstUniqueChar(s));
//
        String sr = "abcabcbb";
        System.out.println(longestSubstring(sr));





    }

    //  FIND FIRST NON REPEATING ELEMENETS
    public static int nonRepeating(int[] frr) {
        HashMap<Integer, Integer> cr = new HashMap<>();
        int count = 0;
        //only FIRST non repeating elements ie - 3
        for (int i = 0; i < frr.length; i++) {
            if (cr.containsKey(frr[i]) == true) {
                int temp = cr.get(frr[i]);
                cr.put(frr[i], temp + 1);
            } else {
                cr.put(frr[i], 1);
            }
        }

        for (int j = 0; j < frr.length; j++) {
            if (cr.get(frr[j]) == 1) {
                return frr[j];

            }
        }
        return -1; //If There is no such Non repeating element
    }

    // FIND DISTICNT ELEMENTS
    public static void distinctElements(int[] dis) {
        HashSet<Integer> cxr = new HashSet<Integer>();
        for (int i = 0; i < dis.length; i++) {
            cxr.add(dis[i]);
        }
        System.out.println(cxr.size());

    }

    // CHECK IF  A + B == K
    public static boolean ksum(int[] ksum, int k) {
        HashMap<Integer, Integer> cxr = new HashMap<>();

        for (int x : ksum) {
            if (cxr.containsKey(x) == true) {
                int temp = cxr.get(x);
                cxr.put(x, temp + 1);
            } else {
                cxr.put(x, 1);
            }
        }
        for (int i = 0; i < ksum.length; i++) {
            int a = ksum[i];
            int b = k - ksum[i];
            if (cxr.containsKey(b) && a != b) {
                boolean ans = a + b == k;
                return ans;
            }

        }
        return false;
    }

    //CHECK THE AP SEQUENCE
    public static boolean checkAp(int[] aps) {
        HashMap<Integer, Integer> set = new HashMap<>();
        int minv = Integer.MAX_VALUE;
        int maxv = Integer.MIN_VALUE;
        for (int x : aps) {
            minv = Math.min(minv, x);
            maxv = Math.max(maxv, x);
            if (set.containsKey(x)) {
                int temp = set.get(x);
                set.put(x, temp + 1);
            } else {
                set.put(x, 1);
            }
        }
        int cd = (maxv - minv) / (aps.length - 1); //Common difference
        System.out.println(cd + " cd");
        for (int i = 0; i < aps.length; i++) {
            int ans = minv + i * cd;
            System.out.println(ans + " ans");
            if (!set.containsKey(ans)) {
                return false;
            }
            System.out.println(set.get(ans));
            System.out.println((set.get(aps[i])));
            if (set.containsKey(ans) && (set.get(aps[i])) >= 2) {
                return false;
            }
        }
        return true;
    }

    // Roman to Integer
    public static int romanTointeger(String s) {
        HashMap<Character, Integer> xr = new HashMap<>();
        xr.put('I', 1);
        xr.put('V', 5);
        xr.put('X', 10);
        xr.put('L', 50);
        xr.put('C', 100);
        xr.put('D', 500);
        xr.put('M', 1000);
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {

            if (i + 1 < s.length()) {
                if (xr.get(s.charAt(i)) < xr.get(s.charAt(i + 1))) {
                    sum = sum - xr.get(s.charAt(i));
                } else {
                    sum = sum + xr.get(s.charAt(i));
                }
            } else {
                sum = sum + xr.get(s.charAt(i));
            }
        }
        return sum;
    }

    //LINKED LIST CYCLE
//    public static <ListNode> boolean linkListcycle(ListNode head){
//        if(head==null){
//            return false
//        }
//
//    }

    //MAJORITY ELEMENT
    public static int majorityElement(int[] nums) {
        //{2,2,1,1,1,2,2}
        HashMap<Integer, Integer> oxr = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
            if (oxr.containsKey(nums[i])) {
                int temp = oxr.get(nums[i]);
                oxr.put(nums[i], temp + 1);
            } else {
                oxr.put(nums[i], 1);
            }
        }
        int a = nums.length / 2;
        for (int j = 0; j < nums.length; j++) {
            if (a < oxr.get(nums[j])) {
                return nums[j];
            }
        }
        return -1;
    }

    //Happy numbers
    public static boolean isHappy(int n) {
        HashSet<Integer> xr = new HashSet<>();
        while (!xr.contains(n)) {
            xr.add(n);
            int sum = 0;
            while (n != 0) {
                int tem = n % 10; //for taking out last digit
                sum = sum + (tem * tem);
                n = n / 10; //for taking out first digit
            }
            n = sum;
        }
        return n == 1;
    }

    public static boolean containsDuplicate(int[] arr) {
        HashMap<Integer, Integer> dxr = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if (dxr.containsKey(arr[i])) {
                return true;
            } else {
                dxr.put(arr[i], 1);
            }
        }
        return false;
    }


    //CHECK VALID ANAGRAM
    public static boolean anagram(String cs, String zr) {
        char[] xr = cs.toCharArray();
        char[] cr = zr.toCharArray();

        Arrays.sort(xr);
        Arrays.sort(cr);

        return Arrays.equals(xr, cr);
    }

    public static int[] intersectionOfArrays(int[]nums1 , int[]nums2){
        HashMap<Integer,Integer> h1 = new HashMap<>();
        HashMap<Integer,Integer> h2 = new HashMap<>();
        ArrayList<Integer> csr = new ArrayList<>();

       for(int i = 0 ; i < nums1.length ; i++){
           if(h1.containsKey(nums1[i])){
              int temp = h1.get(nums1[i]);
              h1.put(nums1[i],temp+1);
           }
           else {
               h1.put(nums1[i],1);
           }
       }
        for(int i = 0 ; i < nums2.length ; i++){
            if(h2.containsKey(nums2[i])){
                int temp = h2.get(nums2[i]);
                h2.put(nums2[i],temp+1);
            }
            else {
                h1.put(nums2[i],1);
            }
        }
        for(Integer x:h1.keySet()){
            if(h2.containsKey(x)){
                int m = Math.min(h1.get(x) , h2.get(x));
                while(m-- > 0){
                    csr.add(x);
                }
            }
        }
        int[]ans = new int[csr.size()];
        for(int i = 0 ; i < csr.size() ; i++){
            ans[i] = csr.get(i);
        }
        return ans;
    }

    public static int firstUniqueChar(String s){
        HashMap<Character,Integer> cvr = new HashMap<>();
        for(int i = 0 ; i < s.length() ; i++){
            if(cvr.containsKey(s.charAt(i))){
                int temp = cvr.get(s.charAt(i));
                cvr.put(s.charAt(i),temp+1);
            }
            else{
                cvr.put(s.charAt(i),1);
            }
        }
        for(int i = 0 ; i < s.length() ; i++){
            if(cvr.get(s.charAt(i))==1){
                return i;
            }
        }
        return -1;
    }

    public static int longestSubstring(String sr){
        int right = 0 , left = 0 , max = 0;
        HashSet<Character> cr = new HashSet<>();
        while(right< sr.length()){
            char c = sr.charAt(right);
            if(cr.add(c)){
                max = Math.max(max,right-left+1);
                right++;
            }
            else{
                while (sr.charAt(left)!=c){
                    cr.remove(sr.charAt(left));
                    left++;
                }
                cr.remove(c);
                left++;
            }
        }
           return max;
    }
}
