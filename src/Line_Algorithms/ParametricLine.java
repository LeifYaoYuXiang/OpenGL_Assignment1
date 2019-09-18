package Line_Algorithms;

import java.awt.Graphics;

import GraphicsObjects.Point3f;

public class ParametricLine {

	Point3f Start;
	Point3f End;

	public ParametricLine(Point3f Start, Point3f End) {
		this.Start = Start;
		this.End = End;

	}

	// Implement in Parametric form , and comment what it does 
	public void drawLine(Graphics g) {
		  Point3f temp=new Point3f();
		  for(double t=0.0;t<=1;t=t+0.01) {
			  temp.x=(float) (this.Start.x+(this.End.x-this.Start.x)*t);
			  temp.y=(float) (this.Start.y+(this.End.y-this.Start.y)*t);
			  System.out.println("<"+temp.x+"------"+temp.y+">");
			  this.setPixel(g, (int)temp.x, (int)temp.y);
		  }
		  
			// setPixel(g, (int) CurrentPoint.x, (int) CurrentPoint.y);
	 
	}

	// I have implemented this method to adapt Swings coordinate system
	public void setPixel(Graphics g, int x, int y) {
		g.drawRect(x + 500, 500 - y, 1, 1); // + 500 offset is to make the
											// centre 0,0 at centre of the
											// screen for swing :-)

	}
}
