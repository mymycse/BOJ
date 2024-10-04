import java.io.*;

public class Main {
    static int mod = 10_007;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int[] dp = new int[n];

        dp[0] = 1;

        if ( n > 1 )
            dp[1] = 3;

        for ( int i = 2 ; i < n ; i++ )
            dp[i] = (dp[i-2]*2 + dp[i-1])%mod;

        System.out.println(dp[n-1]);
    }
}