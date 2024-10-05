import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int[] a = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for ( int i = 0 ; i < N ; i++ )
            a[i] = Integer.parseInt(st.nextToken());

        int[] dp = new int[N];
        dp[0] = a[0];
        int res = dp[0];

        for ( int i = 1 ; i < N ; i++ ) {
            for ( int j = 0 ; j < i ; j++ ) {
                if ( a[j] < a[i] )
                    dp[i] = Math.max(dp[i],dp[j]+a[i]);
            }
            if ( dp[i] == 0 )
                dp[i] = a[i];
            res = Math.max(dp[i], res);
        }

        System.out.println(res);
    }
}