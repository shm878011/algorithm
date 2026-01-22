import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        // 1 6*0+1->1
        // 6*0+2 2~7 6*1+1  1+6->2
        // 6*1+2 8~19 6*3+1 1+6+12->3
        // 6*3+2 20~ 37 6*6+1- 1+6+12+18>4
        // 6*6+2 38~61 6*10+1->5
        // 6*10+2 62~91 6*15+1 ->6
        int layer =1;
        int max=1;
        while(num>max){
            max+=6*layer;
            layer++;
        }
        System.out.println(layer);

    }
}
