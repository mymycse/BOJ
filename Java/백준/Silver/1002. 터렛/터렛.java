
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());

        while ( t-- > 0 ) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            int x1 = Integer.parseInt(st.nextToken());
            int y1 = Integer.parseInt(st.nextToken());
            int r1 = Integer.parseInt(st.nextToken());

            int x2 = Integer.parseInt(st.nextToken());
            int y2 = Integer.parseInt(st.nextToken());
            int r2 = Integer.parseInt(st.nextToken());

            double dist = Math.sqrt(Math.pow(x1-x2, 2) + Math.pow(y1-y2,2));
            int diff = Math.abs(r1-r2);
            int sum = r1+r2;

            int result = 0;

            if ( dist == 0 && diff == 0 )
                result = -1;
            else if ( dist == sum || dist == diff )
                result = 1;
            else if ( diff < dist && dist < sum )
                result = 2;

            System.out.println(result);
        }
    }
}