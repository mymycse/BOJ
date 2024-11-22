import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        int[] cats = new int[N];
        st = new StringTokenizer(br.readLine());
        for ( int i = 0 ; i < N ; i++ )
            cats[i] = Integer.parseInt(st.nextToken());

        Arrays.sort(cats);

        int s = 0;
        int e = N-1;
        int result = 0;

        while ( s < e ) {
            int temp = cats[s]+cats[e];
            if ( temp > K )
                e--;
            else {
                result++;
                s++;
                e--;
            }
        }

        System.out.println(result);
    }
}