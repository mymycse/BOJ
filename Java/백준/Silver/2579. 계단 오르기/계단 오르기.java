import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] stairs = new int[N+1];

        for ( int i = 1 ; i <= N ; i++ )
            stairs[i] = Integer.parseInt(br.readLine());

        int[][] dp = new int[N+1][3];

        if ( N == 1 ) {
            System.out.println(stairs[1]);
            return;
        }

        dp[1][1] = stairs[1];
        dp[1][2] = 0;

        dp[2][1] = stairs[2];
        dp[2][2] = stairs[1]+stairs[2];

        for ( int i = 3 ; i <= N ; i++ ) {
            dp[i][1] = Math.max(dp[i-2][1], dp[i-2][2])+stairs[i];
            dp[i][2] = dp[i-1][1]+stairs[i];
        }

        System.out.println(Math.max(dp[N][1], dp[N][2]));
    }
}