import java.util.Scanner;
class GradingSystem
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter marks");
        int marks=sc.nextInt();
        if(marks>=0 && marks<50)
            System.out.println("Fail try again");
        else if(marks>=60 && marks<60)
            System.out.println("D grade");
        else if(marks>=60 && marks<70)
            System.out.println("C Garade");
        else if(marks>=70 && marks<80)
            System.out.println("B Garade");
        else if(marks>=80 && marks<90)
            System.out.println("A Garade");
        else if(marks>=90 && marks<100)
            System.out.println("A+ Garade");
        else 
            System.out.println("O Garade");
        
    
    }

}
