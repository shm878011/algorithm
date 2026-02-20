import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] alp = new int[26];
        char[] word = br.readLine().toCharArray();
        for(char c: word){
            alp[c-'a']++;
        }
        for(int a :alp){
            System.out.print(a+" ");
        }
    }
    
}
