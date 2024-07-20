import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String[] words = new String[str.length()];

        for ( int i = 0 ; i < str.length() ; i++ )
            words[i] = str.substring(i);
        
        Arrays.sort(words);

        for ( int i = 0 ; i < str.length() ; i++ )
            System.out.println(words[i]);
    }
}