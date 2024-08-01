import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        while ( true ) {
            if ( str.contains("()") )
                str = str.replace("()", "");
            else
                break;
        }

        System.out.println(str.length());
    }
}