import java.io.*;
import java.util.StringTokenizer;

public class Main {
    static int N, M, max;
    static int[][] square;
    static boolean check ( int r1, int c1, int r2, int c2 ) {
        return square[r1][c1] == square[r1][c2] && square[r1][c2] == square[r2][c1] && square[r2][c1] == square[r2][c2] && (r2-r1) == (c2-c1);
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        square = new int[N][M];

        for ( int i = 0 ; i < N ; i++ ) {
            String str = br.readLine();
            for ( int j = 0 ; j < M ; j++ )
                square[i][j] = str.charAt(j) - '0';
        }

        max = 0;
        for ( int r1 = 0 ; r1 < N ; r1++ ) 
            for ( int c1 = 0 ; c1 < M ; c1++ ) 
                for ( int r2 = r1 ; r2 < N ; r2++ ) 
                    for ( int c2 = c1 ; c2 < M ; c2++ )
                        if ( check(r1, c1, r2, c2) ) {
                            int temp = (r2-r1+1)*(c2-c1+1);
                            max = Math.max(max, temp);
                        }

        System.out.println(max);
    }
}