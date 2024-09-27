import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int N = Integer.parseInt(br.readLine());

        StringTokenizer s1 = new StringTokenizer(br.readLine());
        StringTokenizer s2 = new StringTokenizer(br.readLine());
        int t1, t2;
        
        int sum = 0;

        for ( int i = 0 ; i < N ; i++ ) {
            t1 = Integer.parseInt(s1.nextToken());
            t2 = Integer.parseInt(s2.nextToken());

            if ( t1 > t2 )
                sum += t1-t2;
        }

        System.out.println(sum);
    }
}