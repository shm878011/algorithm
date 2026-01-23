import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int length = Integer.parseInt(br.readLine());
        char[] num = br.readLine().toCharArray();
        int result = 0;
        //System.out.println(num[1]-'a');
        for(int i=0; i<length; i++){
            result+= (((num[i] - 'a')+1)* Math.pow(31,i));
        }
        System.out.println(result%1234567891);
       
        
    }
}
