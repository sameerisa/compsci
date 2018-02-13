package TurtleGraphics;

import java.awt.Color;
import java.util.ArrayList;

public class randompen implements Pen {
	ArrayList<Pen> pen = new ArrayList<>();
	
	public static void main(String[]args) 
	{
		ArrayList<Pen> pen = new ArrayList<>();
		for(int i = 0; i<3;i++) 
		{
			pen.add(new StandardPen());
			pen.add(new WigglePen());
			pen.add(new RainbowPen());
		}
		for(int i = 0; i<3;i++) 
		{
			int rnd = (int)Math.random()*(pen.size()-1);
			drawSquare(pen.get(rnd));
			pen.remove(rnd);
		}
	}
	public static void drawSquare(Pen pen) 
	{
		for(int i = 1; i<=4; i++) 
		{
			pen.move(50);
			pen.turn(90);
		}
	}

	@Override
	public void down() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void drawString(String text) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void home() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void move(double distance) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void move(double x, double y) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setColor(Color color) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setDirection(double direction) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setWidth(int width) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void turn(double degrees) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void up() {
		// TODO Auto-generated method stub
		
	}

}
