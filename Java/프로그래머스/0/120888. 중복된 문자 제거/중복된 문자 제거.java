class Solution {
    public String solution(String my_string) {
        String answer = "";
        answer += my_string.charAt(0);
        
        for ( int i = 1 ; i < my_string.length() ; i++ )
            if ( !my_string.substring(0,i).contains(String.valueOf(my_string.charAt(i))))
                answer += my_string.charAt(i);
        
        return answer;
    }
}