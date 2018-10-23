import java.util.Scanner;
import java.util.Random;
public class GuessANumber 
{
	
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		Random rand = new Random();
		Math.random();
		int answer = rand.nextInt(10);
		
		System.out.println("You have 3 attempts");
		System.out.println("guess a number between 0 and 10");
		

		String number = scan.nextLine();
		int number2 =  Integer.parseInt(number);
		if (number2 == answer)
		{
			System.out.println("You got it right! The answer was " + answer + " and you guessed " + number + "");
		}
		
		else if (number2 != answer)
		{
			System.out.println("You got it wrong. You have 2 attempts left. Try again");
			System.out.println("guess a number between 0 and 10");
			

			String number3 = scan.nextLine();
			int number4 =  Integer.parseInt(number3);
			
			if (number4 == answer)
			{
				System.out.println("You got it right! The answer was " + answer + " and you guessed " + number3 + "");
			}
			
			else if (number4 != answer)
			{
				System.out.println("You got it wrong. You have 1 attempt left. Try again");
				System.out.println("guess a number between 0 and 10");
				
				String number5 = scan.nextLine();
				int number6 = Integer.parseInt(number5);
			
				if (number6 == answer)
				{
					System.out.println("You got it right! The answer was " + answer + " and you guessed " + number5 + "");
				}
				
				else if (number6 != answer)
				{
					System.out.println("You got it wrong. You have no attempts left.");
					System.out.println("You guessed: " + number + ", " + number3 + ", and " + number5 + " and the answer was " + answer);

				}
			}
			
		}
	}
}
