import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num1 = Integer.parseInt(br.readLine());
        int num2 = Integer.parseInt(br.readLine());
        int num3 = Integer.parseInt(br.readLine());

        long result = num1 * num2 * num3;
        String stresult = Long.toString(result);
        char[] cresult = stresult.toCharArray();
        int[] num = new int[10];
        for(char c : cresult){
            num[c-'0']++;
        }
        for(int n:num){
            System.out.println(n);
        }

    }
    
}
