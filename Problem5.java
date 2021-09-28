public class Problem5 {
    public static void main(String[] args) {
       String a = longestPalindrome("aba");
       System.out.println(a);
    }
    public static String longestPalindrome(String s) {
        int len = s.length();
        if (len < 2) {
            //长度为0或者1的时候知直接是闭环字符串
            return s;
        }

        boolean dp[][] = new boolean[len][len];
        
        for (int i = 0 ; i < len; i++) {
            //对角线上的都是单个字符，一定是回文字符串
            dp[i][i] = true;
        }
        
        int maxLen = 1;
        int start = 0;
        for (int j = 1; j < len; j++)  {
            for (int i = 0; i < j; i++) {
                if (s.charAt(i) == s.charAt(j)) {
                    //这里由 j-1-(i+1) + 1 < 2得出，左侧加一是由于算长度时，上下两个坐标差+1才是长度
                    if (j - i < 3) {
                        dp[i][j] = true;
                    } else {
                        dp[i][j] = dp[i + 1][j - 1];
                    }
                } else {
                    dp[i][j] = false;
                }

                if (dp[i][j]) {
                    int curLen = j - i + 1;
                    if (curLen > maxLen) {
                        maxLen = curLen;
                        start = i;
                    }
                }
            }
        }

        return s.substring(start, start + maxLen);
    }
}

