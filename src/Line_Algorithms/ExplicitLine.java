package Line_Algorithms;


import java.awt.Graphics;
import GraphicsObjects.Point3f;

public class ExplicitLine {
	
	Point3f Start;
	Point3f End;
	float slope; 
	
	
	public static final float INFINITY = (float) (1.0 / 0.0);
	 
	public ExplicitLine(Point3f Start, Point3f End) { 
		this.Start = Start;
		this.End = End;
		slope = getSlope(); // you need to implement this before the class will compile 
	}
	
	// Implement and comment what the method does
	public float getSlope()
	{
		 float run=this.End.x-this.Start.x;
		 float rise=this.End.y-this.Start.y;
		 
		 if(run!=0) {
			 this.slope=(rise/run);
			 return this.slope;
		 }else {
			 return INFINITY;
		 }
		
	}
	
	// Implement in Explicit form, and comment what the method does
	public void drawLine(Graphics g)
	{
		System.out.println("Draw Line!");
		float rise=this.End.y-this.Start.y;
		float run=this.End.x-this.Start.x;
		System.out.println("RISE:"+rise+"---RUN:"+run);
		if(run>0) {
			if(rise>0) {
				if(run>=rise) {
					System.out.println("RUN>0 RISE>0 RUN>=RISE");
					System.out.println("Slope:"+this.getSlope());
					for(int x=(int) this.Start.x;x<this.End.x;x++) {
						int y=(int) (this.getSlope()*x+(this.Start.y-this.getSlope()*this.Start.x));
						System.out.println("<"+x+","+y+">");
						this.setPixel(g, x, y);
					}
				}else {
					System.out.println("RUN>0 RISE>0 RUN<RISE");
					System.out.println("Slope:"+this.getSlope()+"----SlopeVerse"+1/this.getSlope());
					for(int y=(int) this.Start.y;y<this.End.y;y++) {
						float slopeVerse=1/this.getSlope();
						int x= (int) (slopeVerse*y+(this.Start.x-slopeVerse*this.Start.y));
						System.out.println("<"+x+","+y+">");
						this.setPixel(g, x, y);
					}
				}
			}else if(rise<0) {
				if(run>=-rise) {
					System.out.println("RUN>0 RISE<0 |RUN|>|RISE|");
					for(int x=(int) this.Start.x;x<this.End.x;x++) {
						int y=(int) (this.getSlope()*x+(this.Start.y-this.getSlope()*this.Start.x));
						System.out.println("<"+x+","+y+">");
						this.setPixel(g, x, y);
					}
				}else {
					System.out.println("RUN>0 RISE<0 |RUN|<|RISE|");
					System.out.println("Slope:"+this.getSlope()+"----SlopeVerse"+1/this.getSlope());
					for(int y=(int) this.Start.y;y<this.End.y;y++) {
						float slopeVerse=1/this.getSlope();
						int x= (int) (slopeVerse*y+(this.Start.x-slopeVerse*this.Start.y));
						System.out.println("<"+x+","+y+">");
						this.setPixel(g, x, y);
					}
				}
			}else {
				//rise==0
				for(int x=(int) this.Start.x;x<this.End.x;x++) {
					System.out.println("<"+x+","+this.Start.y+">");
					this.setPixel(g, x, (int) this.Start.y);
				}
			}
		} 
		else if(run<0) {
			if(rise>0) {
				if(-run>=rise) {
					System.out.println("RUN<0 RISE>0 |RUN|>|RISE|");
					System.out.println("Slope:"+this.getSlope());
					for(int x=(int) this.Start.x;x<this.End.x;x++) {
						
						int y=(int) (this.getSlope()*x+(this.Start.y-this.getSlope()*this.Start.x));
						System.out.println("<"+x+","+y+">");
						this.setPixel(g, x, y);
					}
				}else {
					System.out.println("RUN<0 RISE>0 |RUN|<|RISE|");
					System.out.println("Slope:"+this.getSlope()+"----SlopeVerse"+1/this.getSlope());
					for(int y=(int) this.Start.y;y<this.End.y;y++) {
						float slopeVerse=1/this.getSlope();
						int x= (int) (slopeVerse*y+(this.Start.x-slopeVerse*this.Start.y));
						System.out.println("<"+x+","+y+">");
						this.setPixel(g, x, y);
					}
				}
			}else if(rise<0) {
				if(-run>=-rise) {
					System.out.println("RUN<0 RISE<0 |RUN|>|RISE|");
					System.out.println("Slope:"+this.getSlope());
					for(int x=(int) this.Start.x;x<this.End.x;x++) {
						int y=(int) (this.getSlope()*x+(this.Start.y-this.getSlope()*this.Start.x));
						System.out.println("<"+x+","+y+">");
						this.setPixel(g, x, y);
					}
				}else {
					System.out.println("RUN<0 RISE<0 |RUN|<|RISE|");
					System.out.println("Slope:"+this.getSlope()+"----SlopeVerse"+1/this.getSlope());
					for(int y=(int) this.Start.y;y<this.End.y;y++) {
						float slopeVerse=1/this.getSlope();
						int x= (int) (slopeVerse*y+(this.Start.x-slopeVerse*this.Start.y));
						System.out.println("<"+x+","+y+">");
						this.setPixel(g, x, y);
					}
				}
			}else {
				//rise==0
				for(int x=(int) this.Start.x;x<this.End.x;x++) {
					System.out.println("<"+x+","+this.Start.y+">");
					this.setPixel(g, x, (int) this.Start.y);
				}
			}	
		}else {
			//run==0
			if(rise!=0) {
				for(int y=(int) this.Start.y;y<this.End.y;y++) {
					this.setPixel(g, (int) this.Start.x, y);
				}
			}else {
				this.setPixel(g, (int)this.Start.x,(int)this.Start.y );
			}
		}
   
	}
	
	//I have implemented this method to adapt Swings coordinate system 
	public void setPixel(Graphics g,int x,int y)  
	{
		g.drawRect(x+500, 500-y, 1,1);  // + 500 offset is to make the centre 0,0 at centre of the screen 
		  
	}

}
