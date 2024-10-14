import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int L = Integer.parseInt(st.nextToken());
        int x = Integer.parseInt(st.nextToken());

        int limit = 0;
        int cnt = 0;
        while ( x-- > 0 ) {
            st = new StringTokenizer(br.readLine());
            String w = st.nextToken();
            int p = Integer.parseInt(st.nextToken());

            if ( w.equals("enter") ) {
                if ( L >= limit + p )
                    limit += p;
                else
                    cnt++;
            } else {
                limit -= p;
            }
        }

        System.out.println(cnt);
    }
}