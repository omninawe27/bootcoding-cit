//WAP for cal factorial of given no.
import java.util.Scanner;
public class fact {
    public static void main(String[] args) {
        int n,fact=1;
        Scanner sc = new Scanner(System.in);
        System.out.print("enter any number :");
         int org=sc.nextInt();
        for(n=org;n>0;n--)
        {
            fact=fact*n;
        }
        System.out.println("factorial is : "+fact);
    }
}
