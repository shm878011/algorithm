import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num1 = Integer.parseInt(br.readLine());
        for(int i=1; i<10;i++){
            System.out.println(num1+" * "+i +" = "+num1*i);
        }


    }
    
}
