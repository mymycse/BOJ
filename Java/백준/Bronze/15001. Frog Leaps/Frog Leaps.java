import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int loc = Integer.parseInt(br.readLine());
        long energy = 0;

        while ( n-- > 1 ) {
            int now = Integer.parseInt(br.readLine());
            energy += Math.pow(loc-now,2);
            loc = now;
        }

        System.out.println(energy);
    }
}