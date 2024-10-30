import java.io.*;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        while ( n-- > 0 ) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int Ti = Integer.parseInt(st.nextToken());
            int max = 0;
            String k = "";

            HashMap<String, Integer> war = new HashMap<>();
            for ( int i = 0 ; i < Ti ; i++ ) {
                String t = st.nextToken();
                war.put(t, war.getOrDefault(t, 0)+1);

                if ( war.get(t) > max ) {
                    max = war.get(t);
                    k = t;
                }
            }

            if ( max*2 > Ti )
                System.out.println(k);
            else
                System.out.println("SYJKGW");
        }
    }
}