import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int[][] c = new int[N][2];

        for ( int i = 0 ; i < N ; i++ ) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            c[i][0] = Integer.parseInt(st.nextToken());
            c[i][1] = Integer.parseInt(st.nextToken());
        }

        int[] dp = new int[N+1];

        for ( int i = N-1 ; i >= 0 ; i-- ) {
            if ( i + c[i][0] <= N )
                dp[i] = Math.max(dp[i+c[i][0]]+c[i][1], dp[i+1]);
            else
                dp[i] = dp[i+1];
        }

        int profit = 0;
        for ( int p : dp )
            profit = Math.max(profit, p);

        System.out.println(profit);
    }
}