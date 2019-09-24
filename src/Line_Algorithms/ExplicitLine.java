package Line_Algorithms;


import java.awt.Graphics;
import GraphicsObjects.Point3f;

public class ExplicitLine {
	
	/*
	 * Author:Leif;
	 * Date:2019/9/20
	 * BJUT Number:17372323
	 * UCD Number:17205995
	 * */
	
	//start point of the line segment
	Point3f Start;
	//end point of the line segment
	Point3f End;
	//slope of the line segment
	float slope; 
	
	//Define the Special Condition: the line is perpendicular to x-axis
	public static final float INFINITY = (float) (1.0 / 0.0);
	 
	//Constructor
	public ExplicitLine(Point3f Start, Point3f End) { 
		this.Start = Start;
		this.End = End;
		slope = getSlope();
	}
	
	/*
	 * Goal:
	 * 	get the slope of the line segment
	 * */
	public float getSlope()
	{
		 //the change of x in this line segment
		 float run=this.End.x-this.Start.x;
		 //the change of y in this line segment
		 float rise=this.End.y-this.Start.y;
		 
		 
		 if(run!=0) {
			 //if there is some changes in x-direction
			 this.slope=(rise/run);
			 return this.slope;
		 }else {
			 //else this line is perpendicular to x-axis
			 return INFINITY;
		 }
		
	}
	
	/*
	 * Goal:
	 * 	draw line of explicit form in the canvass 
	 * */
	public void drawLine(Graphics g)
	{
		float rise=this.End.y-this.Start.y;
		float run=this.End.x-this.Start.x;
		
		if(run>0) {
			if(rise>0) {
				if(run>=rise) {
					//RUN>0 RISE>0 RUN>=RISE
					//draw the line step by step in the x-direction 
					for(int x=(int) this.Start.x;x<this.End.x;x++) {
						int y=(int) (this.getSlope()*x+(this.Start.y-this.getSlope()*this.Start.x));
						this.setPixel(g, x, y);
					}
				}else {
					//RUN>0 RISE>0 RUN<RISE
					//draw the line step by step in y-direction
					for(int y=(int) this.Start.y;y<this.End.y;y++) {
						float slopeVerse=1/this.getSlope();
						int x= (int) (slopeVerse*y+(this.Start.x-slopeVerse*this.Start.y));
						this.setPixel(g, x, y);
					}
				}
			}else if(rise<0) {
				if(run>=-rise) {
					//RUN>0 RISE<0 |RUN|>=|RISE|
					//draw the line step by step in x-direction
					for(int x=(int) this.Start.x;x<this.End.x;x++) {
						int y=(int) (this.getSlope()*x+(this.Start.y-this.getSlope()*this.Start.x));
						this.setPixel(g, x, y);
					}
				}else {
					//RUN>0 RISE<0 |RUN|<|RISE|
					//draw the line step by step in y-direction
					for(int y=(int) this.End.y;y<this.Start.y;y++) {
						float slopeVerse=1/this.getSlope();
						int x= (int) (slopeVerse*y+(this.Start.x-slopeVerse*this.Start.y));
						this.setPixel(g, x, y);
					}
				}
			}else {
				//rise==0
				for(int x=(int) this.Start.x;x<this.End.x;x++) {
					this.setPixel(g, x, (int) this.Start.y);
				}
			}
		} 
		else if(run<0) {
			if(rise>0) {
				if(-run>=rise) {
					//RUN<0 RISE>0 |RUN|>|RISE|
					//draw the line step by step in x-direction
					for(int x=(int) this.End.x;x<this.Start.x;x++) {
						int y=(int) (this.getSlope()*x+(this.Start.y-this.getSlope()*this.Start.x));
						this.setPixel(g, x, y);
					}
				}else {
					//RUN<0 RISE>0 |RUN|<|RISE|
					//draw the line step by step in y-direction
					for(int y=(int) this.Start.y;y<this.End.y;y++) {
						float slopeVerse=1/this.getSlope();
						int x= (int) (slopeVerse*y+(this.Start.x-slopeVerse*this.Start.y));
						this.setPixel(g, x, y);
					}
				}
			}else if(rise<0) {
				if(-run>=-rise) {
					//RUN<0 RISE<0 |RUN|>|RISE|
					//draw the line step by step in x-direction
					for(int x=(int) this.End.x;x<this.Start.x;x++) {
						int y=(int) (this.getSlope()*x+(this.Start.y-this.getSlope()*this.Start.x));
						this.setPixel(g, x, y);
					}
				}else {
					//RUN<0 RISE<0 |RUN|<|RISE|
					//draw the line step by step in y-direction
					for(int y=(int) this.End.y;y<this.Start.y;y++) {
						float slopeVerse=1/this.getSlope();
						int x= (int) (slopeVerse*y+(this.Start.x-slopeVerse*this.Start.y));
						this.setPixel(g, x, y);
					}
				}
			}else {
				//rise==0
				for(int x=(int) this.End.x;x<this.Start.x;x++) {
					this.setPixel(g, x, (int) this.Start.y);
				}
			}	
		}else {
			//run==0
			if(rise!=0) {
				int min_y=(int) Math.min(this.Start.y,this.End.y);
				int max_y=(int) Math.max(this.Start.y, this.End.y);
				for(int y=min_y;y<max_y;y++) {
					this.setPixel(g, (int) this.Start.x, y);
				}
			}else {
				this.setPixel(g, (int)this.Start.x,(int)this.Start.y );
			}
		}
   
	}
	
	
	public void setPixel(Graphics g,int x,int y)  
	{
		g.drawRect(x+500, 500-y, 1,1); 
		  
	}

}
