import java.util.*;
class Checksquare
{
    public static void main(String args[])
    {
        Square();
    }

    public static void Square()
    {
        Scanner s=new Scanner(System.in);
        System.out.println("enter length and breadth of square");
        int l=s.nextInt();
        int b=s.nextInt();
        if(l==b)
        {
            System.out.println("It is a square");
        }
        else
        {
            System.out.println("It is not square");
        }
    }
}