import java.util.Scanner;
class IfDemo2
{
    public static void validation(int age)
    {
        if(age>=18)
        {
            System.out.println("elligible to vote");
        }
    }

    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enteryour age");
        int age=sc.nextInt();
        validation(age);
    }
}