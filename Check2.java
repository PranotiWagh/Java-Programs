import java.util.Scanner;
class Check2
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the Values :");
		char ch = input.next().charAt(0);			
		if(ch>='a' && ch<='z' || ch>='A' && ch<='Z')
		{
			System.out.println("This is a Alphabet");
		}
		else if(ch>='0' && ch<='9')
		{
			System.out.println("This is a Number");
		}
		else
		{
			System.out.println("This is a Special Character");
		}
	}
}