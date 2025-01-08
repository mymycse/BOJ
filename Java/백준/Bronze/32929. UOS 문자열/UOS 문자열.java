import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        
        if ( n%3 == 1 )
            System.out.print("U");
        else if ( n%3 == 2 )
            System.out.print("O");
        else
            System.out.print("S");
    }
}