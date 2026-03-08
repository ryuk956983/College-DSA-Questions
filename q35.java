public class q35 {

    public static int getLPS(String s) {
        int n = s.length();
          int[][] dp = new int[n][n];

       for (int i = 0; i < n; i++) {
            dp[i][i] = 1;
        }
          for (int cl = 2; cl <= n; cl++) {
            for (int i = 0; i < n - cl + 1; i++) {
                int j = i + cl - 1;

                if (s.charAt(i) == s.charAt(j)) {
                    if (cl == 2) {
                        dp[i][j] = 2;
                    } else {
                        dp[i][j] = dp[i + 1][j - 1] + 2;
                    }
                } else {
                    // If they don't match, take the maximum of excluding either end
                    dp[i][j] = Math.max(dp[i][j - 1], dp[i + 1][j]);
                }
            }
        }

         return dp[0][n - 1];
    }

    public static void main(String[] args) {
        String input = "babad";
        System.out.println(getLPS(input));
    }
}