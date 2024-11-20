import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());

        while ( tc-- > 0 ) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());

            int[] A = new int[N];
            int[] B = new int[M];

            st = new StringTokenizer(br.readLine());
            for ( int i = 0 ; i < N ; i++ )
                A[i] = Integer.parseInt(st.nextToken());

            st = new StringTokenizer(br.readLine());
            for ( int i = 0 ; i < M ; i++ )
                B[i] = Integer.parseInt(st.nextToken());

            Arrays.sort(B);

            int res = 0;
            for ( int i = 0 ; i < N ; i++ ) {
                int lo = 0;
                int hi = M-1;
                int cnt = 0;
                
                while ( lo <= hi ) {
                    int mid = (lo+hi)/2;
                    if ( B[mid] < A[i] ) {
                        lo = mid+1;
                        cnt = mid+1;
                    } else
                        hi = mid-1;
                }
                res += cnt;
            }
            System.out.println(res);
        }
    }
}