package array;

import java.util.Scanner;

public class Analyze {
	
	
	public static void main(String[]args) 
	{
		int s1=0,s2=1,s3=2,s4=3,s5=4;
		int[] age = new int[5];
		String[] name = new String[5];
		String[] gen = new String[5];
		Scanner read = new Scanner(System.in);
		for(int i = 0; i<5; i++) 
		{
			System.out.println("Enter a name: ");
			name[i]=read.nextLine();
			System.out.println("Enter their age: ");
			age[i]=read.nextInt();
			read.nextLine();
			System.out.println("Enter their gender: ");
			gen[i]=read.nextLine();
		}
		for(int i = 0; i<5; i++) 
		{
			System.out.println(name[i]+" "+age[i]+" "+gen[i]);
		}
		int count=0;
		for(int i = 0; i<5; i++) 
		{
			if(count==0)
				System.out.println("Male: ");
			if(gen[i].equals("male")) 
			{
				
				System.out.println(name[i]+" "+age[i]+" "+gen[i]);
				
			}
			count++;
		}
		count=0;
		for(int i = 0; i<5; i++) 
		{
			if(count==0)
				System.out.println("Female : ");
			
			if(gen[i].equals("female")) 
			{
				
				System.out.println(name[i]+" "+age[i]+" "+gen[i]);
				
			}
			count++;
		}
		count=0;
		for(int i = 0; i<5; i++) 
		{
			if(count==0)
				System.out.println("Other: ");
			if(!gen[i].equals("male")&&!gen[i].equals("female")) 
			{
				System.out.println(name[i]+" "+age[i]+" "+gen[i]);
			}
			
			count++;
		}
	}

}
