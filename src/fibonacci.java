import java.util.Scanner;
public class fibonacci {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("How many terms you want find of Fibonacci Series");
        int num=sc.nextInt();
        int i=1,a=-1,b=1,c;
        System.out.println("FIBONACCI SERIES:");
        while (i<=num)
        {
            c=a+b;
            System.out.print(c+"\t");
            a=b;
            b=c;
            i++;
        }
    }
}