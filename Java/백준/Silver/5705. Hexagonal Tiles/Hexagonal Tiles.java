import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] dp = new int[41];

        dp[1] = 1;
        dp[2] = 2;

        for ( int i = 3 ; i <= 40 ; i++ )
            dp[i] = dp[i-1] + dp[i-2];

        while ( true ) {
            int n = Integer.parseInt(br.readLine());

            if ( n == 0 )
                break;
            else
                System.out.println(dp[n]);
        }
    }
}