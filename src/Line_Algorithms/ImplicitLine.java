package Line_Algorithms;

import java.awt.Graphics;
import GraphicsObjects.Point3f;

public class ImplicitLine {
	
	/*
	 * Author:Leif;
	 * Date:2019/9/20
	 * BJUT Number:17372323
	 * UCD Number:17205995
	 * */
	
	//start point of line segment
	Point3f Start;
	//end point of line segment
	Point3f End;

	public ImplicitLine(Point3f Start, Point3f End) {
		this.Start = Start;
		this.End = End;
	}

	/*
	 * Goal:
	 * 	draw a line according to the start point and end point
	 * Mechanism:
	 * 	- Step 1:scan the rectangle whose diagonal is the line segment which I want to draw
	 * 	- step 2:find the point which is close to the line segment enough
	 *  - step 3:draw the point, and these points will gather to form a line 
	 * */
	
	public void drawLine(Graphics g) {
		//scan horizontally
		float max_x=Math.max(this.Start.x, this.End.x);
		float min_x=Math.min(this.Start.x, this.End.x);
		float max_y=Math.max(this.Start.y, this.End.y);
		float min_y=Math.min(this.Start.y, this.End.y);
		System.out.println(max_x+"--"+min_x+"--"+max_y+"--"+min_y);
		
		if(max_x==min_x || max_y==min_y) {
			if(max_x==min_x && max_y!=min_y) {
				System.out.println("max_x==min_x");
				int x=(int) max_x;
				for(int y=(int) min_y;y<max_y;y++) {
					this.setPixel(g, x, y);
				}
			}else if(max_y==min_y && max_x!=min_x) {
				System.out.println("max_y==min_y");
				int y=(int) max_y;
				for(int x=(int) min_x;x<max_x;x++) {
					this.setPixel(g, x, y);
				}
			}else {
				return;
			}
			return;
		}else {
			for(int x=(int) min_x;x<(int) max_x;x++) {
				//scan vertically
				for(int y=(int) min_y;y<max_y;y++) {
					//judge the point is "close" to line segment enough
					if(this.Distance(new Point3f(x,y,0) , this.Start, this.End)<2) {
						//if so, draw it!
						this.setPixel(g, x, y);
					}
				}
			}
		}
		
 
	}

	 
	/*
	 * Goal:
	 * 	calculate the distance from a certain point to a line
	 * Mechanism:
	 * 	use the following formula:
	 * 		Math.abs((b-d)*x+(c-a)*y+(a*d-b*c))/Math.sqrt((b-d)*(b-d)+(c-a)*(c-a))
	 * */
	public float Distance(Point3f Check, Point3f Beginning, Point3f End) {
		float a=Beginning.x;
		float b=Beginning.y;
		float c=End.x;
		float d=End.y;
		
		float x=Check.x;
		float y=Check.y;
		
		return (float) (Math.abs((b-d)*x+(c-a)*y+(a*d-b*c))/Math.sqrt((b-d)*(b-d)+(c-a)*(c-a)));

	}

	
	public void setPixel(Graphics g, int x, int y) {
		g.drawRect(x + 500, 500 - y, 1, 1); 
	}

}
