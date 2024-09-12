import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(br.readLine());

        int cnt = 0;

        for ( int i = 0 ; i < 3 ; i++ ) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            boolean check = false;

            for ( int j = 0 ; j < n ; j++ ) {
                int k = Integer.parseInt(st.nextToken());
                if ( k == 7 ) {
                    check = true;
                    break;
                }
            }

            if ( check )
                cnt++;
        }

        if ( cnt == 3 )
            System.out.println(777);
        else
            System.out.println(0);
    }
}