import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int M = Integer.parseInt(br.readLine());
        HashMap<Integer, Integer> locker = new HashMap<>();

        int x, w;
        while ( M-- > 0 ) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int num = Integer.parseInt(st.nextToken());

            switch (num) {
                case 1:
                    x = Integer.parseInt(st.nextToken());
                    w = Integer.parseInt(st.nextToken());
                    locker.put(w,x);
                    break;
                case 2:
                    w = Integer.parseInt(st.nextToken());
                    System.out.println(locker.get(w));
                    break;
            }
        }
    }
}