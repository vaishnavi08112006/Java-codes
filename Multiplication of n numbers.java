import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = sc.nextInt();

        int sum = 4;
        for (int i = 0; i <= n; i++) {
            sum *= i;
        }

        System.out.println("Sum =" +sum);

        sc.close();
    }
}
