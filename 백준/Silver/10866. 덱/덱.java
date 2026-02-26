import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        Deque<Integer> deque = new ArrayDeque<>();
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<N; i++){
            String command = br.readLine();
            StringTokenizer st = new StringTokenizer(command);
            if(command.contains("push_front")){
                String[] word = command.split(" ");
                int x = Integer.parseInt(word[1]);
                deque.offerFirst(x);
            }else if(st.nextToken().contains("push_back")){
                int x = Integer.parseInt(st.nextToken());
                deque.offerLast(x);
            }else if(command.equals("pop_front")){
                if(deque.isEmpty())
                    sb.append("-1\n");
                else
                    sb.append(deque.pollFirst()).append("\n");
            }else if(command.equals("pop_back")){
                if(deque.isEmpty())
                    sb.append("-1\n");
                else
                    sb.append(deque.pollLast()).append("\n");
            }else if(command.equals("size")){
                sb.append(deque.size()).append("\n");
            }else if(command.equals("empty")){
                int result = (deque.isEmpty())? 1:0 ;
                sb.append(result).append("\n");
            }else if(command.equals("front")){
                if(deque.isEmpty()){
                    sb.append("-1\n");
                }else{
                    sb.append(deque.peekFirst()).append("\n");
                }
            }else{
                if(deque.isEmpty()){
                    sb.append("-1\n");
                }else{
                    sb.append(deque.peekLast()).append("\n");
                }
            }
        }
        System.out.println(sb);
    }
}
