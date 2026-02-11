import java.util.*;
class Solution {
    public int[] solution(int[] answers) {
        int length = answers.length;
        int[] st1 = new int[]{1,2,3,4,5};
        int[] st2 = new int[]{2,1,2,3,2,4,2,5};
        int[] st3 = new int[]{3,3,1,1,2,2,4,4,5,5};
        int st1_answer =0, st2_answer=0, st3_answer =0;
        // answers = 1 2 3 4 5 이면 어케판단?
        for(int i=0; i<length; i++){
            if(st1[i%5]==answers[i])
                st1_answer++;
            if(st2[i%8]==answers[i])
                st2_answer++;
            if(st3[i%10]==answers[i])
                st3_answer++;
        }
        int max = Math.max(st1_answer,Math.max(st2_answer,st3_answer));
        ArrayList<Integer> list = new ArrayList<>();
        if(max==st1_answer)
            list.add(1);
         if(max==st2_answer)
            list.add(2);
         if(max==st3_answer)
            list.add(3);
        int[] answer = new int[list.size()];
        for(int i=0; i<list.size();i++){
            answer[i] = list.get(i);
        }
        return answer;
    }
}