class Solution {
    public int solution(int[] array) {
        int answer = -1;
        int[] cnt = new int[1000];
        
        for ( int i =0 ; i < array.length ; i++ )
            cnt[array[i]]++;
        
        int max = -1;
        
        for ( int i = 0 ; i < 1000 ; i++ ) {
            if ( cnt[i] == max )
                answer = -1;
            else if ( cnt[i] > max ) {
                max = cnt[i];
                answer = i;
            }
        }
        
        return answer;
    }
}