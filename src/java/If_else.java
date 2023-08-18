import java.util.Scanner;
public class If_else {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number : ");
        int x=sc.nextInt();
        System.out.println("enter second number");
        int y=sc.nextInt();
        if(x==y){
            System.out.println("Numbers are same!");
        }
        else{System.out.println("Numbers are different !");
        }
    }
}
