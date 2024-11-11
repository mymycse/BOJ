import java.io.*;
import java.util.*;

public class Main {
    static int N;
    static int[][] apt;
    static boolean[][] b;
    static int[] dx = {1,0,-1,0};
    static int[] dy = {0,1,0,-1};
    static ArrayList<Integer> num = new ArrayList<>();
    static void bfs() {
        for ( int i = 0 ; i < N ; i++ )
            for ( int j = 0 ; j <  N ; j++ ) {
                if ( apt[i][j] == 0 || b[i][j] )    continue;
                b[i][j] = true;
                int temp = 1;

                Queue<int[]> q = new LinkedList<>();
                q.add(new int[]{i,j});
                while ( !q.isEmpty() ) {
                    int[] loc = q.poll();

                    for ( int dir = 0 ; dir < 4 ; dir++ ) {
                        int x = loc[0] + dx[dir];
                        int y = loc[1] + dy[dir];

                        if ( x < 0 || x >= N || y < 0 || y >= N )   continue;
                        if ( b[x][y] || apt[x][y] == 0 )    continue;

                        b[x][y] = true;
                        q.add(new int[]{x,y});
                        temp++;
                    }
                }

                num.add(temp);
            }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());
        b = new boolean[N][N];
        apt = new int[N][N];

        for ( int i = 0 ; i < N ; i++ ) {
            String str = br.readLine();
            for ( int j = 0 ; j < N ; j++ )
                apt[i][j] = str.charAt(j)-'0';
        }

        bfs();

        System.out.println(num.size());
        Integer[] res = num.toArray(Integer[]::new);
        Arrays.sort(res);

        for ( Integer r : res )
            System.out.println(r);
    }
}