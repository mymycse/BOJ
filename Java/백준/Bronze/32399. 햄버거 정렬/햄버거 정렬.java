import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String hamburger = br.readLine();

        if ( hamburger.contains("(1)"))
            System.out.println(0);
        else if ( hamburger.contains("(1") || hamburger.contains("1)") || hamburger.contains("()") )
            System.out.println(1);
        else 
            System.out.println(2);
    }
}