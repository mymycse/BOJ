import java.io.*;
import java.util.*;

public class Main {
    static int N, M, cnt;
    static int[][] m;
    static boolean[][] b;
    static boolean[][] top;
    static int[] dx = {1,1,1,0,0,-1,-1,-1};
    static int[] dy = {0,-1,1,-1,1,-1,0,1};
    public static void bfs(int i, int j) {
        b = new boolean[N][M];
        b[i][j] = true;

        Queue<int[]> q = new LinkedList<>();
        q.add(new int[]{i,j});

        ArrayList<int[]> tlist = new ArrayList<>();

        while ( !q.isEmpty() ) {
            int[] loc = q.poll();
            int tempX = loc[0];
            int tempY = loc[1];

            for ( int dir = 0 ; dir < dx.length ; dir++ ) {
                int x = tempX + dx[dir];
                int y = tempY + dy[dir];

                if ( x < 0 || x >= N || y < 0 || y >= M )   continue;
                if ( b[x][y] || m[x][y] == 0 )  continue;
                if ( m[x][y] > m[tempX][tempY] )    return;

                if ( m[tempX][tempY] == m[x][y] ) {
                    q.add(new int[]{x,y});
                    tlist.add(new int[]{x,y});
                }

                b[x][y] = true;
            }
        }

        for ( int idx = 0 ; idx < tlist.size() ; idx++ ) {
            int[] loc = tlist.get(idx);
            top[loc[0]][loc[1]] = true;
        }

        cnt++;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        m = new int[N][M];
        for ( int i = 0 ; i < N ; i++ ) {
            st = new StringTokenizer(br.readLine());
            for ( int j = 0 ; j < M ; j++ )
                m[i][j] = Integer.parseInt(st.nextToken());
        }

        top = new boolean[N][M];
        cnt = 0;
        
        for ( int i = 0 ; i < N ; i++ )
            for ( int j = 0 ; j < M ; j++ )
                if ( m[i][j] != 0 && !top[i][j] )
                    bfs(i,j);

        System.out.println(cnt);
    }
}