import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String S = br.readLine();
        int cnt = 0;

        for ( int i = 0 ; i < N ; i++ ) {
            for ( int j = i+1 ; j <= N ; j++ ) {
                if ( (j-i) < 2 )  continue;
                String str = S.substring(i,j);

                if ( str.charAt(0) != 'A' || str.charAt(str.length()-1) != 'A' )
                    continue;
                    
                boolean ctin = false;
                int ncnt = 0;
                
                for ( int k = 1 ; k < str.length()-1 ; k++ ){
                    if ( str.charAt(k) == 'A' ) {
                        ctin = true;
                        break;
                    }
                    if ( str.charAt(k) == 'N' ) {
                        ncnt++;
                        if ( ncnt == 2 ) {
                            ctin = true;
                            break;
                        }
                    }
                }

                if ( ctin || ncnt == 0 ) continue;
                cnt++;
            }
        }

        System.out.println(cnt);
    }
}