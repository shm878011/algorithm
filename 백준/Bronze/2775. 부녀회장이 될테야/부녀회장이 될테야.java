import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {
    public static void main(String[] args) throws IOException{
    
        //1층의 3호 -> 0층의 1호부터 3호까지의 합 : 6
        //2층의 3호-> 1층의 1호부터 3호까지의 합: 0층의1호 + 0층의1호부터2호 + 0층의 1호부터 3호
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        for(int i=0; i<num; i++){
           int k = Integer.parseInt(br.readLine());
           int n = Integer.parseInt(br.readLine());
           System.out.println(app_sum(k, n));
        }


    }
    static int app_sum(int a, int b){
        int result = 0;
        if(a==0){
            return b;
        }
        for(int i=1; i<=b;i++){
            result +=app_sum(a-1, i);
        }
        return result;
    }
    
}
