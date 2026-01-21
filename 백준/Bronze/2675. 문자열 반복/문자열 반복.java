import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException{
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        for(int i=0; i<num; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int count = Integer.parseInt(st.nextToken());
            String result = st.nextToken();
            String[] result2 = result.split("");
            for(int j=0;j<result2.length;j++){
                System.out.print(result2[j].repeat(count));
            }
            System.out.println();
            
        }

    }
}
