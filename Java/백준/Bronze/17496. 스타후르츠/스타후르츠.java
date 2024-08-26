import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int t = sc.nextInt();
        int c = sc.nextInt();
        int p = sc.nextInt();

        int total = (n-1)/t * c * p;
        
        System.out.println(total);
    }
}