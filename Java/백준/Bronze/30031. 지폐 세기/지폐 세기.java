import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int sum = 0;

        while ( n-- > 0 ) {
            int m = sc.nextInt();

            switch (m) {
                case 136:
                    sum += 1000;
                    break;
                case 142:
                    sum += 5000;
                    break;
                case 148:
                    sum += 10000;
                    break;
                case 154:
                    sum += 50000;
                    break;
            }

            sc.nextInt();
        }

        System.out.println(sum);
    }
}
