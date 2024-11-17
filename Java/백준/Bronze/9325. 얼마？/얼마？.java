import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int tc = Integer.parseInt(br.readLine());

        while ( tc-- > 0 ) {
            int car = Integer.parseInt(br.readLine());
            int option = Integer.parseInt(br.readLine());

            while ( option-- > 0 ) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                int q = Integer.parseInt(st.nextToken());
                int p = Integer.parseInt(st.nextToken());

                car += q*p;
            }

            System.out.println(car);
        }
    }
}