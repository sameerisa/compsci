package interfacelab;

public class OldMacdonald {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal[] an = new Animal[3];
		an[0]= new Panda();
		an[1]= new Cat();
		an[2]= new Dog();
		
		for(int i = 0; i<3; i++) 
		{
			System.out.println("Old Macdonald had a "+an[i].getPlace()+", E-I-E-I-O");
			System.out.println("and on that "+an[i].getPlace()+" he had an "+an[i].getType()+", E-I-E-I-O");
			System.out.println("with a "+an[i].getNoise()+" "+an[i].getNoise()+" here");
			System.out.println("and a "+an[i].getNoise()+" "+an[i].getNoise()+" there,");
			System.out.println("here a "+an[i].getNoise()+", there a "+an[i].getNoise()+",");
			System.out.println("everywhere a "+an[i].getNoise()+" "+an[i].getNoise()+",");
			System.out.println("Old Macdonald had a "+an[i].getPlace()+", E-I-E-I-O.");
		}

	}

}
