import java.util.Arrays;
class Solution27 {
    // public static int removeElement(int[] nums, int val) {
    //     //感觉长度是对的，但是leetcode的代码默认从数组第一位开始，需要换种实现方式
    //     int len = nums.length;
    //     int p = 0,q = 1;
    //     while (p < len && nums[p] == val) {
    //         p++;
    //     }
    //     if (p == len) {
    //         return 0;
    //     }
    //     System.out.println("p is "+p);
    //     int start = p;
    //     q = p+1;
    //     while (q < len) {
    //         if(nums[q] != val){
    //             nums[p + 1] = nums[q];
    //             p++;
    //         }
    //         q++;
    //     }
    //     return p - start + 1;
    // }

    public static int removeElement(int[] nums, int val) {
        int len = nums.length;
        int p = 0,q = 1;
        while (p < len && nums[p] != val) {
            p++;
        }
        q = p + 1;
        while (q < len) {
            if(nums[q] != val){
                nums[p] = nums[q];
                p++;
            }
            q++;
        }
        return p;
    }
    public static void main(String[] args) {
        int[] nums = new int[] {3,4,5,6};
        System.out.println(removeElement(nums,7));
    }
}