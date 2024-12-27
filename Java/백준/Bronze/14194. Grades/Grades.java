import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        while ( T-- > 0 ) {
            int n = Integer.parseInt(br.readLine());
            int sum = 0;
            int[] arr = new int[n];
            StringTokenizer st = new StringTokenizer(br.readLine());
            for ( int i = 0 ; i < n ; i++ ){
                arr[i] = Integer.parseInt(st.nextToken());
                sum += arr[i];
            }

            Arrays.sort(arr);

            double A = (arr[0]+arr[n-1])/2.0;
            double B = sum/(double)n;

            if ( Math.abs(A-B) < 1 )
                System.out.println("Yes");
            else
                System.out.println("No");
        }
    }
}