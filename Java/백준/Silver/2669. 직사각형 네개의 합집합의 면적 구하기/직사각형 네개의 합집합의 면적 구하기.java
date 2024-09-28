import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        boolean[][] sq = new boolean[100][100];
        int area = 0;

        for ( int i = 0 ; i < 4 ; i++ ) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            int x1 = Integer.parseInt(st.nextToken());
            int y1 = Integer.parseInt(st.nextToken());
            int x2 = Integer.parseInt(st.nextToken());
            int y2 = Integer.parseInt(st.nextToken());

            for ( int x = x1 ; x < x2 ; x++ )
                for ( int y = y1 ; y < y2 ; y++ ) {
                    if ( !sq[x][y] )
                        area++;
                    sq[x][y] = true;
                }
        }
        
        System.out.println(area);
    }
}