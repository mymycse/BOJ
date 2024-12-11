import java.io.*;

public class Main {
    static int[][] dp = new int[41][2];
    static boolean[][] b = new boolean[41][2];
    static int[] fib (int N) {
        if ( !b[N][0] || !b[N][1]) {
            dp[N][0] = fib(N-1)[0] + fib(N-2)[0];
			dp[N][1] = fib(N-1)[1] + fib(N-2)[1];
            b[N][0] = true; b[N-1][1] = true;
        }
        return dp[N];
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        for ( int i = 0 ; i < 2 ; i++ ) {
            for ( int j = 0 ; j < 2 ; j++ ) {
                if ( i == j )
                    dp[i][j] = 1;
                else
                    dp[i][j] = 0;
                b[i][j] = true;
            }
        }

        while ( T-- > 0 ) {
            int N = Integer.parseInt(br.readLine());
            fib(N);
            System.out.println(dp[N][0] + " " + dp[N][1]);
        }
    }
}