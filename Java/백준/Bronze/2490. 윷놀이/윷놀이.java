import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] playing = {"D","C","B","A","E"};

        for ( int i = 0 ; i < 3 ; i++ ) {
            int cnt = 0;

            for ( int j = 0 ; j < 4 ; j++ )
                if ( sc.nextInt() == 1 )
                    cnt++;

            System.out.println(playing[cnt]);
        }

        sc.close();
    }
}