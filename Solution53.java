class Solution53 {
    public static int maxSubArray(int[] nums) {
        //dp解法
        int len = nums.length;
        int[] dp = new int[len];
        dp[0] = nums[0];
        int max = dp[0];
        for (int i = 1; i < len; i++) {
            if (nums[i] >= (dp[i - 1] + nums[i])) {
                dp[i] = nums[i];
            } else {
                dp[i] = dp[i - 1] + nums[i];
            }
            if (dp[i] > max) {
                max = dp[i];
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int[] test = new int[]{-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSubArray(test));
    }
}