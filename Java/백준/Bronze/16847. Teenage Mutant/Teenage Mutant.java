import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int tc = Integer.parseInt(br.readLine());

        for ( int i = 1 ; i <= tc ; i++ ) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int k = Integer.parseInt(st.nextToken());

            int res = 0;
            String myself = br.readLine();
            String[] ancestors = new String[n];
            for ( int j = 0 ; j < n ; j++ )
                ancestors[j] = br.readLine();

            for ( int a = 0 ; a < k ; a++ ) {
                boolean usual = false;
                for ( int b = 0 ; b < n ; b++ )
                    if ( ancestors[b].charAt(a) == myself.charAt(a) ) {
                        usual = true;
                        break;
                    }
                if ( !usual )
                    res++;
            }

            System.out.printf("Data Set %d:\n%d/%d\n\n", i, res, k);
        }
    }
}