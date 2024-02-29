import java.util.Scanner;
class Divisiblity
{
    public static void main(String args[])
        {
            Scanner sc=new Scanner(System.in);
            System.out.println("enter one integer number");
            int num=sc.nextInt();
            if(num % 5 == 0)
            {
                System.out.println("Luck");
            }
        }
}