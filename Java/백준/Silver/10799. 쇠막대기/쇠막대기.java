import java.io.*;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Stack<Integer> stk = new Stack<>();
        String stick = br.readLine();

        int res = 0;

        for ( int idx = 0 ; idx < stick.length() ; idx++ ) {
            if ( stick.charAt(idx) == '(' )
                stk.add(idx);
            else {
                int temp = stk.pop();
                if ( idx - temp == 1 )
                    res += stk.size();
                else
                    res++;
            }
        }

        System.out.println(res);
    }
}