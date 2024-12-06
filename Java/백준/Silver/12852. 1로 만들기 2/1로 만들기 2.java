import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int X = Integer.parseInt(br.readLine());

        int[] dp = new int[X+1];
        int[] result = new int[X+1];

        dp[1] = 0;
        for ( int i = 2 ; i <= X ; i++ ) {
            dp[i] = dp[i-1]+1;
            result[i] = i-1;

            if ( i%3 == 0 && dp[i] > dp[i/3]+1 ) {
                dp[i] = dp[i/3] + 1;
                result[i] = i/3;
            }

            if ( i%2 == 0 && dp[i] > dp[i/2]+1 ) {
                dp[i] = dp[i/2] + 1;
                result[i] = i/2;
            }
        }

        System.out.println(dp[X]);
        int idx = X;
        for ( int i = 0 ; i <= dp[X] ; i++ ) {
            System.out.print( idx + " " );
            idx = result[idx];
        }
    }
}