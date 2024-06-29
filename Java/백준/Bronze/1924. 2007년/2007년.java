import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] days = new int[]{0,31,28,31,30,31,30,31,31,30,31,30,31};
        String[] day = new String[]{"MON","TUE","WED","THU","FRI","SAT","SUN"};

        int m = sc.nextInt();
        int d = sc.nextInt();
        int elapsedDays = d-1;

        for ( int i = 0 ; i < m ; i++ )
            elapsedDays += days[i];

        System.out.println(day[elapsedDays%7]);
        sc.close();
    }
}