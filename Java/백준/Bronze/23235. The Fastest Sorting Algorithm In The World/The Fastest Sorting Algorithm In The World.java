import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int idx = 1;
        while ( true ) {
            String str = br.readLine();

            if ( str.charAt(0) == '0' )
                break;

            System.out.printf("Case %d: Sorting... done!\n", idx++);
        }
    }
}