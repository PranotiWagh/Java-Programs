import java.util.Scanner;
class ForDemo2
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter m");
        int m=sc.nextInt();
        System.out.println("enter n");
        int n=sc.nextInt();
        for(int i=m;i<=n;i++)
        {
            System.out.println(i+" ");
        }

    }
}