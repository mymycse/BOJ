import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int tc = Integer.parseInt(br.readLine());

        while ( tc-- > 0 ) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());

            LinkedList<int[]> q = new LinkedList<>();
            st = new StringTokenizer(br.readLine());
            for ( int i = 0 ; i < N ; i++ )
                q.add(new int[]{i,Integer.parseInt(st.nextToken())});

            int cnt = 0;
            while ( !q.isEmpty() ) {
                int[] temp = q.poll();
                boolean max = true;

                for ( int i = 0 ; i < q.size() ; i++ ) {
                    if ( temp[1] < q.get(i)[1] ) {
                        q.add(temp);
                        for ( int j = 0 ; j < i ; j++ )
                            q.add(q.poll());
                        
                            max = false;
                        break;
                    }
                }

                if ( !max )
                    continue;
                
                cnt++;

                if ( temp[0] == M ) {
                    System.out.println(cnt);
                    break;
                }
            }
        }
    }
}