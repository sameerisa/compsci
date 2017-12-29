package Enhancedforloops;

import java.util.ArrayList;

public class AnalyzeNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] rnd = new int[10];
		
		for(int i = 0; i<10; i++) 
		{
			rnd[i]=(int) Math.ceil(Math.random()*5);
		}
		for(int i:rnd) 
		{
			System.out.print(i+" ");
		}
		System.out.println();
		for(int i:AnalyzeNumbers.frequency(rnd)) 
		{
			System.out.print(i+" ");
		}
		System.out.println();
		int[] fre = AnalyzeNumbers.frequency(rnd);
		String mode="";
		int tempm=0;
		int top = 0;
		for(int i = 0; i<fre.length; i++) 
		{
			
			if(fre[i]>top) 
			{
				top = fre[i];
				tempm = i+1;
			}
			
			
		}
		mode+=tempm+" ";
		
		for(int i = 0; i<fre.length; i++)
		{
			
		if(fre[i]==top && (i+1)!=tempm) 
		{
			
			mode+=(i+1)+" ";
			
		}
		}
		/*for(int i:mode) 
		{
			System.out.print(i+" ");
		}*/
		System.out.print(mode);
		System.out.println();
		

	}
	public static int[] frequency(int[] a) 
	{
		int [] fre = new int[5];
		/*
		ArrayList<Integer> temp = new ArrayList<Integer>();
		int[] fre = new int[5];
		boolean test = false;
		temp.add(a[0]);
		for(int i = 0; i<10; i++) 
		{
			
			for(int k = 0; k < temp.size(); k++) 
			{
				
				if(a[i]==temp.get(k)) 
				{
					test=true;
				}
			}
			if(test) 
			{
				
			}
			else 
			{
				temp.add(a[i]);
			}
			test=false;
		}
		
		for(int k=0; k<temp.size(); k++) {
			int count=0;
			int n = 0;
			for(int i = 0; i<10; i++) 
			{
				
				if(temp.get(i)==a[k]) 
				{
					count++;
				}
				i=n;
				
			}
			*/
			for(int i=0; i<10; i++) 
			{
				
			if(a[i]==1) 
			{
				fre[0]++;
			}
			else if(a[i]==2) 
			{
				fre[1]++;
			}
			else if(a[i]==3) 
			{
				fre[2]++;
			}
			else if(a[i]==4) 
			{
				fre[3]++;
			}
			else if(a[i]==5) 
			{
				fre[4]++;
			}
			
			
		}
		return fre;
		
	}

}
