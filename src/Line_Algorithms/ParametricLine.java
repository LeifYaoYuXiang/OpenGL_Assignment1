package Line_Algorithms;

import java.awt.Graphics;

import GraphicsObjects.Point3f;

public class ParametricLine {
	
	//the start point of the line segment
	Point3f Start;
	//the end point of the line segment
	Point3f End;
	
	
	//Constructor
	public ParametricLine(Point3f Start, Point3f End) {
		this.Start = Start;
		this.End = End;

	}

	/*
	 * Goal:
	 * 	Draw the line from the start point to the end point
	 * Mechanism:
	 * 	go a very small step in run direction (x-direction) and rise direction (y-direction)
	 * */
	public void drawLine(Graphics g) {
		  Point3f temp=new Point3f();
		  for(double t=0.0;t<=1;t=t+0.001) {
			  temp.x=(float) (this.Start.x+(this.End.x-this.Start.x)*t);
			  temp.y=(float) (this.Start.y+(this.End.y-this.Start.y)*t);
			  this.setPixel(g, (int)temp.x, (int)temp.y);
		  }
	}

	public void setPixel(Graphics g, int x, int y) {
		g.drawRect(x + 500, 500 - y, 1, 1); 

	}
}
