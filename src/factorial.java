import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        System.out.println("Enter a number to calculate factorial");
        Scanner sc= new Scanner(System.in);
        int num= sc.nextInt();
        int fact=1,i;
        if(num<0)
            System.out.println("Factorial of negative number can't be find");
        else
        {
            for(i=1;i<=num;i++)
                fact=fact*i;
            System.out.println("Factorial of "+num+" is "+fact);
        }


    }
}