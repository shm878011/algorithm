import java.util.*;
class Solution {
    public int solution(int[][] maps) {
    
        int n = maps.length;
        int m = maps[0].length;
        int[] dx = {-1,0,1,0};
        int[] dy = {0,1,0,-1};
        int[][] dist = new int[n][m];
        for(int i=0;i<n; i++){
            for(int j=0; j<m;j++){
                dist[i][j]=-1;
            }
        }
        Queue<int[]> q = new LinkedList<>();
        q.offer(new int[] {0,0});
        dist[0][0]=0;
        while(!q.isEmpty()){
            int[] cur = q.poll();
            int x = cur[0];
            int y = cur[1];
            for(int i=0; i<4; i++){
                int nx= x+ dx[i];
                int ny = y+dy[i];
                if(nx<0 || ny<0 || nx>=n ||ny>=m)
                    continue;
                if(dist[nx][ny]!= -1 || maps[nx][ny]==0)
                    continue;
                dist[nx][ny]= dist[x][y] +1;
                q.offer(new int[]{nx,ny});
            }
        }
       
        return (dist[n-1][m-1]!=-1)?dist[n-1][m-1]+1:-1;
    }
}