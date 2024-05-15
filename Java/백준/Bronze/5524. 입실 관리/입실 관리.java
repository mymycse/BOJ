import java.util.*;

public class Main {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		while ( n-- > 0 ) {
			String str = sc.next();
			char[] arr = str.toCharArray();
			for ( int i = 0 ; i < str.length() ; i++ ) 
				if ( arr[i] <= 'Z' ) 
					arr[i] = (char)(arr[i]+'a'-'A');
			String newStr = new String(arr);
			System.out.println(newStr);
		}
    }
}