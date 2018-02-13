package interfacelab;
import TurtleGraphics.*;
import TurtleGraphics.Pen;
import TurtleGraphics.StandardPen;

public class UsingShapes {
	public static void main(String[]args) 
	{
		Shape[] sha = new Shape[3];
		sha[0]= new Triangle();
		sha[1]= new Rect();
		sha[2]= new Circle();
		Pen p = new StandardPen();
		
		for(int i = 0; i<3; i++) 
		{
			sha[i].draw(p);
		}
		System.out.println("Triangle "+sha[0].area());
		System.out.println("Rect "+sha[1].area());
		System.out.println("Circle "+sha[2].area());
	}
	
	

}
