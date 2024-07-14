import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while ( t-- > 0 ) {
            int n = sc.nextInt();
            int cnt = 0;
            String[] cities = new String[n];
            for ( int i = 0 ; i < n ; i++ ) {
                String city = sc.next();
                boolean visited = false;
                for ( int j = 0 ; j < cnt ; j++ ) 
                    if ( city.equals(cities[j]) ) {
                        visited = true;
                        break;
                    }
                
                if ( !visited ) {
                    cities[cnt] = city;
                    cnt++;
                }
            }

            System.out.println(cnt);
        }

        sc.close();
    }
}