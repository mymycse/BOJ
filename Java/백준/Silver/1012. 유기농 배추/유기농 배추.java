import java.io.*;
import java.util.*;

public class Main {
    static int M, N, K, cnt;
    static int[][] cab;
    static boolean[][] b;
    static int[] dx = {1,0,-1,0};
    static int[] dy = {0,1,0,-1};
    static void bfs() {
        for ( int i = 0 ; i < M ; i++ )
            for ( int j = 0 ; j < N ; j++ ) {
                if ( cab[i][j] == 0 || b[i][j] )    continue;

                cnt++;
                b[i][j] = true;

                Queue<int[]> q = new LinkedList<>();
                q.add(new int[]{i,j});

                while ( !q.isEmpty() ) {
                    int[] loc = q.poll();

                    for ( int dir = 0 ; dir < 4 ; dir++ ) {
                        int x = loc[0] + dx[dir];
                        int y = loc[1] + dy[dir];

                        if ( x < 0 || x >= M || y < 0 || y >= N )   continue;
                        if ( b[x][y] || cab[x][y] == 0 )    continue;

                        b[x][y] = true;
                        q.add(new int[]{x,y});
                    }
                }
            }
    } 
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());
        while ( T-- > 0 ) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            M = Integer.parseInt(st.nextToken());
            N = Integer.parseInt(st.nextToken());
            K = Integer.parseInt(st.nextToken());

            cnt = 0;
            cab = new int[M][N];
            b = new boolean[M][N];

            while ( K-- > 0 ) {
                st = new StringTokenizer(br.readLine());
                cab[Integer.parseInt(st.nextToken())][Integer.parseInt(st.nextToken())] = 1;
            }

            bfs();
            
            System.out.println(cnt);
        }
    }
}