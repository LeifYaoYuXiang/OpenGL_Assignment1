package Triangle_Algorithms;

import java.awt.Color;
import java.awt.Graphics;

import GraphicsObjects.Point3f;
import GraphicsObjects.Vector3f;

public class ParametricTriangle {

	Point3f A;
	Point3f B;
	Point3f C;

	public ParametricTriangle(Point3f a, Point3f b, Point3f c) {
		A = a;
		B = b;
		C = c;
	}
	 

	// Implement in Parametric form ,and comment what it does 
	public void drawTriangle(Graphics g) {
		
		 
	}

	//I have implemented this method to adapt Swings coordinate system 
	public void setPixel(Graphics g, int x, int y, float R, float G, float B) {
 
		Color pixelColour = new Color(R, G, B);
		g.setColor(pixelColour);
		g.drawRect(x + 500, 500 - y, 1, 1); // + 500 offset is to make the
											// centre 0,0 at centre of the
											// screen

	}

	//Implement the distance ,  you may use your previous Distance formulas and comment what it does 
	public float Distance(Point3f Check, Point3f Beginning, Point3f End) {
		 

	}

}
