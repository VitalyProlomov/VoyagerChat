package com.voyagerchat;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class VoyagerChatApplication {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        SpringApplication.run(VoyagerChatApplication.class, args);
    }
}
//
//import java.util.Arrays;
//import java.util.Comparator;
//import java.util.HashMap;
//
//class Solution {
//
//    public class MyComparator implements Comparator {
//        public int digits(int n) {
//            int sum = 0;
//            while (n != 0) {
//                sum += n % 10;
//                n /= 10;
//            }
//
//            return sum;
//        }
//        public int compare(Object o1, Object o2) {
//            int a = (int) o1;
//            int b = (int) o2;
//
//            int dA = digits(a);
//            int dB = digits(b);
//            if (dA > dB) {
//                return 1;
//            }
//            if (dA < dB) {
//                return -1;
//            }
//
//            if (a < b) {
//                return -1;
//            }
//            if (a > b) {
//                return 1;
//            }
//            return 0;
//        }
//    }
//    public int minSwaps(int[] nums) {
//        Integer[] sorted = new Integer[nums.length];
//        for (int i = 0; i < nums.length; ++i) {
//            sorted[i] = nums[i];
//        }
//        MyComparator a = new MyComparator();
//        Arrays.sort(sorted, a);
//        HashMap<Integer, Integer> newOrder = new HashMap<>();
//        for (int i = 0; i < sorted.length; ++i) {
//            newOrder.put(sorted[i], i);
//        }
//        int swaps = 0;
//        for (int i = 0; i < nums.length; ++i) {
//            int newInd = newOrder.get(nums[i]);
//            if (newInd != i) {
//                ++swaps;
//                int temp = nums[newInd];
//                nums[newInd] = nums[i];
//                nums[i] = temp;
//            }
//        }
//
//        return swaps;
//    }
//}