package Triangle_Algorithms;

import java.awt.Color;
import java.awt.Graphics;

import GraphicsObjects.Point3f;

public class ParametricTriangle {
	
	//Three points of the triangle
	Point3f A;
	Point3f B;
	Point3f C;
	
	//the following boolean values to determine whether render the color interpolation or not
	//variable al-->alpha;
	//variable be-->beta;
	//variable ga-->gamma
	boolean al=true;
	boolean be=true;
	boolean ga=true;

	//Constructor: without color coefficient
	public ParametricTriangle(Point3f a, Point3f b, Point3f c) {
		A = a;
		B = b;
		C = c;
	}
	
	//Constructor: with color coefficient
	public ParametricTriangle(Point3f a, Point3f b, Point3f c,boolean alpha,boolean beta, boolean gamma) {
		A = a;
		B = b;
		C = c;
		this.al=alpha;
		this.be=beta;
		this.ga=gamma;
	}
	

	/*
	 * Goal:
	 * 	draw the triangle defined by the three points
	 * Mechanism:
	 * -step 1: find the minimum x-position & y-position of three points
	 * -step 2: find the maximum x-position & y-position of three points
	 * -step 3: scan a rectangle area where it just contains the triangle
	 * 			and judge the point is inside the triangle or not
	 * -step 4: if it is inside the triangle, then draw it
	 * */ 
	public void drawTriangle(Graphics g) {
		int x_min=(int) Math.min(C.x, Math.min(A.x,B.x));
		int  x_max=(int) Math.max(C.x, Math.max(A.x,B.x));
		
		int y_min=(int) Math.min(C.y,Math.min(A.y,B.y));
		int y_max=(int) Math.max(C.y, Math.max(A.y,B.y));
		
		
		//calculate the distance from A to BC & C to AB
		//Here is a trick: "distance" here can be negative value,
			//which will depend on the point is on the left of line or right 
		float A_BC=this.Distance(A, B, C);
		float C_AB=this.Distance(C, A, B);
		
		//scan horizontally
		for(float x=(int) x_min;x<x_max;x=x+1.0f) {
			//scan vertically
			for(float y=(int) y_min;y<y_max;y=y+1.0f) {
				float alpha=this.Distance(new Point3f(x,y,0), B, C)/A_BC;
				float gamma=this.Distance(new Point3f(x,y,0), A, B)/C_AB;
				float beta=1-alpha-gamma;
				
				//if the point we check is outside the triangle, then we don't draw it
				if(alpha<0.0||gamma<0.0||beta<0.0) {
					continue;
				}
				this.setPixel(g, (int)x,(int) y, alpha, gamma, beta);
			}
		}
		 
	}

	/*
	 * Goal:
	 * 	Draw the pixel 	
	 * Mechanism:
	 * 	use different color to different pixel according to the distance to the line
	 * */
	public void setPixel(Graphics g, int x, int y, float R, float G, float B) {
		//whether to draw it or not?
		if(!this.al) {
			R=1;
		}
		if(!this.be) {
			G=1;
		}
		if(!this.ga) {
			B=1;
		}
		Color pixelColour = new Color(R, G, B);
		g.setColor(pixelColour);
		g.fillRoundRect(x + 500, 500 - y, 1, 1,1, 0);
	}

	/*
	 * Goal:
	 * 	calculate the distance from the check point to the line segment
	 * Mechanism:
	 * 	Use the formula: 
	 * 		((b-d)*x+(c-a)*y+(a*d-b*c))/Math.sqrt((b-d)*(b-d)+(c-a)*(c-a))
	 * 	Mention: Here "distance" can be negative value,which means it is on the right of the line regarding CCW
	 **/
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
