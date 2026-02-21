import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken()); //학생 수
        int K = Integer.parseInt(st.nextToken()); // 한 방 최대 인원 수 
        int[][] room = new int[6][2]; 
        //    0 1     
        // 0  1  2
        // 1  2  1
        // 2  1  3
        // 3  0  1
        // 4  1  2
        // 5  1  1
        for(int i=0; i<N; i++){
            st = new StringTokenizer(br.readLine());
            int s = Integer.parseInt(st.nextToken()); //성별
            int y = Integer.parseInt(st.nextToken()); //학년
            room[y-1][s]++;
        }
        int count = 0;
        for(int i=0; i<6;i++){
            for(int j=0; j<2; j++){
                if(room[i][j]!=0 && room[i][j]%K ==0 ){
                    count = count + room[i][j]/K;
                }else{
                    count = count + (int)Math.ceil(room[i][j]/(double)K);
                }
            }
        }
        System.out.println(count);
    }
}
