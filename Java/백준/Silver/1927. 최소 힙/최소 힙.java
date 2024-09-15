import java.io.*;
import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        PriorityQueue<Integer> pq = new PriorityQueue<>();
        int N = Integer.parseInt(br.readLine());

        while ( N-- > 0 ) {
            int x = Integer.parseInt(br.readLine());
            
            if ( x == 0 ) {
                if ( pq.isEmpty() )
                    System.out.println(0);
                else
                    System.out.println(pq.poll());
            } else
                pq.add(x);
        }
    }
}