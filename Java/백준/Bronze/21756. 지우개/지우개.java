import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        Queue<Integer> q = new LinkedList<>();
        for ( int i = 1 ; i <= N ; i++ )
            q.add(i);

        while ( true ) {
            if ( q.size() == 1 ) {
                System.out.println(q.poll());
                break;
            }

            int range = q.size();
            for ( int i = 0 ; i < range ; i++ ) {
                if ( i%2 == 0 )
                    q.poll();
                else
                    q.add(q.poll());
            }
        }
    }
}