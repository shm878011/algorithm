import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line;
        while(!(line =br.readLine()).equals("0 0")){
            StringTokenizer st = new StringTokenizer(line);
            int a = Integer.parseInt(st.nextToken());
            int b=  Integer.parseInt(st.nextToken());
            System.out.println(a+b);

        }
        

    }
    
}
