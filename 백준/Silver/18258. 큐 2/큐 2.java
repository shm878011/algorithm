import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        Queue<Integer> queue = new LinkedList<>();
        StringBuilder sb = new StringBuilder();
        int back = 0;
        for(int i=0; i<N; i++){
            String st = br.readLine();
            StringTokenizer st2 = new StringTokenizer(st);
            if(st2.nextToken().contains("push")){
                 int num = Integer.parseInt(st2.nextToken());
                 queue.add(num);
                 back = num;
            }
            else if(st.equals("pop")){
                if(queue.isEmpty()){
                     //System.out.println("-1");
                     sb.append("-1\n");
                }
                else{
                   // System.out.println(queue.poll());
                   sb.append(queue.poll()).append("\n");
                }
            }
            else if(st.equals("size")){
                //System.out.println(queue.size());
                sb.append(queue.size()).append("\n");
            }
            else if(st.equals("empty")){
                int result = (queue.isEmpty())? 1: 0;
                //System.out.println(result);
                sb.append(result).append("\n");
            }
            else if(st.equals("front")){
                if(queue.isEmpty()){
                    //System.out.println("-1");
                    sb.append("-1\n");
                }else{
                    //System.out.println(queue.peek());
                    sb.append(queue.peek()).append("\n");
                }
            }else{
                if(queue.isEmpty()){
                    //System.out.println("-1");
                    sb.append("-1\n");
                }
                else{
                    //System.out.println(back);
                    sb.append(back).append("\n");
                }
            }
        }
        System.out.println(sb);
    }
}
