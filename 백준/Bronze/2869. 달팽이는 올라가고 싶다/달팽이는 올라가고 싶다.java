import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        long a = Long.parseLong(st.nextToken());
        long b = Long.parseLong(st.nextToken());
        long v = Long.parseLong(st.nextToken());
        // while(now<=v){
        //     now = now+a;
        //     if(now>=v){
        //         System.out.println(++day);
        //         break;
        //     }
        //     now = now-b;
        //     day++;
        // }
        //시간 초과ㅠ  
        long day =0;
        day = (v-a)/(a-b);
        if((v-a)%(a-b)!=0)
            day++;
        System.out.println(++day);

    }
}
