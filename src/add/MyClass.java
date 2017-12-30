package add;

import java.util.Scanner;

import array.Student;

public class MyClass {
	public static void main(String[]args) {
		
	
		
				
		Student[] s	= new Student[20];
		int size = 0;
		boolean running = true;
		
	
		while(running) 
		{
			Scanner read = new Scanner(System.in);
			System.out.println("What do you want to do");
			String temp = read.nextLine();
			
			if(temp.equals("add"))
			{
				
				System.out.println("Enter name followed by 3 test scores: ");
				Student s1 = new Student(read.nextLine(),read.nextInt(),read.nextInt(),read.nextInt());
				read.nextLine();
				addElement(s1, s, size);
				/*int index = laste(s);
				
				if(index == -1) 
				{
					System.out.println("The array is full");
					
				}
				else 
				{
					s[index]=s1;
					
				}
				
				if(index==-1) 
					size=19;
				else
					size = laste(s)-1;
				printArrayAvg(s,size);*/
			}
			if(temp.equals("delete")) 
			{
				deleteElement( s, size);
				/*int index = laste(s);
				if(index!=0) {
				if(index==-1) 
				{
					s[19]=null;
				}
				else
					s[(index-1)]=null;
				}
				else {
			if(index==-1) 
				size=19;
			else
				size = laste(s)-1;
			printArrayAvg(s,size);
			}
			if(laste(s)==-1) 
			{
				size = 19;
			}
			else
				size = laste(s)-1;
				
				*/
			}
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
				break;
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
		
		
		int index = laste(s);
		
		if(index == -1) 
		{
			System.out.println("The array is full");
			
			
		}
		else 
		{
			s[index]=s1;
			
		}
		
		if(index==-1) 
			size=19;
		else
			size = laste(s)-1;
		printArrayAvg(s,size);
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
	private static boolean deleteElement(Student[] s, int size) {
		int index = laste(s);
		if(index!=0) {
			
		if(index==-1) 
		{
			s[19]=null;
			
		}
		else
			s[(index-1)]=null;
			
		
		}
		else {
			System.out.println("Array is empty");
			
	

		}
	
		if(laste(s)==0) {
			size=0;
		}
		else
		{
			size=laste(s)-1;
		}
		printArrayAvg(s,size);
	
		if(s[index-1]==null) {
			return true;
		}
		else 
		{
			return false;
		}
		
		
	}
	private static void printArray(Student[] s, int size) {
		if(size!=0) {
		for(int i=0; i<=size;i++) 
		{
			System.out.print(s[i].getName()+" ");
			
		}
		System.out.println();
	}
	}
	private static void printArrayAvg(Student[] s, int size) {
		if(laste(s)!=0) {
		for(int i=0; i<=size;i++) 
		{
			System.out.print(s[i].getName()+" "+s[i].getAverage()+" ");
			
		}
		System.out.println();
	}
		else {}
	}


}
