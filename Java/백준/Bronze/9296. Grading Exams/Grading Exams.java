import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int tc = Integer.parseInt(br.readLine());

        for ( int i = 1 ; i <= tc ; i++ ) {
            int L = Integer.parseInt(br.readLine());
            int res = 0;

            String answer = br.readLine();
            String student = br.readLine();

            for ( int j = 0 ; j < L ; j++ ) 
                if ( answer.charAt(j) != student.charAt(j) )
                    res++;

            System.out.printf("Case %d: %d\n",i,res);
        }
    }
}