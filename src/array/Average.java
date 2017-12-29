package array;

import java.util.Arrays;

public class Average {
	public static void main (String[]args) 
	{
		int[] x = new int[20];
		int sum=0;
		for(int i = 0; i<20; i++) 
		{
			x[i] = (int) Math.ceil(Math.random()*50);
			
		}
		for(int i = 0; i<20; i++) 
		{
			System.out.print(x[i]+":"+i+" ");
		}
		System.out.println();
		for(int i = 0; i<20; i++) 
		{
			sum+=x[i];
		}
		System.out.println("Sum: "+ sum);
		System.out.println("Average: "+ sum/x.length);
		
	}

}
