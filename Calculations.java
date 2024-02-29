import java.util.Scanner;
class Calculations
{   public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your choice");
        System.out.println(" Addition\n Substraction\n Multiplication\n Division\n");
        String choice=sc.next();
        switch(choice)
        {
            case "Addition":
            {
                System.out.println("enter two integer number");
                int n1=sc.nextInt();
                int n2=sc.nextInt();
                int add=n1+n2;
                System.out.println(add);
            }
            break;

            case "Substraction":
            {
                
                System.out.println("enter two integer number");
                int n1=sc.nextInt();
                int n2=sc.nextInt();
                int sub=n1-n2;
                System.out.println(sub);
            }
            break;
            case "Multiplicatio":
            {
                System.out.println("enter two integer number");
                int n1=sc.nextInt();
                int n2=sc.nextInt();
                int mul=n1*n2;
                System.out.println(mul);
            }
            break;
            case "Division":
            {
                System.out.println("enter two integer number");
                int n1=sc.nextInt();
                int n2=sc.nextInt();
                int div=n1/n2;
                System.out.println(div);
            }
            break; 
        }
    }
}