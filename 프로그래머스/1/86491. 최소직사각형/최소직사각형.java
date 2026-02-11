import java.util.*;
class Solution {
    public int solution(int[][] sizes) {
        int answer = 0;
        int max = 0;
        int[] min = new int[sizes.length];
        for(int i=0; i<sizes.length;i++){
            if(max<Math.max(sizes[i][0],sizes[i][1])){
                    max = Math.max(sizes[i][0],sizes[i][1]);
            }
            min[i]=Math.min(sizes[i][0],sizes[i][1]);  
        }
        Arrays.sort(min);
        int min_num = min[min.length-1];
        // 50 30 30 40 ->50, 60 70 60 80->80
        // 7 3 8 7 5 ->8 같으면 그다음?, 10 12 15 14 15 ->15
        //14 19 16 18 11 -> 19 , 4 6 6 7 7 -> 7
        answer = max * min_num;
        return answer;
    }
}