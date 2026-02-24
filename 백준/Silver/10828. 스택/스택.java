import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        Stack<Integer> stack = new Stack<>();
        for(int i=0; i<N; i++){
            String st = br.readLine();
            if(st.contains("push")){
                String[] pushStrings = st.split(" ");
                stack.push(Integer.parseInt(pushStrings[1]));
            }
            else if(st.equals("pop")){
                if(stack.isEmpty()){
                    System.out.println("-1");
                }else{
                    System.out.println(stack.pop());
                }
            }
            else if(st.equals("size")){
                System.out.println(stack.size());
            }
            else if(st.equals("empty")){
                if(stack.isEmpty()){
                    System.out.println("1");
                }else{
                    System.out.println("0");
                }
            }
            else{
                if(stack.isEmpty()){
                    System.out.println("-1");
                }else{
                    System.out.println(stack.peek());
                }
            }
        }
    }
}
