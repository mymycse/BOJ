import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        int cnt = 0;

        for ( int i = 0 ; i < str.length() ; i++ ) {
            char c = str.charAt(i);
            if ( c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' )
                cnt++;
        }

        System.out.println(cnt);
        sc.close();
    }
}