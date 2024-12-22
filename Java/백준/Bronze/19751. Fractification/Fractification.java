import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] frac = new int[4];
        for ( int i = 0 ; i < 4 ; i++ )
            frac[i] = Integer.parseInt(st.nextToken());

        Arrays.sort(frac);

        System.out.println(frac[0] + " " + frac[2] + " " + frac[1] + " " + frac[3]);
    }
}