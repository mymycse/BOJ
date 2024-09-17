import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer str = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(str.nextToken());
        int K = Integer.parseInt(str.nextToken());
        int[] diamonds = new int[N];

        for ( int i = 0 ; i < N ; i++ )
            diamonds[i] = Integer.parseInt(br.readLine());

        Arrays.sort(diamonds);

        int st = 0;
        int en = 0;
        int max = 0;

        while ( en < N ) {
            int diff = diamonds[en] - diamonds[st];
            if ( diff <= K ) {
                max = Math.max(max, en-st+1);
                en++;
            } else
                st++;
        }

        System.out.println(max);
    }
}