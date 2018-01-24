package arrayList;
import java.util.*;

import array.Student;

public class ArrayList1 {
	  private static String[] Beginning = { "Kr", "Ca", "Ra", "Mrok", "Cru",
		         "Ray", "Bre", "Zed", "Drak", "Mor", "Jag", "Mer", "Jar", "Mjol",
		         "Zork", "Mad", "Cry", "Zur", "Creo", "Azak", "Azur", "Rei", "Cro",
		         "Mar", "Luk" };
		   private static String[] Middle = { "air", "ir", "mi", "sor", "mee", "clo",
		         "red", "cra", "ark", "arc", "miri", "lori", "cres", "mur", "zer",
		         "marac", "zoir", "slamar", "salmar", "urak" };
		   private static String[] End = { "d", "ed", "ark", "arc", "es", "er", "der",
		         "tron", "med", "ure", "zur", "cred", "mur" };
		   
		   private static Random rand = new Random();

	public static void main(String[]args) 
	{
		
		
		
		ArrayList<Integer> num = new ArrayList<Integer>();
		
		for(int i=0; i<10;i++) 
		{
			num.add((int)((Math.random()*10)+1));
		}
		for(int i=0; i<10; i++) 
		{
			System.out.print(num.get(i)+" ");
		}
		System.out.println();
		System.out.println(num);
		
		ArrayList<Double> doub = new ArrayList<Double>();
		for(int i =0; i<5; i++) 
		{
			doub.add(Math.random()*400);
			
		}
		System.out.println(doub);
		ArrayList<String> word = new ArrayList();
		for(int i =0; i<5; i++) 
		{
			word.add(generateName());
		}
		for(int i =0; i<5; i++) 
		{
			System.out.print(word.get(i) + " "+ word.get(i).length()+" ");
			
		}
		System.out.println();
		
		ArrayList<Student> stu = new ArrayList();
		for(int i = 0; i<3;i++) 
		{
			stu.add(new Student(generateName(),(int)(Math.random()*100),(int)(Math.random()*100),(int)(Math.random()*100)));
		}
		for(int i = 0; i<3; i++) 
		{
			System.out.print(stu.get(i).getName()+" "+stu.get(i).getAverage()+" ");
		}
		
	}

	
		 
		   public static String generateName() {

		      return Beginning[rand.nextInt(Beginning.length)] + 
		            Middle[rand.nextInt(Middle.length)]+
		            End[rand.nextInt(End.length)];

		   }
		   
	
}
