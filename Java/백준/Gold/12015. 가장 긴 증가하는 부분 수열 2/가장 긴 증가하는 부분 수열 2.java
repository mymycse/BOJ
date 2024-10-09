import java.io.*;
import java.util.StringTokenizer;

public class Main {
    static int N;
    static int[] dp, arr;
    private static int BinarySearch ( int num, int en ) {
        int st = 0;
        int res = 0;
        int end = en;

        while ( st <= en ) {
            int mid = ( st+en ) / 2;
            
            if ( num <= dp[mid] ) {
                res = mid;
                en = mid-1;
            } else
                st = mid+1;
        }

        if ( st == end+1 )
            return -1;
        else
            return res;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        N = Integer.parseInt(br.readLine());
        arr = new int[N];
        dp = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for ( int i = 0 ; i < N ; i++ )
            arr[i] = Integer.parseInt(st.nextToken());

        int LIS = 0;
        for ( int i = 0 ; i < N ; i++ ) {
            int idx = BinarySearch(arr[i], LIS);

            if ( idx == -1 )
                dp[LIS++] = arr[i];
            else
                dp[idx] = arr[i];
        }

        System.out.println(LIS);
    }
}