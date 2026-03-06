import java.util.*;
class Solution {
    public int solution(int n, int[][] computers) {
        int answer = 0;
        int[] visited = new int[n];
        Stack<Integer> stack = new Stack<>();
        for(int i=0; i<n; i++){
            if(visited[i]!=0) continue;
            stack.push(i);
            while(!stack.isEmpty()){
                int node = stack.pop();
                if(visited[node]!=0) continue;
                visited[node]=1;
                for(int j=0; j<n;j++){
                    if(computers[node][j]==0 || visited[j]==1) continue;
                    stack.push(j);
                }
            }
            answer++;
        }
        
        return answer;
    }
}