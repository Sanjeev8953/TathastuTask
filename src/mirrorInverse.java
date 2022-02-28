import java.util.Scanner;

public class mirrorInverse {
    static boolean isMirrorInverse(int arr[])
    {
        for (int i = 0; i < arr.length; i++) {

            if (arr[arr[i]] != i)
                return false;
        }
        return true;
    }
    public static void main(String[] args)
    {
        int arr[] = new int[20];
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array");
        int size=sc.nextInt();
        for(int i=0;i<size;i++)
        {
            arr[i]=sc.nextInt();
        }
        if (isMirrorInverse(arr))
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}