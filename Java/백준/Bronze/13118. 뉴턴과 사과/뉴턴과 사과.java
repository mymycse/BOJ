import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] human = new int[5];

        for ( int i = 1 ; i < 5 ; i++ )
            human[i] = sc.nextInt();

        int n = sc.nextInt();
        int result = 0;

        for ( int i = 1 ; i < 5 ; i++ )
            if ( human[i] == n )
                result = i;

        System.out.println(result);
    }
}