import java.util.*;
import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for(int test_case = 1; test_case<=T; test_case++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());

            int[] A = new int[N]; 
            int[] B = new int[M]; // 긴 배열
            st = new StringTokenizer(br.readLine());
            for(int i=0; i<N; i++){
                A[i] = Integer.parseInt(st.nextToken());
            }
            st = new StringTokenizer(br.readLine());
            for(int j=0; j<M; j++){
                B[j] = Integer.parseInt(st.nextToken());
            }

            if(N>M){
                int[] cur = B;
                B=A;
                A=cur;
                int cur2 = M;
                M=N;
                N=cur2;
            }
            
            int max=0;
            for(int i=0; i<=M-N; i++){
                int mul = 0;
                for(int j=0; j<N; j++){
                    mul+= A[j]*B[i+j];
                }
                if(max<mul)
                    max = mul;
            }
            System.out.println("#"+test_case+" "+ max);
        }
    }
}
