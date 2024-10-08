import java.io.*;

public class Main {
    static int OFFSET = 1_000_000_000;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        long[][] dp = new long[N+1][10];

        dp[1][0] = 0;

        for ( int i = 1 ; i <= 9 ; i++ )
            dp[1][i] = 1;

        for ( int i = 2 ; i <= N ; i++ ) {
            dp[i][0] = (dp[i-1][1]);
            dp[i][9] = (dp[i-1][8]);
            for ( int j = 1 ; j < 9 ; j++ ) {
                dp[i][j] = (dp[i-1][j+1]);
                dp[i][j] += (dp[i-1][j-1])%OFFSET;
            }
        }

        long sum = 0;
        for ( int i = 0 ; i <= 9 ; i++ ) {
            sum += dp[N][i];
            sum %= OFFSET;
        }

        System.out.println(sum);
    }
}