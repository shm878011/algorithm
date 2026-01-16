class Solution {
    public int solution(int n, String control) {
        int answer = 0;
        for (char ch: control.toCharArray()){
        switch(ch){
            case 'w': n++; break;
            case 's': n--; break;
            case 'd': n+=10; break;
            case 'a': n-=10; break;
            default: break;
        }
        }
        answer = n;
        return answer;
    }
}