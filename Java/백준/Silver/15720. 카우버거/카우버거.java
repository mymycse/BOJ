import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int burger = Integer.parseInt(st.nextToken());
        int side = Integer.parseInt(st.nextToken());
        int drink = Integer.parseInt(st.nextToken());

        Integer[] burgers = new Integer[burger];
        Integer[] sides = new Integer[side];
        Integer[] drinks = new Integer[drink];

        st = new StringTokenizer(br.readLine());
        for ( int i = 0 ; i < burger ; i++ )
            burgers[i] = Integer.valueOf(st.nextToken());

        st = new StringTokenizer(br.readLine());
        for ( int i = 0 ; i < side ; i++ )
            sides[i] = Integer.valueOf(st.nextToken());

        st = new StringTokenizer(br.readLine());
        for ( int i = 0 ; i < drink ; i++ )
            drinks[i] = Integer.valueOf(st.nextToken());

        Arrays.sort(burgers, Collections.reverseOrder());
        Arrays.sort(sides, Collections.reverseOrder());
        Arrays.sort(drinks, Collections.reverseOrder());

        int set = Math.min(Math.min(burger, side),drink);

        int discount = 0;
        int extra = 0;

        for ( int i = 0 ; i < burger ; i++ ) {
            if ( i < set )
                discount += burgers[i];
            else
                extra += burgers[i];
        }

        for ( int i = 0 ; i < side ; i++ ) {
            if ( i < set )
                discount += sides[i];
            else
                extra += sides[i];
        }

        for ( int i = 0 ; i < drink ; i++ ) {
            if ( i < set )
                discount += drinks[i];
            else
                extra += drinks[i];
        }

        int res = discount*9/10 + extra;

        System.out.println(discount+extra);
        System.out.println(res);
    }
}