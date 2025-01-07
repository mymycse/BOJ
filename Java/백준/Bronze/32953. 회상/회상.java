import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        Map<Integer,Integer> std = new HashMap<>();
        Queue<Integer> stdlist = new LinkedList<Integer>();

        while ( N-- > 0 ) {
            int K = Integer.parseInt(br.readLine());
            st = new StringTokenizer(br.readLine());
            while ( K-- > 0 ) {
                int tempNum = Integer.parseInt(st.nextToken());

                if ( std.containsKey(tempNum) ) {
                    std.replace(tempNum, std.get(tempNum)+1);
                } else {
                    stdlist.add(tempNum);
                    std.put(tempNum, 1);
                }
            }
        }

        int cnt = 0;
        while ( !stdlist.isEmpty() ) {
            int stdNum = stdlist.poll();
            if ( std.get(stdNum) >= M )
                cnt++;
        }

        System.out.println(cnt);
    }
}