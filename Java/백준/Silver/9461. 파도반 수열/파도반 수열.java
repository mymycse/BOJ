import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static long[] dp = new long[101];
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());
        dp[1] = dp[2] = dp[3] = 1;

        while ( t-- > 0 ) {
            int n = Integer.parseInt(br.readLine());
            System.out.println(seq(n));
        }
    }
    static long seq( int n ) {
        if ( dp[n] == 0 )
            dp[n] = seq(n-2) + seq(n-3);
        return dp[n];
    }
}