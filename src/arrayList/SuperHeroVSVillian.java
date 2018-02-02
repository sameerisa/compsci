package arrayList;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import hero.Hero;
import hero.Villain;

public class SuperHeroVSVillian {
	public static void main(String[]args) 
	{
		
		
		Scanner read = new Scanner(System.in);
		ArrayList<Hero> hero= new ArrayList<Hero>();
		ArrayList<Villain> vil= new ArrayList<Villain>();
		
		p("Welcome to your customized superhero story");
		String ans = null;
		while(true)
		{
			p("Enter your heros alias, superpower and then the amount of health your hero will have or enter quit to continue");
			ans = read.nextLine();
			if(ans.equals("quit"))
				break;
			hero.add(new Hero(ans,read.nextLine(),read.nextInt()));
			read.nextLine();
		}
		
		
		while(true)
		{
			p("Enter your villains alias, evil power and then the amount of health or enter quit to continue");
			ans = read.nextLine();
			if(ans.equals("quit"))
				break;
			vil.add(new Villain(ans,read.nextLine(),read.nextInt()));
			read.nextLine();
			
		}
	
		System.out.println(hero);
		System.out.println(vil);
		
		while(hero.size()!=0 && vil.size()!=0)
		{
			
			int h = (int)(Math.random()*(hero.size()-1));
			int v = (int)(Math.random()*(vil.size()-1));
		
			while(vil.get(v).gethealth()!=0 && hero.get(h).gethealth() !=0)
			{
				
				fight(hero.get(h), vil.get(v));
				
				
			}
			if(vil.get(v).gethealth()==0) 
			{
				
				psc(vil.get(v).getalias()+" has been defeated");
				System.out.println();
				vil.remove(v);
			}
			if(hero.get(h).gethealth()==0)
			{
				psc(hero.get(h).getalias()+" has been defeated");
				System.out.println();
				hero.remove(h);
			}
			
		
		
		
		
		}
		System.out.println();
		
		
		if(hero.size()==0)
			psc("The hero's have been defeated");
		if(vil.size()==0) 
			psc("The villain's have been defeated");
		
	}
	
	
	public static void fight(Hero hero, Villain villain)
	{	
		int h = hero.fight(), v = villain.fight();
		
		if(h>v) 
		{
			villain.harmToHealth();
			psc(hero.getalias()+" delivered a devestating blow \n");
		}
		else if(v>h) 
		{
			hero.harmToHealth();
			psc(villain.getalias()+" delivered a devestating blow \n");
		}
		else 
		{
			psc("Their attacks were ineffective \n");
		}
	}
	public static void delay(int n) 
	{
		try {
			TimeUnit.SECONDS.sleep(n);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void psc(String text) 
	{
		
		    for(int i=0; i<text.length();i++){

		    System.out.print(text.charAt(i));
		    try {
		        Thread.sleep(100); 
		        } catch (Exception e) {
		        e.printStackTrace();
		        }
		    }
	}
	public static void p(String text) 
	{
		System.out.println(text);
	}

}
