import java.io.*;
import java.util.*;

public class Main  {
    public static void main(String[] args) throws IOException{
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        for(int i=0; i<num; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int count = Integer.parseInt(st.nextToken());
            String result = st.nextToken();
            for(int j=0;j<result.length();j++){
                for(int k=0; k<count;k++){
                    System.out.print(result.charAt(j));
                }
            }
            System.out.println();
            
        }

    }
}
