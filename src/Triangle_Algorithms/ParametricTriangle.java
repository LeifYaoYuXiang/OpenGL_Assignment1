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
		float x_min=Math.min(C.x, Math.min(A.x,B.x));
		float x_max=Math.max(C.x, Math.max(A.x,B.x));
		System.out.println("X_Min:"+x_min+"-----"+"X:Max:"+x_max);
		
		float y_min=Math.min(C.y,Math.min(A.y,B.y));
		float y_max=Math.max(C.y, Math.max(A.y,B.y));
		System.out.println("Y_Min:"+y_min+"-----"+"Y:Max:"+y_max);
		
		
		float A_BC=this.Distance(A, B, C);
		System.out.println("A_BC:"+A_BC);
		
		float C_AB=this.Distance(C, A, B);
		System.out.println("C_AB:"+C_AB);
		
		
		for(int x=(int) x_min;x<x_max;x++) {
			for(int y=(int) y_min;y<y_max;y++) {
				float alpha=this.Distance(new Point3f(x,y,0), B, C)/A_BC;
				float gamma=this.Distance(new Point3f(x,y,0), A, B)/C_AB;
				float beta=1-alpha-gamma;
				
				if(alpha<0||gamma<0||beta<0) {
					continue;
				}
				System.out.print("<"+x+"------"+y+">");
				this.setPixel(g, x, y, alpha, gamma, beta);
			}
		}
		 
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
		float a=Beginning.x;
		float b=Beginning.y;
		float c=End.x;
		float d=End.y;
		
		float x=Check.x;
		float y=Check.y;
		
		return (float) (((b-d)*x+(c-a)*y+(a*d-b*c))/Math.sqrt((b-d)*(b-d)+(c-a)*(c-a)));

	}

}
