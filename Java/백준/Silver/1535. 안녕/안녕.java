import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int[] health = new int[n+1];
        int[] happy = new int[n+1];
        int[][] dp = new int[n+1][100];

        StringTokenizer st1 = new StringTokenizer(br.readLine());
        StringTokenizer st2 = new StringTokenizer(br.readLine());
        for ( int i = 1 ; i <= n ; i++ ) {
            health[i] = Integer.parseInt(st1.nextToken());
            happy[i] = Integer.parseInt(st2.nextToken());
        }

        for ( int i = 1 ; i <= n ; i++ )
            for ( int j = 0 ; j < 100 ; j++ ) {
                if ( j >= health[i] )
                    dp[i][j] = Math.max(dp[i-1][j-health[i]]+happy[i], dp[i-1][j]);
                else
                    dp[i][j] = dp[i-1][j];
            }

        System.out.println(dp[n][99]);
    }
}