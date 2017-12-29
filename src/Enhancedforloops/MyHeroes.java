package Enhancedforloops;

public class MyHeroes {
	public static void main(String[]args) 
	{
		Hero[] h = {new Hero("Sam", "FreezeBreath", (int)Math.ceil(Math.random()*50)), new Hero("Joe","Lazers",(int)Math.ceil(Math.random()*50)), new Hero("Sally", "Spin attack",(int)Math.ceil(Math.random()*50))};
		System.out.println(thehealthiest(h));
		
	}
	public static Hero thehealthiest(Hero[] h) 
	{
		Hero temp=h[0];
		for(int i = 1; i <h.length; i++) 
		{
			if(h[i]!=null) 
			{
				if(temp.gethealth()<h[i].gethealth())
					temp=h[i];
			}
		}
		return temp;
	}

}
