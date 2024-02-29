import java.util.Scanner;
class FindOddEven
{
    public static void OddEven()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter one integer number");
        int num=sc.nextInt();
        if(num%2==0)
        {
            System.out.println("The entered number is EVEN NUMBER");
        }
        else
        {
            System.out.println("The entered number is ODD NUMBER");
        }

    }
    public static void main(String args[])
    {
        OddEven();
    }
}