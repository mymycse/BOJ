import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		
		while ( true ) {
			String name = sc.next();
			if ( name.equals("#") )
				break;
			int age = sc.nextInt();
			int weight = sc.nextInt();

			String club = ( age > 17 || weight >= 80 ) ? "Senior" : "Junior";

			System.out.println(name + " " + club);
		}
	}
}