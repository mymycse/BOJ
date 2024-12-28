import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println();

        while ( true ) {
            String str = br.readLine();
            
            if ( str.equals("I quacked the code!"))
                break;
            
            if ( str.endsWith("?"))
                System.out.println("Quack!\n");
            else if ( str.endsWith("."))
                System.out.println("*Nod*\n");

        }
    }
}