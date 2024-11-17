import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        br.readLine();
        String A = br.readLine();
        String B = br.readLine();

        A = A.replace(" ", "");
        B = B.replace(" ", "");

        if ( Long.parseLong(A) > Long.parseLong(B) )
            System.out.println(B);
        else
            System.out.println(A);
    }
}