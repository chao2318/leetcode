class Problem26 {
    public int removeDuplicates(int[] nums) {
        int len = nums.length;
        int p = 0,q = 1;
        while (q < len) {
            if(nums[p] != nums[q]){
                nums[p + 1] = nums[q];
                p++;
            }
            q++;
        }
        return p+1;
    }

    public static void main(String[] args) {
        System.out.println('aaa');
    }
}

