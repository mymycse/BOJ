import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        double[] dp = new double[n+1];
        double result = 0;

        for ( int i = 1 ; i <= n ; i++ ) {
            double f = Double.parseDouble(br.readLine());
            dp[i] = Math.max(f, dp[i-1]*f);
            result = Math.max(result, dp[i]);
        }

        System.out.printf("%.3f", result);
    }
}