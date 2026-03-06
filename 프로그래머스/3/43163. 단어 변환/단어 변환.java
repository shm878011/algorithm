import java.util.*;
class Solution {
    public int solution(String begin, String target, String[] words) {     
          boolean exists = false;  
          for(String word : words){
            if(word.equals(target)){
                exists = true;
                break;
            }
        }
        if(!exists) return 0;
        int[] dist = new int[words.length];
        Queue<Integer> q = new LinkedList<>();
        for(int i=0; i<words.length; i++){
            if(!canConvert(begin,words[i])) continue;
            q.offer(i);
            dist[i] = 1;
        }
        while(!q.isEmpty()){
            int cur = q.poll();
            if(words[cur].equals(target)) return dist[cur];
            for(int j=0; j<words.length;j++){
                if(dist[j]!=0 || !canConvert(words[cur],words[j])) continue;
                dist[j] = dist[cur]+1;
                q.offer(j);
            }
        }
        return 0;
    }
    public boolean canConvert(String from, String to){
        int num = 0;
        for(int i=0; i<from.length();i++){
            if(from.charAt(i)==to.charAt(i))
                num++;
        }
        return (from.length()==num+1)? true: false;
    }
}