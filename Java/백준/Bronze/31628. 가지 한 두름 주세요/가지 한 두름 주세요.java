import java.io.*;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[][] ep = new String[10][10];

        for ( int i = 0 ; i < 10 ; i++ ) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for ( int j = 0 ; j < 10 ; j++ )
                ep[i][j] = st.nextToken();
        }

        for ( int i = 0 ; i < 10 ; i++ ) {
            HashSet<String> set = new HashSet<>();
            HashSet<String> set2 = new HashSet<>();
            for ( int j = 0 ; j < 10 ; j++ ) {
                set.add(ep[i][j]);
                set2.add(ep[j][i]);
            }

            if ( set.size() == 1 || set2.size() == 1 ) {
                System.out.println(1);
                return;
            }
        }

        System.out.println(0);
    }
}