import java.io.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    static int n, m, max, x, y, nx, ny;
    static int[][] dough;
    static boolean[][] visited, init;
    static int[] dx = {1,0,-1,0};
    static int[] dy = {0,1,0,-1};
    static Queue<int[]> q;
    static void bfs () {
        while ( !q.isEmpty() ) {
            int[] loc = q.poll();

            nx = loc[0];
            ny = loc[1];

            for ( int dir = 0 ; dir < 4 ; dir++ ) {
                x = nx + dx[dir];
                y = ny + dy[dir];

                if ( x < 1 || x > n || y < 1 || y > m ) continue;
                if ( init[x][y] )   continue;
                
                //if ( x == 1 || x == n || y == 1 || y == m ) {
                //    dough[x][y] = 1;
                //    continue;
                //}
                if ( visited[x][y] == true )    continue;
                
                dough[x][y] = dough[nx][ny]+1;
                q.add(new int[]{x,y});
                visited[x][y] = true;

                max = Math.max(max, dough[x][y]);
            }
        }

        System.out.println(max);
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        q = new LinkedList<>();
        init = new boolean[n+2][m+2];
        dough = new int[n+2][m+2];
        visited = new boolean[n+2][m+2];
        max = 1;

        for ( int i = 0 ; i < n+2 ; i++ ) {
            visited[i][0] = true;
            visited[i][m+1] = true;
            q.add(new int[]{i,0});
            q.add(new int[]{i,m+1});
        }

        for ( int j = 0 ; j < m+2 ; j++ ) {
            visited[0][j] = true;
            visited[n+1][j] = true;
            q.add(new int[]{0,j});
            q.add(new int[]{n+1,j});
        }

        for ( int i = 1 ; i < n+1 ; i++ ) {
            String str = br.readLine();
            for ( int j = 1 ; j < m+1 ; j++ ) {
                init[i][j] = str.charAt(j-1) == '-';
                if ( init[i][j] ) {
                    q.add(new int[]{i,j});
                    visited[i][j] = true;
                }
            }
        }

        bfs();
    }
}