import java.util.*;
class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0;i<progresses.length;i++){
            list.add((int)Math.ceil((100-progresses[i])/(double)speeds[i]));
        }
        //ex) [7,3,9], [5,10,10,1,20,1]
        int num=1;
        int max=list.get(0);
        ArrayList<Integer> answer = new ArrayList<>();
        for(int i=1; i<list.size();i++){
            if(list.get(i)<=max){
                num++;
            }
            else{
                answer.add(num);
                num=1;
                max = list.get(i);
            }
        }
        answer.add(num);
        int[] answer2 = new int[answer.size()];
        for(int j=0; j<answer.size();j++){
            answer2[j] = answer.get(j);
        }
        return answer2;
    }
}