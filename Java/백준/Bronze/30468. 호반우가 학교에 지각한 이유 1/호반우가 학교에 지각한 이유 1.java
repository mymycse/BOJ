import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int sum = 0;

        for ( int i = 0 ; i < 4 ; i++ )
            sum += Integer.parseInt(st.nextToken());

        int n = Integer.parseInt(st.nextToken());

        if ( sum >= n*4 )
            System.out.println(0);
        else
            System.out.println(n*4 - sum);
    }
}