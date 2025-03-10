import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[][] tri = new int[n][n];

        for ( int i = 0 ; i < n ; i++ ) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for ( int j = 0 ; j <= i ; j++ )
                tri[i][j] = Integer.parseInt(st.nextToken());
        }

        int[][] dp = new int[n][n];
        dp[0][0] = tri[0][0];

        if ( n > 1 ) {
            dp[1][0] = dp[0][0] + tri[1][0];
            dp[1][1] = dp[0][0] + tri[1][1];
        }

        for ( int i = 2 ; i < n ; i++ )
            for ( int j = 0 ; j <= i ; j++ ) {
                if ( j == 0 )
                    dp[i][j] = dp[i-1][j] + tri[i][j];
                else if ( j == i )
                    dp[i][j] = dp[i-1][j-1] + tri[i][j];
                else
                    dp[i][j] = Math.max(dp[i-1][j-1],dp[i-1][j]) + tri[i][j];
            }

            int res = 0;

            for ( int i = 0 ; i < n ; i++ )
                res = Math.max(res,dp[n-1][i]);

            System.out.println(res);
    }
}