import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String roomnum = br.readLine();
        // 0 1 2 3 4 5 6 7 8 669 3이면 실제로는 2세트필요
        int[] num = new int[9];
        for(int i=0; i<roomnum.length();i++){
            if((roomnum.charAt(i)-'0')==9){
                num[6]++;
            }else{
                num[roomnum.charAt(i)-'0']++;
            }
        }
        num[6] = (int)Math.ceil(num[6]/2.0);
        int max = num[0];
        for(int i=0; i< num.length; i++){
            if(max<num[i])
                max = num[i];
        }
        System.out.println(max);
    }
    
}
