import java.util.*;

public class Main {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int area = 0;
		int[][] map = new int[100][100];

		for ( int i = 0 ; i < n ; i++ ) {
			int x = sc.nextInt();
			int y = sc.nextInt();

			for ( int p = x ; p < x+10 ; p++ ) {
				for ( int q = y ; q < y+10 ; q++)
					map[p][q]++;
			}
		}

		for ( int i = 0 ; i < 100 ; i++ )
			for ( int j = 0 ; j < 100 ; j++ )
				if ( map[i][j] > 0 )
					area++;

		System.out.print(area);
    }
}