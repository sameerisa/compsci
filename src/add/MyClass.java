package add;

import java.util.Scanner;

import array.Student;

public class MyClass {
	public static void main(String[]args) {
		
	
		
				
		Student[] s	= new Student[20];
		int size = 0;
		boolean running = true;
		Scanner read = new Scanner(System.in);
	
		while(running) 
		{
			System.out.println("What do you want to do");
			String temp = read.nextLine();
			
			if(temp.equals("add"))
			{
				System.out.println("Enter name followed by 3 test scores: ");
				Student s1 = new Student(read.nextLine(),read.nextInt(),read.nextInt(),read.nextInt());
				
				int index = laste(s);
				
				if(index == -1) 
				{
					System.out.println("The array is full");
					
				}
				else 
				{
					s[index]=s1;
					
				}
				
				
				
			}
			if(temp.equals("delete")) 
			{
				int index = laste(s);
				if(index==-1) 
				{
					s[19]=null;
				}
				else
					s[(index-1)]=null;
			}
			size = laste(s)-1;
			if(temp.equals("quit")) 
			{
				running = false;
			}
		
		}
		printArray(s,size);
	}
	
	private static int laste(Student[] s) 
	{
		int index=0;
		for(int i = 0; i < s.length; i++) {
			if(s[i]==null) 
			{
				index = i;
			}
			
		}
		if(index==19) 
		{
			return -1;
		}
		else {
		return index;
		}
	}
	private static boolean addElement(Student s1, Student[] s, int size) {
		if(laste(s)!=-1){
		if(s1.getName()==s[size].getName()) {
			return true;
		}
		else 
		{
			return false;
		}
		}
		else 
		{
			return false;
		}
		
	}
	private static boolean deleteElement(Student s1, Student[] s, int size) {
		if(s[size+1]==null) {
			return true;
		}
		else 
		{
			false;
		}
	}
	private static void printArray(Student[] s, int size) {
		for(Student i:s) 
		{
			System.out.print(i+" ");
			
		}
		System.out.println();
	}

}
