import java.io.*;
import java.util.Scanner;

public class NumberMain 
{

	public static void main(String[] args) throws IOException
	{
		// TODO Auto-generated method stub
		int oddNumberCount = 0;
		int loopCtr = 0;
		try
		{
			Scanner fileReader = new Scanner (new File (".\\numbers.txt")  );
			
			int currentNumber = 0; 
			
			while (fileReader.hasNext() )
			{
				loopCtr++;
				currentNumber = fileReader.nextInt();
				if (currentNumber%2 != 0)
				{
					oddNumberCount++;
				}
			}
			
			}
		catch (IOException fileExc)
		{
			System.out.println ("IOException"+ fileExc.getMessage());
		}
		// show the oddNumberCount
		System.out.println ("The odd number count is:" + oddNumberCount);
		System.out.println ("The total number count is:" + loopCtr);
	}

}
