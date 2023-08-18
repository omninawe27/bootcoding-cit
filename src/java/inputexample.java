import java.util.Scanner;
public class inputexample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number :");
        int n = sc.nextInt();
        System.out.println("Enter second number : ");
        int m = sc.nextInt();
        int add = n + m;
        System.out.println("Addition ="+add);
        int sub = n - m;
        System.out.println("Substraction ="+sub);
        int mul = n * m;
        System.out.println("Multiplication ="+mul);
        double div = n / m;
        System.out.println("Division ="+div);
        double mod = n % m;
        System.out.println("Modulo ="+mod);
    }
}
