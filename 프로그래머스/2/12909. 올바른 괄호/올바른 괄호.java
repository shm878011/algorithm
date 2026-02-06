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
                    return answer;
                }
                    
                else{
                    stack.pop();
                } 
            }
        }
        if(stack.isEmpty())
            answer = true;
        else
            answer = false;
        return answer;
    }
}