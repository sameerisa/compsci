package interfacelab;

import TurtleGraphics.Pen;

public class Triangle implements Shape{
	int x,y;
	double height;
	public Triangle(int x, int y, int height) 
	{
		this.x=x;
		this.y=y;
		this.height=height;
	}
	public Triangle() 
	{
		x=20;
		y=20;
		height=10;
	}

	@Override
	public double area() {
		// TODO Auto-generated method stub
		return .5 * height *height;
	}

	@Override
	public void draw(Pen p) {
		p.up();
		p.move(x, y);
		p.down();
		p.move(height, 0);
		p.move(x, height);
		
		
	}

	@Override
	public double getXPos() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double getYPos() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void move(double xLoc, double yLoc) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void stretchBy(double factor) {
		// TODO Auto-generated method stub
		
	}

}
