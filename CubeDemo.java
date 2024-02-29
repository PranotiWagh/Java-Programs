import java.util.*;
class CubeDemo
{
    public static void AcceptData()
    {
        Scanner s=new Scanner(System.in);
        System.out.println("enter 1 number");
        int num=s.nextInt();
        int result=num*num*num;
        System.out.println(result);

    } 
    public static void main(String args[])
    {
        AcceptData();
    }
}