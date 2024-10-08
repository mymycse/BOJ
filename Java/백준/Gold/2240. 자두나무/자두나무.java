import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int T = Integer.parseInt(st.nextToken());
        int W = Integer.parseInt(st.nextToken());

        int[][] dp = new int[T+1][W+1];

        for ( int i = 1 ; i <= T ; i++ ) {
            int plum = Integer.parseInt(br.readLine());

            for ( int j = 0 ; j <= W ; j++ ) {
                if ( j == 0 ) {
                    if ( plum == 1 )
                        dp[i][j] = dp[i-1][j]+1;
                    else
                        dp[i][j] = dp[i-1][j];
                } else if ( j%2 == 0 ) {
                    if ( plum == 1 )
                        dp[i][j] = Math.max(dp[i-1][j],dp[i-1][j-1])+1;
                    else
                        dp[i][j] = Math.max(dp[i-1][j],dp[i-1][j-1]);
                } else {
                    if ( plum == 1 )
                        dp[i][j] = Math.max(dp[i-1][j],dp[i-1][j-1]);
                    else
                        dp[i][j] = Math.max(dp[i-1][j],dp[i-1][j-1])+1;
                }
            }
        }

        int res = 0;
        for ( int i = 0 ; i <= W ; i++ )
            res = Math.max(res,dp[T][i]);

        System.out.println(res);
    }
}