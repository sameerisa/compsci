package searching;

import java.util.Scanner;

public class Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner read = new Scanner(System.in);
		int[][] square = new int[4][4];
		int n=-1;
		
		
		
		System.out.println("Enter in 16 numbers");
		
		for(int i=0; i<square.length; i++) 
		{
			for(int j=0; j<square[i].length; j++) 
			{
				n=read.nextInt();
				read.nextLine();
				while(n<0) 
				{
					n=read.nextInt();
					read.nextLine();
				}
				
				square[i][j]=n;
				n=-1;
				
			}
		}
		
		for(int i=0; i<square.length; i++) 
		{
			for(int j=0; j< square[i].length; j++) 
			{
				System.out.print(square[i][j]+" ");
			}
			System.out.println();
		}
		int sum = sumRow(square, 1);
		//System.out.println(sum);
		
		Boolean test = false;
		while(true) 
		{
			if(sum!=sumRow(square, 1))
			{
				break;
			}
			if(sum!=sumRow(square, 2))
			{
				break;
			}
			if(sum!=sumRow(square, 3))
			{
				break;
			}
			
			if(sum!=sumCol(square, 0))
				break;
			if(sum!=sumCol(square, 1))
				break;
			if(sum!=sumCol(square, 2))
				break;
			if(sum!=sumCol(square, 3))
				break;
			
			int sum1=0;
			int num=0;
			for(int i=0; i<4; i++) 
			{
				sum1+=square[i][num];
				num++;
				
			}
			//System.out.println(sum1);
			if(sum!=sum1)
				break;
			num=0;
			sum1=0;
			for(int i=3; i>=0; i--) 
			{
				sum1+=square[i][num];
				num++;
			}
			//System.out.println(sum1);
			if(sum!=sum1)
				break;
			
			
			
			
			
			
			test=true;
			
			break;
		}
		if(test) 
		{
			System.out.println("It is a magic square");
		}
		else 
		{
			System.out.println("It is not a magic square");
		}
		
		
	}

	public static int sumCol(int[][] a, int index) 
	{
		int sum=0;
		for(int i = 0; i<4; i++) 
		{
			sum+=a[i][index];
		}
		//System.out.println(sum);
		return sum;
		
	}
	public static int sumRow(int[][] a, int index) 
	{
		int sum=0;
		for(int i = 0; i<4; i++) 
		{
			sum+=a[index][i];
		}
		//System.out.println(sum);
		return sum;
		
	}

}
