import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int sum = 0;

        StringTokenizer st = new StringTokenizer(br.readLine());
        for ( int i = 0 ; i < n ; i++ )
            sum += Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        for ( int i = 1 ; i < n ; i++ )
            sum -= Integer.parseInt(st.nextToken());

        System.out.println(sum);
    }
}