import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int input1 = sc.nextInt();
        int input2 = sc.nextInt();
        int input3 = sc.nextInt();
        sc.close();

        int result = input1 + input2 - input3;

        System.out.println(result);

        String input_1 = String.valueOf(input1);
        String input_2 = String.valueOf(input2);
        String input_3 = String.valueOf(input3);

       String resulString = input_1 + input_2;
       int resulStringInt = Integer.parseInt(resulString);

       System.out.println(resulStringInt - input3);
    }

}
