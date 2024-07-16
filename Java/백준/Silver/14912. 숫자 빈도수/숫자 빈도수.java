import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        char digit = sc.next().charAt(0);
        int freq = 0;

        for ( int i = 1 ; i <= num ; i++ ) {
            String s = Integer.toString(i);

            for ( int j = 0 ; j < s.length() ; j++ )
                if ( s.charAt(j) == digit )
                    freq++;
        }

        System.out.println(freq);
    }
}