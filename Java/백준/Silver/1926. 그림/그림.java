import java.io.*;
import java.util.*;

public class Main {
    static int r, c, x, y, cnt, size, max;
    static int[][] map;
    static boolean[][] visited;
    static int[] dx = {1,0,-1,0};
    static int[] dy = {0,1,0,-1};
    public static void bfs() {
        for ( int i = 0 ; i < r ; i++ )
            for ( int j = 0 ; j < c ; j++ ) {
                if ( map[i][j] == 0 || visited[i][j] )  continue;

                cnt++;
                visited[i][j] = true;

                Queue<int[]> q = new LinkedList<>();
                q.add(new int[]{i,j});
                size = 0;

                while ( !q.isEmpty() ) {
                    size++;
                    int[] loc = q.poll();

                    for ( int dir = 0 ; dir < 4 ; dir++ ) {
                        int x = loc[0] + dx[dir];
                        int y = loc[1] + dy[dir];

                        if ( x < 0 || x >= r || y < 0 || y >= c ) continue;
                        if ( visited[x][y] || map[x][y] == 0 ) continue;

                        visited[x][y] = true;
                        q.add(new int[]{x,y});
                    }
                }
                
                max = Math.max(max,size);
            }

        
        System.out.println(cnt);
        System.out.println(max);
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        r = Integer.parseInt(st.nextToken());
        c = Integer.parseInt(st.nextToken());

        map = new int[r][c];
        for ( int i = 0 ; i < r ; i++ ) {
            st = new StringTokenizer(br.readLine());
            for ( int j = 0 ; j < c ; j++ )
                map[i][j] = Integer.parseInt(st.nextToken());
        }

        visited = new boolean[r][c];
        cnt = 0;
        max = 0;

        bfs();
    }
}