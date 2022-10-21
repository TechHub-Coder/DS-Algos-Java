import java.io.*;
import java.util.Scanner;
public class PrimeNumbers
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the limit:");
		int N=sc.nextInt();
		for(int i=2;i<=N;i++)
		{
		int factor=0;
			for(int j=1;j<=i;j++)
			{
				if(i%j==0)
				{
					factor++;
				}
			}
			if(factor==2)
			{
				System.out.println(i);
			}
		}
	}
}			
					

		