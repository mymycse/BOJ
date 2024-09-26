import java.io.*;
import java.util.*;

public class Main {
    static int n, m, x, y, nx, ny, now;
    static int[][] maze, sol;
    static boolean[][] visited;
    static int[] dx = {1,0,-1,0};
    static int[] dy = {0,1,0,-1};
    public static void bfs() {
        Queue<int[]> q = new LinkedList<>();
        q.add(new int[]{0,0});
        visited[0][0] = true;

        while ( !q.isEmpty() ) {
            int[] loc = q.poll();

            nx = loc[0];
            ny = loc[1];

            for ( int dir = 0 ; dir < 4 ; dir++ ) {
                x = nx+ dx[dir];
                y = ny + dy[dir];

                if ( x < 0 || x >= n || y < 0 || y >= m )   continue;
                if ( maze[x][y] == 0 )  continue;
                if ( visited[x][y] )    continue;

                sol[x][y] = sol[nx][ny]+1;

                q.add(new int[]{x,y});
                visited[x][y] = true;
            }
        }

        System.out.println(sol[n-1][m-1]);
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        maze = new int[n][m];
        visited = new boolean[n][m];

        for ( int i = 0 ; i < n ; i++ ) {
            String str = br.readLine();
            for ( int j = 0 ; j < m ; j++ )
                maze[i][j] = str.charAt(j)-'0';
        }

        sol = new int[n][m];
        sol[0][0] = 1;
        bfs();
    }
}