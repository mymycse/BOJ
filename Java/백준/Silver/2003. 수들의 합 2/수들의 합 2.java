import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st1 = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st1.nextToken());
        int m = Integer.parseInt(st1.nextToken());

        StringTokenizer st2 = new StringTokenizer(br.readLine());

        int[] arr = new int[n];
        
        for ( int i = 0 ; i < n ; i++ ) 
            arr[i] = Integer.parseInt(st2.nextToken());

        int sum=0;
        int start = 0, end = 0, cnt = 0;

        while ( true ) {
            if ( sum >= m )
                sum -= arr[start++];
            else if ( end == n )
                break;
            else
                sum += arr[end++];

            if ( sum == m )
                cnt++;
        }

        System.out.println(cnt);
    }
}