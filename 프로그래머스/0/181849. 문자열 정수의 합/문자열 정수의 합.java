class Solution {
    public int solution(String num_str) {
        int answer = 0;
        String[] num = num_str.split("");
        for(String n : num){
            answer += Integer.parseInt(n);
        }
        return answer;
    }
}