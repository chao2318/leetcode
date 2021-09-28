class Solution66 {
    public static int[] plusOne(int[] digits) {
        int len = digits.length;
        boolean carryBitFlag = false;
        boolean extendFlag = false;
        for (int i = len - 1; i >=0; i--) {
            if (i == (len - 1) || carryBitFlag) {
                if (digits[i] >= 9) {
                    digits[i] = 0;
                    carryBitFlag = true;
                    if (i == 0) {
                        extendFlag = true;
                    }
                } else {
                    digits[i] = digits[i] + 1;
                    carryBitFlag = false;
                }
            }
        }
        if (extendFlag == true) {
            int[] newDigits = new int[len + 1];
            newDigits[0] = 1;
            for (int i = 0; i < len; i++) {
                newDigits[i+1] = digits[i];
            }
            return newDigits;
        }
        return digits;
    }

    public static void main(String[] args) {
        int[] test = new int[]{1,2,3};
        plusOne(test);
    }
}