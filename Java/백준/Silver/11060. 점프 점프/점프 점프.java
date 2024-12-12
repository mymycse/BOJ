import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int[] arr = new int[N];
        long[] dp = new long[1101];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for ( int i = 0 ; i < N ; i++ ) {
            arr[i] = Integer.parseInt(st.nextToken());
            dp[i] = Integer.MAX_VALUE;
        }

        dp[0] = 0;

        for ( int i = 0 ; i < N ; i++ ) {
            if ( dp[i] >= Integer.MAX_VALUE )
                continue;
            for ( int j = 0 ; j <= arr[i] ; j++ ) 
                dp[i+j] = Math.min(dp[i+j],dp[i]+1);
        }

        if ( dp[N-1] >= Integer.MAX_VALUE )
            System.out.println(-1);
        else
            System.out.println(dp[N-1]);
    }
}