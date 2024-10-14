import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();

        char[] y = {'Y','O','N','S','E','I'};
        char[] k = {'K','O','R','E','A'};

        int yonsei = 0;
        int korea = 0;

        for ( int i = 0 ; i < str.length() ; i++ ) {
            char c = str.charAt(i);

            if ( c == y[yonsei] )
                yonsei++;
            if ( c == k[korea] )
                korea++;

            if ( yonsei == 6 ) {
                System.out.println("YONSEI");
                break;
            }

            if ( korea == 5 ) {
                System.out.println("KOREA");
                break;
            } 
        }
    }
}