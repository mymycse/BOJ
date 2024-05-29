import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    public int[] solution(String my_string) {
        ArrayList<Integer> list = new ArrayList<>();
        
        for ( int i = 0 ; i < my_string.length() ; i++ ) {
            char c = my_string.charAt(i);
            if ( c <= '9' )
                list.add(c-'0');
        }
        
        
        int[] answer = list.stream().mapToInt(x->x).toArray();
        Arrays.sort(answer);
        return answer;
    }
}