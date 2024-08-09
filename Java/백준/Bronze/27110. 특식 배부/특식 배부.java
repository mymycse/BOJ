import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int favChicken = 0;

        for ( int i = 0 ; i < 3 ; i++ ) {
            int k = sc.nextInt();

            if ( k >= n )
                favChicken += n;
            else
                favChicken += k;
        }

        System.out.println(favChicken);
    }
}