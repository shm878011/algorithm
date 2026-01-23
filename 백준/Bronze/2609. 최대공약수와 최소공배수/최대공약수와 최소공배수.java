import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        ArrayList<Integer> list = new ArrayList<>();
        //ArrayList<Integer> list2 = new ArrayList<>();
        int b = Integer.parseInt(st.nextToken());
        if(a>=b){
            for(int i=1; i<=a; i++){
            if(a%i ==0 && b%i==0){
                list.add(i);
            }
        }
        }else{
            for(int i=1; i<=b; i++){
                if(a%i ==0 && b%i==0){
                list.add(i);
            }
            }
        }
        int r1 = list.get(list.size()-1);
        int r2 = r1 * (a/r1) * (b/r1);
        System.out.println(r1);
        System.out.println(r2);
    }
}
