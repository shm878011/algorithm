import java.util.*;
class Solution {
    boolean solution(String s) {
        boolean answer = true;
        Stack<Character> stack = new Stack<>();
        for(char a:s.toCharArray()){
            if(a== '(')
                stack.push(a);
            else if(a==')'){
                if(stack.isEmpty()){
                    answer = false;
                    break;
                }
                    
                else{
                    stack.pop();
                } 
            }
        }
        if(!stack.isEmpty())
            answer = false;
     
        return answer;
    }
}