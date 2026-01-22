import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(bf.readLine());
        for(int i=1; i<num; i++){
            int k=i;
            char[] a = Integer.toString(k).toCharArray();
            for(int j=0; j<a.length;j++){//98-> 9 8
                k += a[j]-'0';
            }
            if(k==num){
                System.out.println(i);
                return ;
            }
        }
        System.out.println("0");
    }
    
}
