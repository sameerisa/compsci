package array;

import java.util.Scanner;

public class Students {
	public static void main(String[]args) 
	{
		Student s[]= new Student[4];
		Scanner read = new Scanner(System.in);
		
		for(int i = 0; i<4; i++) 
		{
			Student temp;
			System.out.println("Enter Name followed by 3 test scores");
			temp = new Student(read.nextLine(), read.nextInt(),read.nextInt(),read.nextInt());
			read.nextLine();
			s[i]=temp;
		}
		for(int i = 0; i<4; i++) 
		{
			System.out.println(s[i].getName()+" "+s[i].getAverage());
			
		}
		System.out.println("The top student is "+Student.getTopStuName());
	}

}
