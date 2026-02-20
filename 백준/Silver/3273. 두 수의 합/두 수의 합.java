import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int size = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] num = new int[size];
        for(int i=0; i<size;i++){
            num[i] = Integer.parseInt(st.nextToken());
        }

        int target = Integer.parseInt(br.readLine());
        int result = 0;
        // int occur[] = new int[target];
        // for(int i=0; i<size; i++){
        //     if(occur[target-num[i]]==1)
        //         result++;
        //     else{
        //         occur[num[i]]=1;
        //     }
        // }
        Arrays.sort(num);
        int start = 0;
        int end = size-1;
        while(start<end){
            if(num[start]+num[end]==target)
                result++;
            if(num[start]+num[end]<=target)
                start++;
            else
                end--;
        }
        System.out.println(result);
    }    
}
