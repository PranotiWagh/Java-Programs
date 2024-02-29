import java.util.Scanner;
class FindSum
{
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter starting number");
        int n=sc.nextInt();
        System.out.println("enter ending number");
        int m=sc.nextInt();
        int add=0;
        int count=0;
        for(int i=n;i<=m;i++)
        {
            count++;
        }
        System.out.println(count);
    }
}