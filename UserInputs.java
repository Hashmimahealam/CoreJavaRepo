import java.util.Scanner;
class  UserInputs
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
		Scanner s=new Scanner(System.in);
		System.out.println("Enter your name ");
		String name=s.next();
		System.out.println("Enter your age ");
		int age=s.nextInt();
		System.out.println("Enter your Gender");
		char gender=s.next().charAt(0);
		System.out.println("Your name is "+name+" Your age is "+age+" You gender is "+gender);

	}
	
}
