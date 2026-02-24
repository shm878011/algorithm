import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException{
        // 4 3 6 8 7 5 2 1
        // 1 2 5 3 4
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Stack<Integer> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();
        int last_val =0;
        for(int i=0; i<n; i++){
            int k = Integer.parseInt(br.readLine());
            if(k>last_val){
                for(int j=last_val+1; j<=k; j++){
                    stack.push(j);
                   // System.out.println("+");
                   sb.append("+\n");
                }
                last_val = k;
            }else{
                if(stack.peek()!=k){
                    System.out.println("NO");
                    return;
                }
            }
            stack.pop();
            //System.out.println("-");
            sb.append("-\n");
        }
        System.out.println(sb);
        
        //4가 들어오면 1 2 3 4push peek랑 비교해서 같으면 pop peek랑 비교해서 크면 6까지 push
    }
}
