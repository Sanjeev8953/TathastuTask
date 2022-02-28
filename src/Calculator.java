import java.util.Scanner;

 public class Calculator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Select your choice:");
        System.out.println("1.Addition");
        System.out.println("2.Subtraction");
        System.out.println("3.Multiplication");
        System.out.println("4.Division");
        int ch=sc.nextInt();

        switch (ch)
        {
            case 1: {
                System.out.println("Enter two numbers");
                int num1 = sc.nextInt();
                int num2 = sc.nextInt();
                System.out.println("Addition of " + num1 + " and" + num2 + " is " + num1 + num2);
                break;
            }
            case 2: {
                System.out.println("Enter two numbers");
                int num1 = sc.nextInt();
                int num2 = sc.nextInt();
                System.out.println("Subtraction of " + num1 + " and" + num2 + " is " + (num1 - num2));
                break;
            }
            case 3: {
                System.out.println("Enter two numbers");
                int num1=sc.nextInt();
                int num2=sc.nextInt();
                System.out.println("Multiplication of " + num1 + " and" + num2 + " is " + num1 * num2);
                break;
            }
            case 4: {
                System.out.println("Enter two numbers");
                int num1=sc.nextInt();
                int num2=sc.nextInt();
                System.out.println("Division of " + num1 + " and" + num2 + " is " + num1 / num2);
                break;
            }
            default:
                System.out.println("Please select your choice between 1 to 4");
                break;
        }
    }
}