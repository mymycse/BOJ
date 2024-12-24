import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int set = 1;

        while ( true ) {
            int n = Integer.parseInt(br.readLine());
            if ( n == 0 )
                break;

            int[] arr = new int[n];
            StringTokenizer st = new StringTokenizer(br.readLine());

            int sum = 0;
            for ( int i = 0 ; i < n ; i++ ) {
                arr[i] = Integer.parseInt(st.nextToken());
                sum += arr[i];
            }

            sum /= n;
            int res = 0;

            for ( int i = 0 ; i < n ; i++ ) {
                if ( arr[i] < sum ) 
                    res += sum-arr[i];
            }

            System.out.println("Set #"+set++);
            System.out.println("The minimum number of moves is "+res+".\n");
        }
    }
}