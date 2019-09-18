package Line_Algorithms;

import java.awt.Color;
import java.awt.Graphics;

import GraphicsObjects.Point3f;
import GraphicsObjects.Vector3f;

public class ImplicitLine {

	Point3f Start;
	Point3f End;

	public ImplicitLine(Point3f Start, Point3f End) {
		this.Start = Start;
		this.End = End;

	}

	// Implement in Explict form , Extra marks for reducing the search space
	// before you draw the line , and comment what the method does 
	public void drawLine(Graphics g) {
		for(int x=(int) this.Start.x;x<this.End.x;x++) {
			for(int y=(int) this.Start.y;y<this.End.y;y++) {
				if(this.Distance(new Point3f(x,y,0) , this.Start, this.End)<0.5) {
					this.setPixel(g, x, y);
				}
			}
		}
 
	}

	 
	//implement Distance formulas using your notes , and comment what the method does
	public float Distance(Point3f Check, Point3f Beginning, Point3f End) {
		float a=Beginning.x;
		float b=Beginning.y;
		float c=End.x;
		float d=End.y;
		
		float x=Check.x;
		float y=Check.y;
		
		return (float) (Math.abs((b-d)*x+(c-a)*y+(a*d-b*c))/Math.sqrt((b-d)*(b-d)+(c-a)*(c-a)));

	}

	// I have implemented this method to adapt Swings coordinate system
	public void setPixel(Graphics g, int x, int y) {
		g.drawRect(x + 500, 500 - y, 1, 1); // + 500 offset is to make the
											// centre 0,0 at centre of the
											// screen
	}

}
