import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] science = new int[4];
        int[] social = new int[2];
        int total = 0;

        for ( int i = 0 ; i < 4 ; i++ )
            science[i] += sc.nextInt();

        social[0] = sc.nextInt();
        social[1] = sc.nextInt();

        Arrays.sort(science);
        Arrays.sort(social);

        for ( int i = 1 ; i < 4 ; i++ )
            total += science[i];
        
        total += social[1];

        System.out.println(total);
        sc.close();
    }
}