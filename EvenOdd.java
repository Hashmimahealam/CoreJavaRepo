import java.util.Scanner;
class EvenOdd 
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Hello User Enter any number to check even or odd");
        int number=s.nextInt();
		if(number%2==0)
		 System.out.println("The number "+number+ " is even");
		else
			System.out.println("The number "+number+" is odd");
		s.close();

	}
}
