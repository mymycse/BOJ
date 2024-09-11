import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int[] good = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for ( int i = 0 ; i < N ; i++ )
            good[i] = Integer.parseInt(st.nextToken());

        Arrays.sort(good);

        int cnt = 0;
        for ( int i = 0 ; i < N ; i++ ) {
            int start = 0;
            int end = N-1;
            int n = good[i];
            while ( start < end ) {
                int sum = good[start]+good[end];
                
                if ( start == i || sum < n )
                    start++;
                else if ( end == i || sum > n )
                    end--;
                else {
                    cnt++;
                    break;
                }
            }
        }

        System.out.println(cnt);
    }
}