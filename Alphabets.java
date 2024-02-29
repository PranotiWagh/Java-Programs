import java.util.*;
class Alphabets
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        System.out.println("enter character");
        char ch=s.next().charAt(0);
        if(ch>='a' && ch<='z' || ch>='A' && ch<='Z')
        {
            System.out.println(ch+" is alphabet");
        }
        else if(ch>='0' && ch<='9')
        {
            System.out.println(ch+" is Number");
        }
        else
        {
            System.out.println("special character");
        }

    }
}