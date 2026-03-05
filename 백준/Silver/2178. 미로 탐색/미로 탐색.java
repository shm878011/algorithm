import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    static int[] dx = {-1,0,1,0};
    static int[] dy = {0,1,0,-1};
    static int[][] dist;
    static int[][] map;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        dist = new int[n][m];
        map = new int[n][m];
        for(int i=0; i<n; i++){
            String line = br.readLine();
            for(int j=0; j<m;j++){
                map[i][j] = line.charAt(j)-'0';
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0; j<m; j++){
                dist[i][j]= -1;
            }
        }
        Queue<int[]> q = new LinkedList<>();
        q.add(new int[]{0,0});
        dist[0][0] = 0;

        while(!q.isEmpty()){
            int[] curr = q.poll();
            int x = curr[0];
            int y= curr[1];

            for(int dir=0; dir<4; dir++){
                int nx = x+ dx[dir];
                int ny = y + dy[dir];
                if(nx<0 ||ny<0 ||nx>=n ||ny>=m) continue;
                if(map[nx][ny]!=1 || dist[nx][ny]!=-1) continue;
                dist[nx][ny] = dist[x][y]+1;
                q.add(new int[]{nx,ny});
            }
        }
        System.out.println(dist[n-1][m-1]+1);

    }
    
}
