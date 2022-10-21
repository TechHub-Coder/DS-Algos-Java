package Multiply;
import java.io.*;
import java.util.Scanner;
public class Multiplypackage
{
	public void multi()
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number of numbers you want to multiply:");
		int N=sc.nextInt();
		System.out.println("Enter a set of "+N+" numbers:");
		int arr[]=new int[N];
		for(int i=0;i<N;i++)
		{
			arr[i]=sc.nextInt();
		}
		int m=1;
		for(int i=0;i<N;i++)
		{
			m=m*arr[i];
		}
		System.out.println("The product is "+m);
	}
}
