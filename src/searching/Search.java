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
		
		while(true) 
		{
			nnum=read.nextInt();
			
			if(nnum>=num[n-1])
			{
			num[n]=nnum;
			
			
			}
			else 
			{
				while(true) 
				{
					System.out.println("Invalid enter another number");
					nnum=read.nextInt();
					if(nnum>=num[n-1]) 
					{
						num[n]=nnum;
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
		for(int i:num) 
		{
			System.out.print(i+" ");
			
		}
		System.out.println();
		System.out.println("What number do you want to search for");
		nnum=read.nextInt();
		int index=-1;
		for(int i = 0; i<num.length; i++) 
		{
			if(num[i]==nnum) 
			{
				index=i;
				break;
			}
		}
		if(index==-1) 
		{
			System.out.println("Does not exist");
		}
		else 
		{
			System.out.println("The number appears at "+index);
		}
	}

}
