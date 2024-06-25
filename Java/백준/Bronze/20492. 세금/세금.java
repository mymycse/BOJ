import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();

        System.out.println(n/100*78 + " " + n/1000*956);

        sc.close();
    }
}
