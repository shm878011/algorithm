import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int[] arr = new int[num];
        for(int i = 0; i < num; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        int count = 0;
        int total = 0;
        for(int i=0; i<arr.length; i++){
            for(int j=1; j<=arr[i]; j++){
                if(arr[i] % j == 0){
                    count++;
                }
            }
            if(count == 2){
                total++;
            }
            count = 0; 
        }
        System.out.println(total);
       

    }

}
