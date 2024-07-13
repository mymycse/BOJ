import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] meals = new int[3];

        for ( int i = 0 ; i < 3 ; i++ )
            meals[i] = sc.nextInt();

        int result = 0;

        for ( int i = 0 ; i < 3 ; i++ ) {
            int n = sc.nextInt();
            if ( n - meals[i] > 0 )
                result += n - meals[i];
        }

        System.out.println(result);
        sc.close();
    }
}