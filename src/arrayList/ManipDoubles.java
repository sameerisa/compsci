package arrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class ManipDoubles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner read = new Scanner(System.in);
		ArrayList<Double> doub = new ArrayList<Double>();
		for(int i = 0; i<5; i++) 
		{
			doub.add(Math.random()*100);
		}
		int i =0;
		for(double dob:doub) 
		{
			
			System.out.print(dob+" index:"+i+" ");
			i++;
		}
		System.out.println();
		System.out.println("What two positions would you like to add");
		double sum = doub.get(read.nextInt())+doub.get(read.nextInt());
		System.out.println(sum);
		
		

	}

}
