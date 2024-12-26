import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());
        while ( t-- > 0 ) {
            int k = Integer.parseInt(br.readLine());
            int pp = 0;
            while ( k-- > 0 ) {
                pp *= 2;
                pp++;
            }

            System.out.println(pp);
        }
    }
}