package arrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class ManipInts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> num = new ArrayList<Integer>();
		Scanner read = new Scanner(System.in);
		for(int i = 0; i<10; i++) 
		{
			num.add((int)(Math.random()*10+1));
		}
		for(int i = 0; i < num.size(); i++) 
		{
			System.out.print(num.get(i)+" at index "+i+" ");
			
		}
		System.out.println();
		System.out.println("Where would you like to insert a number");
		int index=read.nextInt();
		System.out.println("What number would you like to enter");
		num.add(index, read.nextInt());
		for(int i = 0; i < num.size(); i++) 
		{
			System.out.print(num.get(i)+" at index "+i+" ");
			
		}
		System.out.println();
		System.out.println("What position would you like to delete");
		num.remove(read.nextInt());
		for(int i = 0; i < num.size(); i++) 
		{
			System.out.print(num.get(i)+" at index "+i+" ");
			
		}
		
		
		

	}

}
