import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            if(sc.hasNextInt()) {
                a[i] = sc.nextInt();
            } else {
                System.out.println("Invalid input. Please enter integers only.");
                return;
            }
        }
        int m;
        if(sc.hasNextInt()) {
            m = sc.nextInt();
        } else {
            System.out.println("Invalid input. Please enter an integer for m.");
            return;
        }
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (a[i] == m) {
                count++;
            }
        }
        System.out.println(count);
    }
}
