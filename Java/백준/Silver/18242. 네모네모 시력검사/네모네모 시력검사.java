import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int[][] test = new int[N][M];

        boolean start = true;
        int x1 = 0; // 사각형 좌측 상단 좌표
        int y1 = 0;
        int x2 = 0; // 사각형 우측 하단 좌표
        int y2 = 0;

        for ( int i = 0 ; i < N ; i++ ) {
            String str = br.readLine();
            for ( int j = 0 ; j < M ; j++ ) {
                if ( str.charAt(j) == '#' ) {
                    test[i][j] = 1;
                    if ( start ) { // 시작점
                        x1 = i;
                        y1 = j;
                        start = false;
                    } else { // 끝점
                        x2 = Math.max(x2,i);
                        y2 = Math.max(y2,j);
                    }
                } else
                    test[i][j] = 0;
            }
        }

        if ( test[x1][(y1+y2)/2] == 0 )
            System.out.println("UP");
        else if ( test[(x1+x2)/2][y1] == 0 )
            System.out.println("LEFT");
        else if ( test[x2][(y1+y2)/2] == 0 )
            System.out.println("DOWN");
        else
            System.out.println("RIGHT");
    }
}