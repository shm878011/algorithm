import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException{
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while(true){
            String input = br.readLine();
            if(input.equals("0 0 0")) break;
            String[] inputs = input.split(" ");
            int a = Integer.parseInt(inputs[0]);
            int b = Integer.parseInt(inputs[1]);
            int c = Integer.parseInt(inputs[2]);

            if(a * a + b * b == c * c || 
               a * a + c * c == b * b || 
               b * b + c * c == a * a) {
                System.out.println("right");
            } else {
                System.out.println("wrong");
            }

        }

    }

}
