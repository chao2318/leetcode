class Solution35 {
    public static int searchInsert(int[] nums, int target) {
        for (int num = 0; num < nums.length; num++) {
            if (nums[num] < target) {
                continue;
            } else {
                //大于等于时候场景想通
                return num;
            }
        }
        return nums.length;
    }
    public static void main(String[] args) {
        int[] a = new int[] {1,3,5,6};
        System.out.println(searchInsert(a, 7));
    }
}