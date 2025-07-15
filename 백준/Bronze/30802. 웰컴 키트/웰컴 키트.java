import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    
    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int total = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int i = 0;
        int order[] = new int[6];
        while(st.hasMoreTokens()){
            order[i++] = Integer.parseInt(st.nextToken());
        }

        StringTokenizer st2 = new StringTokenizer(br.readLine()," ");
        int[] bundle = new int[2];
        int j = 0;
        while(st2.hasMoreTokens()){
            bundle[j++] = Integer.parseInt(st2.nextToken());
        }

        int result_shirt =0;
      
        for(int k=0; k<order.length; k++){
            if(order[k]% bundle[0] ==0){
                result_shirt += order[k] / bundle[0];
            }else{
                result_shirt += order[k] / bundle[0] +1;
            }
            
        }
        System.out.println(result_shirt);
        System.out.println(total/bundle[1] + " " + total % bundle[1]);




    }

}
