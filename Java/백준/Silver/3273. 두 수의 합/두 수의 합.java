import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for ( int i = 0 ; i < n ; i++ )
            arr[i] = Integer.parseInt(st.nextToken());

        int x = Integer.parseInt(br.readLine());

        Arrays.sort(arr);
        int sum = 0;
        int cnt = 0;
        int start = 0;
        int end = n-1;
        
        while ( start < end ) {
            sum = arr[start]+arr[end];

            if ( sum == x )
                cnt++;

            if ( sum < x )
                start++;
            else
                end--;
        }

        System.out.println(cnt);
    }
}