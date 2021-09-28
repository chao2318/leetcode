package com.wzc;

public class Solution4 {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int finalLength = nums1.length + nums2.length;
        int[] finalNums = new int[finalLength];

        int i = 0, j = 0, k = 0;
        int[] flag = new int[]{0,0};
        if (nums1.length <= 0) {
            flag[0] = 1;
        }
        if (nums2.length <= 0) {
            flag[1] = 1;
        }

        while (true) {
            if (flag[0] == 0 && flag[1] == 0) {
                if (nums1[i] <= nums2[j]) {
                    finalNums[k] = nums1[i];
                    i++;
                } else {
                    finalNums[k] = nums2[j];
                    j++;
                }
            } else {
                if (flag[0] == 0) {
                    finalNums[k] = nums1[i];
                    i++;
                } else if (flag[1] == 0){
                    finalNums[k] = nums2[j];
                    j++;
                }
            }
            k++;
            if (i >= nums1.length) {
                flag[0] = 1;
            }
            if (j >= nums2.length) {
                flag[1] = 1;
            }
            if (k >= finalLength) {
                break;
            }
        }

        double result = 0.0f;
        if (finalLength == 0) {
            // do nothing
        } else if (finalLength == 1) {
            result = finalNums[0];
        } else {
            if (finalLength%2 == 0) {
                int index = finalLength/2;
                result = (finalNums[index - 1] + finalNums[index])/2.0f;
            } else {
                result = finalNums[(int)(finalLength/2)];
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Solution4 so = new Solution4();
        double re = so.findMedianSortedArrays(new int[]{},new int[]{1});
        System.out.println(re);
    }
}
