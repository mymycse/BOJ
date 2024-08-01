
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        String[] chess = new String[n];
        
        for ( int i = 0 ; i < n ; i++ )
            chess[i] = br.readLine();

        String[] white = new String[8];
        String[] black = new String[8];

        for ( int i = 0 ; i < 8 ; i++ ) {
            if ( i%2 == 0 ) {
                white[i] = "WBWBWBWB";
                black[i] = "BWBWBWBW";
            } else {
                white[i] = "BWBWBWBW";
                black[i] = "WBWBWBWB";
            }
        }
        
        int res = Integer.MAX_VALUE;

        for ( int i = 0 ; i < n-7 ; i++ ) {
            for ( int j = 0 ; j < m-7 ; j++ ) {
                int Wcnt = 0;
                int Bcnt = 0;

                for ( int a = 0 ; a < 8 ; a++ )
                    for ( int b = 0 ; b < 8 ; b++ ) {
                        if ( white[a].charAt(b) != chess[a+i].charAt(b+j) )
                            Wcnt++;
                        if ( black[a].charAt(b) != chess[a+i].charAt(b+j) )
                            Bcnt++;
                    }

            res = Math.min(res, Math.min(Wcnt, Bcnt));
            }
        }

        System.out.println(res);
    }
}
