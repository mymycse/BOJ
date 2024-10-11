import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] s = br.readLine().split("-");

        int sum = Integer.MAX_VALUE;
        for ( String s1 : s ) {
            int temp = 0;

            String[] a = s1.split("\\+");

            for (String a1 : a)
                temp += Integer.parseInt(a1);

            if ( sum == Integer.MAX_VALUE )
                sum = temp;
            else
                sum -= temp;
        }

        System.out.println(sum);
    }
}