package hero;

public class Villain {


	
		private String alias;
		private String evilpower;
		private int health;
		
		public Villain() 
		{
			alias = "Unknown";
			evilpower="Unkown";
			health=75;
		}
		public Villain(String alias, String evilpower, int health) 
		{
			this.alias=alias;
			this.evilpower=evilpower;
			if(health<=75 && health>=0) 
			{
				this.health=health;
			}
			else
				health = 50;
			
		}
		public String getalias() 
		{
			return alias;
		}
		public void setalias(String alias) 
		{
			this.alias=alias;
		}
		public String getevilpower() 
		{
			return evilpower;
		}
		public void setevilpower(String evilpower) 
		{
			this.evilpower=evilpower;
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
			return "Alias: "+alias+"\n"+"evilpower: "+evilpower+"\n"+"Health: "+health;
			
		}
		public int numberofPeopleHarmed() 
		{
			return (int)Math.ceil(Math.random()*100);
		}
		public void harmToHealth() 
		{
			health-=10;
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
