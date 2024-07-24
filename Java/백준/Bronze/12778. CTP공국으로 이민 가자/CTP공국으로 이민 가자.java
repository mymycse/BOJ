import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());

        while ( t-- > 0 ) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int m = Integer.parseInt(st.nextToken());
            char c = st.nextToken().charAt(0);

            if ( c == 'C' ) {
                StringTokenizer str = new StringTokenizer(br.readLine());

                for ( int i = 0 ; i < m ; i++ )
                    System.out.print((int)(str.nextToken().charAt(0)-'A'+1) + " ");
            } else {
                StringTokenizer str = new StringTokenizer(br.readLine());

                for ( int i = 0 ; i < m ; i++ )
                    System.out.print((char)('A' + Integer.parseInt(str.nextToken()) - 1) + " "); 
            }
            System.out.println();
        }
    }
}