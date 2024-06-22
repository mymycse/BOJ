import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        boolean elected = true;
        
        int n = sc.nextInt();
        int carlos = sc.nextInt();

        while ( n-- > 1 ) {
            int k = sc.nextInt();
            if ( k > carlos ) {
                elected = false;
                System.out.print('N');
                break;
            }
        }
        if ( elected )
            System.out.println('S');

        sc.close();
    }
}