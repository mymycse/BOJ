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

        int[] dp1 = new int[N];
        int[] dp2 = new int[N];

        int res = 0;
        for ( int i = 0 ; i < N ; i++ ) {
            dp1[i] = 1;
            dp2[i] = 1;
        }

        for ( int i = 0 ; i < N ; i++ ) {
            for ( int j = 0 ; j < i ; j++ )
                if ( a[j] < a[i] )
                    dp1[i] = Math.max(dp1[i],dp1[j]+1);
        }

        for ( int i = N-1 ; i >= 0 ; i-- ) {
            for ( int j = N-1 ; j > i ; j-- )
                if ( a[j] < a[i] )
                    dp2[i] = Math.max(dp2[i],dp2[j]+1);

            res = Math.max(res, dp1[i]+dp2[i]-1);       
        }

        System.out.println(res);
    }
}