import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int num = Integer.parseInt(st.nextToken());
        int sum = Integer.parseInt(st.nextToken());

        

        StringTokenizer st2 = new StringTokenizer(br.readLine(), " ");
        int[] arr = new int[num];
        int i = 0;
        while (st2.hasMoreTokens()) {
            arr[i++] = Integer.parseInt(st2.nextToken());
        }

        int answer = 0;
        for (int j = 0; j < num - 2; j++) {
            for (int k = j + 1; k < num - 1; k++) {
                for (int l = k + 1; l < num; l++) {
                    int currentSum = arr[j] + arr[k] + arr[l];
                    if (currentSum <= sum && currentSum > answer) {
                        answer = currentSum;
                    }
                }
            }
        }
       System.out.println(answer);
       
    }
}