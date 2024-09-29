import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    static int N, T;
    static int[] bulbs;
    static int lowerCase(int lo) {
        int temp = 0;
        while ( true ) {
            if ( T%lo == 0 )
                return temp;
            lo--;
            temp++;
        }
    }
    static int upperCase(int up) {
        int temp = 0;
        while ( true ) {
            if ( T%up == 0 )
                return temp;
            up++;
            temp++;
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        T = Integer.parseInt(st.nextToken());

        bulbs = new int[N];

        st = new StringTokenizer(br.readLine());
        for ( int i = 0 ; i < N ; i++ )
            bulbs[i] = Integer.parseInt(st.nextToken());

        Arrays.sort(bulbs);

        int res = 0;

        for ( int i = N-1 ; i >= 0 ; i-- ) {
            if ( bulbs[i] > T ) {
                res += bulbs[i]-T;
                bulbs[i] = T;
            }
        }

        for ( int i = 0 ; i < N ; i++ )
            if ( T%bulbs[i] != 0 ) {
                int a = upperCase(bulbs[i]);
                int b = lowerCase(bulbs[i]);

                if ( a < b ) {
                    res += a;
                    bulbs[i] += a;
                } else {
                    res += b;
                    bulbs[i] -= b;
                }
            }

        System.out.println(res);
    }
}