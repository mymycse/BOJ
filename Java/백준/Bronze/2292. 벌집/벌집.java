import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int cnt = 1;
        int ans = 1;

        while ( cnt < n ) {
            cnt += ans*6;
            ans++;
        }

        System.out.println(ans);
    }
}