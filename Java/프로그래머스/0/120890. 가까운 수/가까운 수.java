class Solution {
    public int solution(int[] array, int n) {
        int answer = array[0];
        int min = Math.abs(array[0]-n);
        
        for ( int i = 1 ; i < array.length ; i++ )
            if ( min == Math.abs(array[i]-n) )
                answer = Math.min(answer, array[i]);
            else if ( Math.min(min,Math.abs(array[i]-n)) == Math.abs(array[i]-n) ) {
                min = Math.abs(array[i]-n);
                answer = array[i];
            }
        
        return answer;
    }
}