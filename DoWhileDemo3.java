import java.util.*;
class DoWhileDemo3
{
    public static void sum(int start,int end)
    {
        int sum=0;
        int i=start;
        do
        {
            sum=sum+i;
            i++;
        }
        while(i<=end);
        System.out.println(sum);
    }    
        public static void main(String args[])
        {
            Scanner s=new Scanner(System.in);
            System.out.println("enter start number");
            int start=s.nextInt();
            System.out.println("enter end number");
            int end=s.nextInt();
            sum(start,end);
        }
    
}