import java.io.*;
import java.util.*;

public class Main {
    static int N, M, A, B;
    static int[][] d;
    static int bfs() {
        boolean[] visited = new boolean[N+1];
        for ( int i = 0 ; i < M ; i++ ) {
            int tempA = d[i][0];
            int tempB = d[i][1];

            for ( int j = tempA ; j <= tempB ; j++ )
                visited[j] = true;
        }

        Queue<int[]> q = new LinkedList<>();
        q.add(new int[]{0,0});
        visited[0] = true;
        while ( !q.isEmpty() ) {
            int[] cur = q.poll();
            int dogs = cur[0];
            int cnt = cur[1];

            if ( dogs == N )
                return cnt;
            
            int[] temp = new int[]{dogs+A, dogs+B};
            for ( int tmp : temp ) {
                if ( tmp <= N && !visited[tmp] ) {
                    visited[tmp] = true;
                    q.add(new int[]{tmp,cnt+1});
                }
            }
        }
        return -1;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        A = Integer.parseInt(st.nextToken());
        B = Integer.parseInt(st.nextToken());

        d = new int[M][2];
        for ( int i = 0 ; i < M ; i++ ) {
            st = new StringTokenizer(br.readLine());
            d[i][0] = Integer.parseInt(st.nextToken());
            d[i][1] = Integer.parseInt(st.nextToken());
        }

        System.out.println(bfs());
    }
}