import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int num1 = N;
        int num2 = M;
        int cnt = 2;

        while ( true ) {
            int temp = (num1+num2)%10;
            cnt++;

            if ( N == num2 && M == temp ) {
                System.out.println(cnt);
                break;
            }

            num1 = num2;
            num2 = temp;
        }
    }
}