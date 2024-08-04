import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        Deque<int[]> dq = new ArrayDeque<>();
        StringTokenizer st = new StringTokenizer(br.readLine());

        for ( int i = 1 ; i <= n ; i++ ) {
            int num = Integer.parseInt(st.nextToken());
            dq.add(new int[] {i, num});
        }

        while ( !dq.isEmpty() ) {
            int[] current = dq.pollFirst();
            int idx = current[0];
            int num = current[1];

            System.out.print( idx + " " );

            if ( dq.isEmpty() )
                break;

            if ( num > 0 )
                while ( num-- > 1 )
                    dq.addLast(dq.pollFirst());
            else
                while ( num++ < 0 )
                    dq.addFirst(dq.pollLast());
        }
    }
}