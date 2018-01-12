package searching;

import java.util.Scanner;

public class Search {
	public static void main(String[]args) 
	{
		Scanner read = new Scanner(System.in);
		int n=1;
		int nnum;
		System.out.println("Enter in 10 numbers in increasing order");
		int[] num = new int[10];
		num[0]=read.nextInt();
		while(n>=9) 
		{
			nnum=read.nextInt();
			
			if(nnum>num[n-1])
			{
			num[n]=read.nextInt();
			
			
			}
			else 
			{
				while(true) 
				{
					System.out.println("Invalid enter another number");
					nnum=read.nextInt();
					if(nnum>num[n-1]) 
					{
						num[n]=read.nextInt();
						break;
					}
				}
			}
			if(n==9) 
			{
				break;
			}
			n++;
			
			
		}
	}

}
