import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        int len = str.length();
        int now = 1;

        for ( int i = 0 ; i < len ; i++ ) {
            char move = str.charAt(i);

            switch (move) {
                case 'A':
                    if ( now == 1 )
                        now = 2;
                    else if ( now == 2 )
                        now = 1;
                    break;
                case 'B':
                    if ( now == 2 )
                        now = 3;
                    else if ( now == 3 )
                        now = 2;
                    break;
                case 'C':
                    if ( now == 1 )
                        now = 3;
                    else if ( now == 3 )
                        now = 1;
                    break;
            }
        }

        System.out.println(now);
    }
}