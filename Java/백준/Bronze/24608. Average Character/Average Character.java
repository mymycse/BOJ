import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        int sum = 0;
        for ( int i = 0 ; i < str.length() ; i++ )
            sum += (int)str.charAt(i);

        sum /= str.length();

        System.out.println((char)sum);
    }
}