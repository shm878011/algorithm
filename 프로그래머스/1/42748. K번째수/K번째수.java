import java.util.*;
class Solution {
    public int[] solution(int[] array, int[][] commands) {
        List<Integer> list = new ArrayList<>();
        for(int i=0; i<commands.length;i++){
            int start = commands[i][0];
            int end = commands[i][1];
            int[] new_array = new int[end-start+1];
            for(int j=0;j<new_array.length;j++){
                new_array[j]=array[start-1+j];
            }
            Arrays.sort(new_array);
            list.add(new_array[commands[i][2]-1]);
        }
        int[] answer = new int[list.size()];
        for(int i=0;i<list.size();i++){
            answer[i] = list.get(i);
        }
        return answer;
    }
}