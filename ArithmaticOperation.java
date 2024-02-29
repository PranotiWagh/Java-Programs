import java.util.Scanner;

class ArithmaticOperation
{
    public static void AcceptData()
    {
        Scanner s=new Scanner(System.in);
        System.out.println("enter two number");
        int num1=s.nextInt();
        int num2=s.nextInt();
        Addition(num1, num2);
    }

    public static void Addition(int num1,int num2)
    {
        System.out.println(num1+num2);
        Substraction(num1, num2);

    }
    
    public static void Substraction(int num1,int num2)
    {
        System.out.println(num1-num2);
        Multiplication(num1, num2);
    }

    public static void Multiplication(int num1,int num2)
    {
        System.out.println(num1*num2);
        Division(num1, num2);
    }

    public static void Division(int num1,int num2)
    {
        System.out.println(num1/num2);
        System.out.println(num1%num2);
    }
    public static void main(String args[])
     {
        AcceptData();
     }
}