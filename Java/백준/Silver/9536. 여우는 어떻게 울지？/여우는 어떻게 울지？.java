import java.io.*;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        while ( T-- > 0 ) {
            String[] fox = br.readLine().split(" ");
            HashSet<String> set = new HashSet<>();
            while ( true ) {
                String str = br.readLine();
                if ( str.equals("what does the fox say?"))
                    break;

                String[] sounds = str.split(" ");
                set.add(sounds[2]);
            }

            for ( String s : fox ) {
                if ( !set.contains(s) )
                    System.out.print(s+" ");
            }
            System.out.println();
        }
    }
}