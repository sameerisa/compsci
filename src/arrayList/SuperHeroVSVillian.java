package arrayList;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import hero.Hero;
import hero.Villain;

public class SuperHeroVSVillian {
	public static void main(String[]args) 
	{
		
		
		Scanner read = new Scanner(System.in);
		
		p("Welcome to your customized superhero story");
		p("Enter your heros alias, superpower and then the amount of health your hero will have");
		Hero hero = new Hero(read.nextLine(),read.nextLine(),read.nextInt());
		read.nextLine();
		p("Enter your villains alias, evil power and then the amount of health");
		Villain villain = new Villain(read.nextLine(),read.nextLine(),read.nextInt());
		p(hero.toString());
		p(villain.toString());
		
		p("The story begins in the city.");
		delay(2);
		psc(villain.getalias()+" killed "+hero.getalias()+"'s father. \n");
		delay(2);
		psc("Ever since then "+hero.getalias()+" has been fighting crime to supress his hatred towards "+villain.getalias()+".\n");
		delay(2);
		psc("One day "+villain.getalias()+" was loitering at the park.\n");
		delay(1);
		psc("All the parents were in outrage. \n");
		delay(2);
		psc("Suddenly in the sky "+hero.getalias()+" was flying by. \n");
		delay(1);
		psc("The parents stood in awe. \n");
		delay(2);
		psc("As "+hero.getalias()+" flew down "+villain.getalias()+" used his "+villain.getevilpower()+" on "+hero.getalias() +"\n");
		delay(2);
		psc("It wasent very effective. \n");
		delay(1);
		psc("A battle broke out. \n");
		delay(1);
		psc(hero.getalias()+" used "+hero.getsuperpower()+"\n");
		delay(1);
		fight(hero, villain);
		delay(1);
		while(hero.gethealth()!=0 && villain.gethealth()!=0)
			fight(hero, villain);
		
		if(hero.gethealth()==0) {
			psc(hero.getalias()+" was defeated. "+villain.numberofPeopleHarmed()+" people were hurt." + "\n");
			psc("To this day "+villain.getalias()+" continues to reign terror over the city");
		}
		if(villain.gethealth()==0) {
			psc(villain.getalias()+" was defeated. "+hero.numberofPeopleSaved()+ " people were saved \n");
			
			psc("To this day "+hero.getalias()+" continues to clean the streets from crime");
		}
		
		
		
		
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
