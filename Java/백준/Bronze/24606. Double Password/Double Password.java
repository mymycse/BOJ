import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String pw1 = br.readLine();
        String pw2 = br.readLine();

        int sum = 1;

        for ( int i = 0 ; i < 4 ; i++ )
            if ( pw1.charAt(i) != pw2.charAt(i) )
                sum *= 2;

        System.out.println(sum);
    }
}