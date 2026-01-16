class Solution {
    public int solution(int n, String control) {
        String[] wasd = control.split("");
        for(int i=0; i<wasd.length;i++){
            if(wasd[i].equals("w"))
                n+=1;
            else if(wasd[i].equals("s"))
                n-=1;
            else if(wasd[i].equals("d"))
                n+=10;
            else if(wasd[i].equals("a"))
                n-=10;
        }
        int answer = n;
        return answer;
    }
}