import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int[] dp = new int[N+1];

        dp[1] = 5;

        for ( int i = 2 ; i <= N ; i++ )
            dp[i] = (dp[i-1] + i*3 + 1)%45678;

        System.out.println(dp[N]);
    }
}