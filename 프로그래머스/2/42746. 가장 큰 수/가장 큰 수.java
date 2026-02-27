import java.util.*;
class Solution {
    public String solution(int[] numbers) {
        String[] num = new String[numbers.length];
        for(int i=0; i<num.length;i++){
            num[i] = Integer.toString(numbers[i]);
        }
        Arrays.sort(num,(a,b)->(b+a).compareTo(a+b));
        if(num[0].equals("0"))
            return "0";
        
        String answer = "";
        for(String st : num)
            answer+=st;
        return answer;
    }
}