import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int[] arr = new int[128];
        while ( N-- > 0 ) {
            String str = br.readLine();
            for ( int i = 0 ; i < str.length() ; i++ ) {
                char c = str.charAt(i);
                if ( c == ' ' ) continue;

                arr[(int)c]++;
            }
        }

        for ( int i = 0 ; i < 128 ; i++ ) {
            if ( arr[i] == 0 )  continue;

            System.out.println((char)i + " " + arr[i]);
        }
    }
}