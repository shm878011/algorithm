import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input ="";
        
        while(!(input=br.readLine()).equals("0")){
            String result="";
            char[] num = input.toCharArray();
            for(int i=0; i<num.length;i++){
                if(num[i]==num[num.length-1-i]){
                    result+=1;
                }else{
                    result+=0;
                }
            }
            if(result.contains("0")){
                //System.out.println(result);
                System.out.println("no");
            }
            else
                System.out.println("yes");
        }


    }
    
}
