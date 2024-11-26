import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[][] candy = new int[N][M];
        for ( int i = 0 ; i < N ; i++ ) {
            st = new StringTokenizer(br.readLine());
            for ( int j = 0 ; j < M ; j++ )
                candy[i][j] = Integer.parseInt(st.nextToken());
        }

        int[][] map = new int[N][M];
        map[0][0] = candy[0][0];
        for ( int i = 1 ; i < N ; i++ )
            map[i][0] = map[i-1][0]+candy[i][0];
        for ( int j = 1 ; j < M ; j++ )
            map[0][j] = map[0][j-1]+candy[0][j];

        for ( int i = 1 ; i < N ; i++ ) {
            for ( int j = 1 ; j < M ; j++ )
                map[i][j] = Math.max(map[i-1][j], map[i][j-1])+candy[i][j];
        }

        System.out.println(map[N-1][M-1]);
    }
}