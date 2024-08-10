import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static int gcd ( int m , int n ) {
        if ( n == 0 )
            return m;
        return gcd(n, m%n);
    }
    public static void main(String[] args) throws  IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());

        while ( t-- > 0 ) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            int cnt = Integer.parseInt(st.nextToken());
            int[] arr = new int[cnt];

            for ( int i = 0 ; i < cnt ; i++ )
                arr[i] = Integer.parseInt(st.nextToken());

            Arrays.sort(arr);
            long result = 0;

            for ( int i = 0 ; i < cnt ; i++ ) 
                for ( int j = i+1 ; j < cnt ; j++ )
                    result += gcd(arr[i],arr[j]);
            
            System.out.println(result);
        }
    }
}