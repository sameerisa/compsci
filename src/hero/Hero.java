package hero;

public class Hero {
	private String alias;
	private String superpower;
	private int health;
	
	public Hero() 
	{
		alias = "Unknown";
		superpower="Unkown";
		health=50;
	}
	public Hero(String alias, String superpower, int health) 
	{
		this.alias=alias;
		this.superpower=superpower;
		if(health<=50 && health>=0) 
		{
			this.health=health;
		}
		else
			health = 25;
		
	}
	public String getalias() 
	{
		return alias;
	}
	public void setalias(String alias) 
	{
		this.alias=alias;
	}
	public String getsuperpower() 
	{
		return superpower;
	}
	public void setsuperpower(String superpower) 
	{
		this.superpower=superpower;
	}
	public int gethealth()
	{
		return health;
	}
	public void sethealth(int health) 
	{
		this.health=health;
	}
	public String toString() 
	{
		return "Alias: "+alias+"\n"+"Superpower: "+superpower+"\n"+"Health: "+health;
		
	}
	public int numberofPeopleSaved() 
	{
		return (int)Math.ceil(Math.random()*100);
	}
	public void harmToHealth() 
	{
		health-=5;
		if(health<0) 
		{
			health=0;
		}
	}
	public int fight()
	{
		return (int)Math.ceil(Math.random()*20);
	}
	
		

}
