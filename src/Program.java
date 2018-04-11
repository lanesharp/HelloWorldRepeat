import java.util.Scanner;

public class Program {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int numtime;
		int count;
	System.out.print("How many times would you like Hello World to be diplayed? ");
	numtime = input.nextInt();
	input.close();
	count = 0;
	if(numtime %2 ==0)
	{
		while(count < numtime)
		{
			System.out.println("Hello World");
			count++;
		}
	}
	else 
	{ 
	 System.out.println("Cannot print odd numbers "); 
	}
	}
}

