import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        while ( n-- > 0 ) {
            boolean[] bank1 = new boolean[26];
            boolean[] bank2 = new boolean[26];
            StringTokenizer st = new StringTokenizer(br.readLine());

            String fir = st.nextToken();
            String sec = st.nextToken();

            for ( int i = 0 ; i < fir.length() ; i++ ) 
                bank1[fir.charAt(i)-'A'] = true;

            for ( int i = 0 ; i < sec.length() ; i++ ) 
                bank2[sec.charAt(i)-'A'] = true;
            
            boolean res = true;

            for ( int i = 0 ; i < 26 ; i++ )
                if ( bank1[i] != bank2[i] ) {
                    res = false;
                    break;
                }

            System.out.println( res ? "YES" : "NO" );
        }
    }
}