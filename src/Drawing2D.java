import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

import GraphicsObjects.Point3f;
import Line_Algorithms.ExplicitLine;
import Line_Algorithms.ImplicitLine;
import Line_Algorithms.ParametricLine;
import Triangle_Algorithms.ParametricTriangle;


public class Drawing2D extends JPanel {

	/**
	 * Author: Leif
	 * Date: 2019/09/20
	 */
	private static final long serialVersionUID = 1L;

	
	public Drawing2D() // set up graphics window
	{
		setBackground(Color.WHITE);

	}

	public void paintComponent(Graphics g) // draw graphics in the panel
	{
		int width = getWidth(); // width of window in pixels
		int height = getHeight(); // height of window in pixels
		System.out.println("Width:"+width+"------"+"Height:"+height);
		// as swing starts at 0 , 0 , will need to modify drawing

		super.paintComponent(g); // call superclass to make panel display
									// correctly

		g.setColor(Color.BLACK);
		
		//line test code 
		
		//ExplicitLine FirstLine = new ExplicitLine(new Point3f(0, 0, 0), new Point3f(200, 100, 0));
		//ImplicitLine SecondLine = new ImplicitLine(new Point3f(0, 0, 0), new Point3f(200, 200, 0)); // 200
		//ParametricLine ThirdLine = new ParametricLine(new Point3f(0, 0, 0), new Point3f(75, 200, 0));
		
		//FirstLine.drawLine(g);
		//SecondLine.drawLine(g);
		//ThirdLine.drawLine(g);
		
		
		
		 //Remove the comments for Explicit line and test it ,
		/*
		ExplicitLine FirstLine = new ExplicitLine(new Point3f(0, 0, 0), new Point3f(200, 100, 0));
		ExplicitLine SecondLine = new ExplicitLine(new Point3f(0, 0, 0), new Point3f(200, 200, 0)); // 200
		ExplicitLine ThirdLine = new ExplicitLine(new Point3f(0, 0, 0), new Point3f(75, 200, 0));
		ExplicitLine FourthLine = new ExplicitLine(new Point3f(0, 0, 0), new Point3f(25, 200, 0));

		FirstLine.drawLine(g);
		SecondLine.drawLine(g);
		ThirdLine.drawLine(g);
		FourthLine.drawLine(g);

		// */

		// Remove the comments for Implicit line and test it
		
		//ImplicitLine FirstLine = new ImplicitLine(new Point3f(0, 0, 0), new Point3f(200, 100, 0));
		//ImplicitLine SecondLine = new ImplicitLine(new Point3f(0, 0, 0), new Point3f(200, 200, 0));
		//ImplicitLine ThirdLine = new ImplicitLine(new Point3f(0, 0, 0), new Point3f(75, 200, 0));
		//ImplicitLine FourthLine = new ImplicitLine(new Point3f(0, 0, 0), new Point3f(25, 200, 0));

		//FirstLine.drawLine(g);
		//SecondLine.drawLine(g);
		//ThirdLine.drawLine(g);
		//FourthLine.drawLine(g);
		
		//Remove the comments for Parametric line and test it
		
		//ParametricLine FirstLine = new ParametricLine(new Point3f(0, 0, 0), new Point3f(200, 100, 0));
		//ParametricLine SecondLine = new ParametricLine(new Point3f(0, 0, 0), new Point3f(200, 200, 0));
		//ParametricLine ThirdLine = new ParametricLine(new Point3f(0, 0, 0), new Point3f(75, 200, 0));
		//ParametricLine FourthLine = new ParametricLine(new Point3f(0, 0, 0), new Point3f(25, 200, 0));

		//FirstLine.drawLine(g);
		//SecondLine.drawLine(g);
		//ThirdLine.drawLine(g);
		//FourthLine.drawLine(g);
		

		// Remove the comments for an example of square using Parametric lines
		
//		ParametricLine FirstLine = new ParametricLine(new Point3f(0, 0, 0), new Point3f(0, 300, 0));
//		ParametricLine SecondLine = new ParametricLine(new Point3f(0, 300, 0), new Point3f(300, 300, 0));
//		ParametricLine ThirdLine = new ParametricLine(new Point3f(300, 300, 0), new Point3f(300, 0, 0));
//		ParametricLine FourthLine = new ParametricLine(new Point3f(300, 0, 0), new Point3f(0, 0, 0));
//
//		FirstLine.drawLine(g);
//		SecondLine.drawLine(g);
//		ThirdLine.drawLine(g);
//  	FourthLine.drawLine(g);
		// */

//		ParametricTriangle MyFirstTriangle = new ParametricTriangle(
//											new Point3f(200, 0, 0), 
//											new Point3f(400,200, 0),
//											new Point3f(200, 370, 0));
//
//		 MyFirstTriangle.drawTriangle(g);
		 
		
		
		
//		 ParametricLine pl1=new ParametricLine(new Point3f(0,0,0),new Point3f(200,0,0));
//		 pl1.drawLine(g);
//		 ParametricLine pl2=new ParametricLine(new Point3f(200,200,0),new Point3f(200,0,0));
//		 pl2.drawLine(g);
//		 ParametricLine pl3=new ParametricLine(new Point3f(0,0,0),new Point3f(0,200,0));
//		 pl3.drawLine(g);
//		 ParametricLine pl4=new ParametricLine(new Point3f(0,200,0),new Point3f(200,200,0));
//		 pl4.drawLine(g);
//		 
//		 ParametricLine pl5=new ParametricLine(new Point3f(200,0,0),new Point3f(240,30,0));
//		 pl5.drawLine(g);
//		 ParametricLine pl6=new ParametricLine(new Point3f(240,30,0),new Point3f(240,230,0));
//		 pl6.drawLine(g);
//		 ParametricLine pl7=new ParametricLine(new Point3f(200,200,0),new Point3f(240,230,0));
//		 pl7.drawLine(g);
//		 
//		 ParametricLine pl8=new ParametricLine(new Point3f(100,0,0),new Point3f(100,50,0));
//		 pl8.drawLine(g);
//		 ParametricLine pl9=new ParametricLine(new Point3f(80,0,0),new Point3f(80,50,0));
//		 pl9.drawLine(g);
//		 ParametricLine pl10=new ParametricLine(new Point3f(120,0,0),new Point3f(120,50,0));
//		 pl10.drawLine(g);
//		 
//		 ParametricLine pl11=new ParametricLine(new Point3f(80,50,0),new Point3f(120,50,0));
//		 pl11.drawLine(g);
//		 ParametricLine pl12=new ParametricLine(new Point3f(80,25,0),new Point3f(120,25,0));
//		 pl12.drawLine(g);
//		 
//		ParametricTriangle tr1 = new ParametricTriangle(
//													new Point3f(100, 280, 0),
//													new Point3f(0, 200, 0), 
//													new Point3f(200,200, 0)
//													);
//	 	tr1.drawTriangle(g);
//		
//		ParametricTriangle tr2 = new ParametricTriangle(
//										new Point3f(100, 280, 0), 
//										new Point3f(240, 230, 0),
//										new Point3f(200,200, 0)
//										);
//		tr2.drawTriangle(g);
//		
//		ParametricTriangle tr3 = new ParametricTriangle(
//				new Point3f(60,160,0), 
//				new Point3f(60,180,0),
//				new Point3f(80,180,0));
//		tr3.drawTriangle(g);
//		
//		ParametricTriangle tr4 = new ParametricTriangle(
//				new Point3f(80,160, 0), 
//				new Point3f(80,180, 0),
//				new Point3f(60,160, 0));
//		tr4.drawTriangle(g);
//		
////		ParametricTriangle tr4 = new ParametricTriangle(
////				new Point3f(100, 280, 0), 
////				new Point3f(200,200, 0),
////				new Point3f(240, 230, 0));
////		tr4.drawTriangle(g);
		drawBackground(g);
		drawHousebody(g);
		drawHouseRoof(g);
		drawWindow(g);
		drawDoor(g);
		drawRoad(g);
		drawTips(g);
		

	}

	

	public static void main(String[] args) {
		Drawing2D panel = new Drawing2D();
		JFrame ScreenToDrawOn = new JFrame();
		ScreenToDrawOn.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ScreenToDrawOn.setTitle("2D Drawing Application");
		ScreenToDrawOn.setSize(1920, 1080); // window is 500 pixels wide, 400
											// high
		ScreenToDrawOn.setVisible(true);
		ScreenToDrawOn.add(panel);
		
	}
	
	public static void drawBackground(Graphics g) {
		 g.setColor(new Color(135,206,235));
		 
		 for(int x=0;x<2000;x++) {
			 for(int y=471;y>0;y--) {
				 g.fillRoundRect(x, y, 1,1, 1,0);
			 }
		 }
		 g.setColor(Color.blue);
		 ParametricLine pl=new ParametricLine(new Point3f(-1000,30,0),new Point3f(2000,30,0));
		 pl.drawLine(g);
	}
	
	public static void drawHousebody(Graphics g) {
		g.setColor(new Color(178,34,34));
		
		ParametricLine pl=new ParametricLine(new Point3f(0,0,0),new Point3f(200,0,0));
		pl.drawLine(g);
		ParametricLine p2=new ParametricLine(new Point3f(0,0,0),new Point3f(0,200,0));
		p2.drawLine(g);
		ParametricLine p3=new ParametricLine(new Point3f(200,200,0),new Point3f(0,200,0));
		p3.drawLine(g);
		ParametricLine p4=new ParametricLine(new Point3f(200,0,0),new Point3f(200,200,0));
		p4.drawLine(g);
		for(int y=0;y<200;y++) {
			for(int x=0;x<200;x++) {
				g.fillRoundRect(x + 500, 500 - y, 1, 1,1, 0);
			}
		}
		
		g.setColor(new Color(139,0,0));
		ParametricLine p5=new ParametricLine(new Point3f(200,0,0),new Point3f(260,30,0));
		p5.drawLine(g);
		ParametricLine p6=new ParametricLine(new Point3f(260,30,0),new Point3f(260,230,0));
		p6.drawLine(g);
		ParametricLine p7=new ParametricLine(new Point3f(200,200,0),new Point3f(260,230,0));
		p7.drawLine(g);
		
		for(int y=0;y<230;y++) {
			for(int x=200;x<260;x++) {
				if( (200<x && x<260 && y<(0.5*x-100) ) || (200<x && x<260 && y>(0.5*x+100) ) ){
					continue;
				}
				
				g.fillRoundRect(x + 500, 500 - y, 1, 1,1, 0);
			}
		}
	}
	
	public static void drawHouseRoof(Graphics g) {
		ParametricTriangle tr1 = new ParametricTriangle(
				new Point3f(100, 280, 0),
				new Point3f(0, 200, 0), 
				new Point3f(200,200, 0),
				false,false,true
				);
		tr1.drawTriangle(g);

		ParametricTriangle tr2 = new ParametricTriangle(
				new Point3f(100, 280, 0), 
				new Point3f(260, 230, 0),
				new Point3f(200,200, 0),
				false,false,true);
		tr2.drawTriangle(g);
	}
	
	public static void drawWindow(Graphics g) {
		g.setColor(new Color(218,165,32));
		ParametricLine pl=new ParametricLine(new Point3f(20,100,0),new Point3f(20,150,0));
		pl.drawLine(g);
		ParametricLine p2=new ParametricLine(new Point3f(20,100,0),new Point3f(70,100,0));
		p2.drawLine(g);
		ParametricLine p3=new ParametricLine(new Point3f(70,100,0),new Point3f(70,150,0));
		p3.drawLine(g);
		ParametricLine p4=new ParametricLine(new Point3f(20,150,0),new Point3f(70,150,0));
		p4.drawLine(g);
		for(int y=100;y<150;y++) {
			for(int x=20;x<70;x++) {
				g.fillRoundRect(x + 500, 500 - y, 1, 1,1, 0);
			}
		}
		g.setColor(Color.BLACK);
		ParametricLine p5=new ParametricLine(new Point3f(45,100,0),new Point3f(45,150,0));
		p5.drawLine(g);
		ParametricLine p6=new ParametricLine(new Point3f(20,125,0),new Point3f(70,125,0));
		p6.drawLine(g);
		
		g.setColor(new Color(218,165,32));
		ParametricLine p7=new ParametricLine(new Point3f(130,100,0),new Point3f(130,150,0));
		p7.drawLine(g);
		ParametricLine p8=new ParametricLine(new Point3f(130,100,0),new Point3f(180,100,0));
		p8.drawLine(g);
		ParametricLine p9=new ParametricLine(new Point3f(180,100,0),new Point3f(180,150,0));
		p9.drawLine(g);
		ParametricLine p10=new ParametricLine(new Point3f(180,150,0),new Point3f(130,150,0));
		p10.drawLine(g);
		for(int y=100;y<150;y++) {
			for(int x=130;x<180;x++) {
				g.fillRoundRect(x + 500, 500 - y, 1, 1,1, 0);
			}
		}
		g.setColor(Color.BLACK);
		ParametricLine p11=new ParametricLine(new Point3f(155,100,0),new Point3f(155,150,0));
		p11.drawLine(g);
		ParametricLine p12=new ParametricLine(new Point3f(130,125,0),new Point3f(180,125,0));
		p12.drawLine(g);
	}
	
	public static void drawDoor(Graphics g) {
		g.setColor(new Color(72,209,204));
		ParametricLine pl=new ParametricLine(new Point3f(80,0,0),new Point3f(80,75,0));
		pl.drawLine(g);
		ParametricLine p2=new ParametricLine(new Point3f(80,75,0),new Point3f(120,75,0));
		p2.drawLine(g);
		ParametricLine p3=new ParametricLine(new Point3f(120,0,0),new Point3f(120,75,0));
		p3.drawLine(g);
		for(int y=0;y<75;y++) {
			for(int x=80;x<120;x++) {
				g.fillRoundRect(x + 500, 500 - y, 1, 1,1, 0);
			}
		}
		g.setColor(Color.white);
		ParametricLine p4=new ParametricLine(new Point3f(100,0,0),new Point3f(100,75,0));
		p4.drawLine(g);
		
	}
	
	
	private void drawTips(Graphics g) {
		g.setColor(new Color(255,218,185));
		for(int y=0;y<20;y++) {
			for(int x=-130;x<-20;x++) {
				g.fillRoundRect(x + 500, 500 - y, 1, 1,1, 0);
			}
		}
		for(int y=-70;y<0;y++) {
			for(int x=-79;x<-60;x++) {
				g.fillRoundRect(x + 500, 500 - y, 1, 1,1, 0);
			}
		}
		
		g.setColor(Color.BLACK);
		ParametricLine pl=new ParametricLine(new Point3f(-20,0,0),new Point3f(-20,20,0));
		pl.drawLine(g);
		ParametricLine p2=new ParametricLine(new Point3f(-130,0,0),new Point3f(-130,20,0));
		p2.drawLine(g);
		ParametricLine p3=new ParametricLine(new Point3f(-20,20,0),new Point3f(-130,20,0));
		p3.drawLine(g);
		ParametricLine p4=new ParametricLine(new Point3f(-20,0,0),new Point3f(-130,0,0));
		p4.drawLine(g);
		
		ParametricLine p5=new ParametricLine(new Point3f(-60,0,0),new Point3f(-60,-70,0));
		p5.drawLine(g);
		ParametricLine p6=new ParametricLine(new Point3f(-80,0,0),new Point3f(-80,-70,0));
		p6.drawLine(g);
		g.drawString("Hello World", 390, 495);
		
		
		
		
	}
	
	public static void drawRoad(Graphics g) {
		g.setColor(Color.DARK_GRAY);
		ParametricLine p1=new ParametricLine(new Point3f(80,0,0),new Point3f(-60,-70,0));
		p1.drawLine(g);
		ParametricLine p2=new ParametricLine(new Point3f(120,0,0),new Point3f(-20,-70,0));
		p2.drawLine(g);
		
	}
	

}
