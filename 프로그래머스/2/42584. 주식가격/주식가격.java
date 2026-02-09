import java.util.*;
class Solution {
    public int[] solution(int[] prices) {
        int[] answer = new int[prices.length];
        //Queue<Integer> qu = new LinkedList<>)();
        // for(int i: prices){
        //     qu.add(i);
        // }
        int time = 0;
            for(int i=0; i<prices.length;i++){
                for(int j=i+1; j<prices.length;j++){
                    if(prices[i]<=prices[j])
                        time++;
                    else{
                        time++;
                        answer[i]=time;
                        break;
                    }
                }
                answer[i]=time;
                time=0;
            }
        
        return answer;
    }
}