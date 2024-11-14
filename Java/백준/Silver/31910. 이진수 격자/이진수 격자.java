import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int[][] map = new int[N][N];
        for ( int i = 0 ; i < N ; i++ ) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for ( int j = 0 ; j < N ; j++ )
                map[i][j] = Integer.parseInt(st.nextToken());
        }
        
        String[][] res = new String[N][N];
        res[0][0] = ""+map[0][0];

        for ( int i = 1 ; i < N ; i++ ) {
            res[i][0] = res[i-1][0] + map[i][0];
            res[0][i] = res[0][i-1] + map[0][i];
        }

        for ( int i = 1 ; i < N ; i++ ) {
            for ( int j = 1 ; j < N ; j++ ) {
                if ( res[i][j-1].compareTo(res[i-1][j]) > 0 )
                    res[i][j] = res[i][j-1] + map[i][j];
                else
                    res[i][j] = res[i-1][j] + map[i][j];
            }
        }

        long result = Long.parseLong(res[N-1][N-1],2);
        System.out.println(result);
    }
}