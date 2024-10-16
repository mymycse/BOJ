import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int k = Integer.parseInt(br.readLine());

        double result = (double)k/100;
        result += 25;

        if ( result > 2000 )
            result = 2000;
        else if ( result < 100 )
            result = 100;
            
        System.out.printf("%.2f",result);
    }
}