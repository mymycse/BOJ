import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int[] city = new int[N];

        
        int s = 0;
        int e = 0;
        StringTokenizer st = new StringTokenizer(br.readLine());
        for ( int i = 0 ; i < N ; i++ ) {
            city[i] = Integer.parseInt(st.nextToken());
            e = Math.max(e, city[i]);
        }

        int budget = Integer.parseInt(br.readLine());

        while ( s <= e ) {
            int mid = (s+e)/2;
            long temp = 0;

            for ( int i = 0 ; i < N ; i++ ) 
                if ( city[i] > mid )
                    temp += mid;
                else
                    temp += city[i];

            if ( temp <= budget )   s = mid+1;
            else                    e = mid-1;
        }

        System.out.println(e);
    }
}