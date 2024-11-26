import java.io.*;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        HashMap<String,String> code = new HashMap<>();
        code.put("CU", "see you");
        code.put(":-)", "I’m happy");
        code.put(":-(", "I’m unhappy");
        code.put(";-)", "wink");
        code.put(":-P", "stick out my tongue");
        code.put("(~.~)", "sleepy");
        code.put("TA", "totally awesome");
        code.put("CCC", "Canadian Computing Competition");
        code.put("CUZ", "because");
        code.put("TY", "thank-you");
        code.put("YW", "you’re welcome");
        code.put("TTYL", "talk to you later");

        while ( true ) {
            String str = br.readLine();

            if ( code.containsKey(str) ) {
                System.out.println(code.get(str));
                if ( str.equals("TTYL"))
                    break;
            } else 
                System.out.println(str);
        }
    }
}