import java.util.Scanner;
class ElseIfDemo
{
    public static void main(String args[])
    {
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the number");
    int number=sc.nextInt();
    if(number>0)
    {
        System.out.println("Positiver number");
    }
    else if(number<0)
    {
        System.out.println("negative number");
    }
    else
    {
        System.out.println("entered number is 0");
    }
}
}
