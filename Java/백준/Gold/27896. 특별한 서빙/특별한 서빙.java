import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        int cnt = 0;
        long sum = 0L;
        st = new StringTokenizer(br.readLine());

        while ( n-- > 0 ) {
            int x = Integer.parseInt(st.nextToken());

            pq.add(x);
            sum += x;

            while ( sum >= m ) {
                cnt++;
                sum -= pq.poll()*2;
            }
        }

        System.out.println(cnt);
    }
}