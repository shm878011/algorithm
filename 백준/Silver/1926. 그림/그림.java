import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    static int[] dx = {-1,0,1,0};
    static int[] dy = {0,1,0,-1};
    static int[][] map;
    static boolean[][] visited;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken()); //세로
        int m = Integer.parseInt(st.nextToken()); //가로
        Queue<int[]> queue = new LinkedList<>();
        map = new int[n][m];
        visited = new boolean[n][m];

        for(int i=0; i<n; i++){
            st = new StringTokenizer(br.readLine());
            for(int j=0; j<m; j++){
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        int num = 0; //그림의 개수
        int max_area = 0; //그림의 넓이
        for(int i=0; i<n;i++){
            for(int j=0; j<m; j++){
                if(map[i][j]==0 || visited[i][j]) continue;
                num++;
                visited[i][j] = true;
                queue.add(new int[] {i,j});
                int area =0;
                while(!queue.isEmpty()){
                    area++;
                    int[] temp = queue.poll();
                    int x= temp[0];
                    int y =temp[1];
                    for(int dir = 0; dir<4; dir++){
                        int nx = x+dx[dir];
                        int ny = y+dy[dir];
                        if(nx<0 || ny<0 || nx>=n ||ny>=m) continue;
                        if(visited[nx][ny] || map[nx][ny]!=1) continue;
                        visited[nx][ny] = true;
                        queue.add(new int[]{nx,ny});
                    }
                }
                max_area = Math.max(area,max_area);
            }
        }
        System.out.println(num);
        System.out.println(max_area);
    }
}
