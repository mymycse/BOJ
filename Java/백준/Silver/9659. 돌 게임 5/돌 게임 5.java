import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Long n = Long.parseLong(br.readLine());
        if (n % 2 == 0)
            System.out.println("CY");
        else
            System.out.println("SK");
    }
}