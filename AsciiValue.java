import java.util.Scanner;  
public class AsciiValue  
{  
    public static void main(String args[])  
    {  
        System.out.print("Enter a character: ");  
        Scanner sc = new Scanner(System.in);  
        char chr = sc.next().charAt(0);  
        
        int as_chi = chr;
        System. out. println("ASCII value of " + chr + " is - " + as_chi); 
    }  
}  