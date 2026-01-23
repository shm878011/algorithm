import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int length = Integer.parseInt(br.readLine());
        char[] num = br.readLine().toCharArray();
        long result = 0;
        long mod = 1234567891L;
        long pow = 1;
        //System.out.println(num[1]-'a');
        for(int i=0; i<length; i++){
            //result+= (((num[i] - 'a')+1)* Math.pow(31,i));
            long value = (num[i]-'a') +1 ;
            result = (result+value *pow)%mod;
            pow = pow *31 % mod;
        }
        System.out.println(result);
           
    }
}
