package com.wzc;

public class Solution704 {
    public int search(int[] nums, int target) {
        int leftIndex = 0, rightIndex = nums.length - 1;
        int currentIndex = 0;
        int flag = 0;
        while (true) {
            currentIndex = (rightIndex - leftIndex)/2 + leftIndex;
            if (nums[currentIndex] > target) {
                rightIndex = currentIndex  ;
            } else if (nums[currentIndex] < target) {
                leftIndex = currentIndex;
            } else {
                flag = 1;
                break;
            }
            if (leftIndex == rightIndex) {
                if (nums[currentIndex] == target) {
                    flag = 1;
                }
                break;
            }
            if (leftIndex == rightIndex -1) {
                if (nums[leftIndex] == target) {
                    currentIndex = leftIndex;
                    flag = 1;
                } else if (nums[rightIndex] == target){
                    currentIndex = rightIndex;
                    flag = 1;
                } else {
                     //do nothing
                }
                break;
            }
        }

        if (flag == 1) {
            return currentIndex;
        } else {
            return -1;
        }
    }

    public static void main(String[] args) {
        Solution704 so = new Solution704();
        so.search(new int[]{1,2,3,4,5},5);
    }
}
