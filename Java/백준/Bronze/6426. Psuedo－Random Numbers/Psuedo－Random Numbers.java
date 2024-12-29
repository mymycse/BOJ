import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int cnt = 1;
        while ( true ) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int Z = Integer.parseInt(st.nextToken());
            int I = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());
            int L = Integer.parseInt(st.nextToken());

            if ( Z == 0 && I == 0 && M == 0 && L == 0 )
                break;

            Map <Integer,Integer> map = new HashMap<>();
            int cur = L;
            int step = 0;

            while ( !map.containsKey(cur) ) {
                map.put(cur, step++);
                cur = (Z*cur+I)%M;
            }

            int result = step-map.get(cur);
            System.out.println("Case "+ cnt++ +": "+result);
        }
    }
}