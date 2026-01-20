import java.util.*;
class Solution {
    public String solution(String n_str) {
        List<Character> list = new ArrayList<>();
        for(int i=0; i<n_str.length();i++){
            list.add(n_str.charAt(i));
        }
        while(list.get(0)=='0')
            list.remove(0);
        String answer = "";
        for(int i=0; i<list.size();i++){
            answer += list.get(i);
        }
        return answer;
    }
}