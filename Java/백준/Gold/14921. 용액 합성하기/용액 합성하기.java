import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] liq = new int[N];

        StringTokenizer str = new StringTokenizer(br.readLine());
        for ( int i = 0 ; i < N ; i++ )
            liq[i] = Integer.parseInt(str.nextToken());

        int st = 0;
        int en = N-1;
        int res = liq[0]+liq[N-1];

        while ( st < en ) {
            int temp = liq[st]+liq[en];
            if ( Math.abs(temp) < Math.abs(res) )
                res = temp;
                
            if ( temp == 0 ) {
                res = 0;
                break;
            } else if ( temp < 0 )
                st++;
            else 
                en--;
        }

        System.out.println(res);
    }
}