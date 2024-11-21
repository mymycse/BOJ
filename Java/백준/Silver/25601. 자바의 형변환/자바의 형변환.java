import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        HashMap<String,String> map = new HashMap<>();

        for ( int i = 1 ; i < N ; i++ ) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            map.put(st.nextToken(), st.nextToken());
        }

        StringTokenizer st = new StringTokenizer(br.readLine());
        String v = st.nextToken();
        String k = st.nextToken();

        String tempV = v;
        
        boolean possible = true;
        while ( true ) {
            if ( !map.containsKey(tempV) ) {
                possible = false;
                break;
            }

            if ( map.get(tempV).equals(k) ) {
                System.out.println(1);
                break;
            }

            tempV = map.get(tempV);
        }

        if ( !possible )
            while ( true ) {
                if ( !map.containsKey(k) ) {
                    System.out.println(0);
                    break;
                }

                if ( map.get(k).equals(v) ) {
                    System.out.println(1);
                    break;
                }

                k = map.get(k);
            }
    }
}