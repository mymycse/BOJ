import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String word = sc.nextLine();
        int n = word.length();
        boolean checked = true;

        for ( int i = 0 ; i <= n/2 ; i++ )
            if ( word.charAt(i) != word.charAt(n-1-i) ) {
                checked = false;
                break;
            }

        System.out.println(checked);
    }
}