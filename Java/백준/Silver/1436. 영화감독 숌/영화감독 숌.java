import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int cnt = 0;
        int num = 666;

        while ( cnt != n ) {
            if ( String.valueOf(num).contains("666") )
                cnt++;
            num++;
        }

        System.out.println(--num);
    }
}