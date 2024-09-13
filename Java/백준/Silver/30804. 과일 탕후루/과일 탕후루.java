import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int[] fruits = new int[N];

        StringTokenizer str = new StringTokenizer(br.readLine());
        for ( int i = 0 ; i < N ; i++ )
            fruits[i] = Integer.parseInt(str.nextToken());

        int st = 0;
        int en = 0;
        int res = 0;
        int[] now = new int[10];

        int kind = 0;

        while ( st < N && en < N ) {
            if ( now[fruits[en]] == 0 )
                kind++;

            now[fruits[en]]++;

            while ( kind > 2 ) {
                now[fruits[st]]--;
                if ( now[fruits[st]] == 0 )
                    kind--;
                st++;
            }

            res = Math.max(res, en-st+1);
            en++;
        }

        System.out.println(res);
    }
}