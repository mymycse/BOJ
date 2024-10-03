import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int[][] costs = new int[N][3];

        for ( int i = 0 ; i < N ; i++ ) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for ( int j = 0 ; j < 3 ; j++ )
                costs[i][j] = Integer.parseInt(st.nextToken());
        }

        int[][] dp = new int[N][3];

        dp[0][0] = costs[0][0];
        dp[0][1] = costs[0][1];
        dp[0][2] = costs[0][2];

        for ( int i = 1 ; i < N ; i++ ) 
            for ( int j = 0 ; j < 3 ; j++ )
                dp[i][j] = Math.min(dp[i-1][(j+1)%3],dp[i-1][(j+2)%3])+costs[i][j];
        
        int res = Math.min(Math.min(dp[N-1][0],dp[N-1][1]),dp[N-1][2]);
        System.out.println(res);
    }
}