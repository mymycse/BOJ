import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        while ( t-- > 0 ) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int K = Integer.parseInt(st.nextToken());

            int[] arr = new int[n];
            st = new StringTokenizer(br.readLine());
            for ( int i = 0 ; i < n ; i++ )
                arr[i] = Integer.parseInt(st.nextToken());

            Arrays.sort(arr);

            int start = 0;
            int end = n-1;
            int sum = Integer.MAX_VALUE;
            int cnt = 0;
            
            while ( start < end ) {
                int temp = arr[start]+arr[end];

                if ( Math.abs(sum-K) >= Math.abs(temp-K) ) {
                    if ( Math.abs(sum-K) > Math.abs(temp-K))
                        cnt = 0;
                    sum = temp;
                    cnt++;
                }
                
                if ( temp < K )
                    start++;
                else
                    end--;
            }

            System.out.println(cnt);
        }
    }
}