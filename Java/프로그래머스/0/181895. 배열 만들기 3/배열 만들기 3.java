import java.util.ArrayList;

class Solution {
    public int[] solution(int[] arr, int[][] intervals) {
        ArrayList<Integer> list = new ArrayList<>();
        
        for ( int i = 0 ; i < 2 ; i++ )
            for ( int j = intervals[i][0] ; j <= intervals[i][1] ; j++ )
                list.add(arr[j]);
        
        int[] answer = list.stream().mapToInt(x->x).toArray();
        
        return answer;
    }
}