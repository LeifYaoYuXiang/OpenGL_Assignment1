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
	 * UCD No.17205995
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
		
		/*
		 * Goal:
		 * 	Test the line drawing
		 * Mechanism:
		 * 	Draw the following line and test does they work well
		 * */
		
//		Draw a line in a explicit way
//		ExplicitLine FirstLine = new ExplicitLine(new Point3f(0, 0, 0), new Point3f(200, 100, 0));
//		
//		//Draw a line in a implicit way
//		ImplicitLine SecondLine = new ImplicitLine(new Point3f(0, 0, 0), new Point3f(200, 200, 0)); 
//		
//		//Draw a line in a parametric way
//		ParametricLine ThirdLine = new ParametricLine(new Point3f(0, 0, 0), new Point3f(75, 200, 0));
//		
//		FirstLine.drawLine(g);
//		SecondLine.drawLine(g);
//		ThirdLine.drawLine(g);
		
		
		
		/*
		 * Goal:
		 * 	Test the line drawing (Explicit)
		 * */
		
//		ExplicitLine FirstLine = new ExplicitLine(new Point3f(0, 0, 0), new Point3f(200, 100, 0));
//		ExplicitLine SecondLine = new ExplicitLine(new Point3f(0, 0, 0), new Point3f(200, 200, 0)); 
//		ExplicitLine ThirdLine = new ExplicitLine(new Point3f(0, 0, 0), new Point3f(75, 200, 0));
//		ExplicitLine FourthLine = new ExplicitLine(new Point3f(0, 0, 0), new Point3f(25, 200, 0));
//
//		FirstLine.drawLine(g);
//		SecondLine.drawLine(g);
//		ThirdLine.drawLine(g);
//		FourthLine.drawLine(g);
		

		
		/*
		 * Goal:
		 * 	Test the line drawing (Implicit)
		 * */
		
//		ImplicitLine FirstLine = new ImplicitLine(new Point3f(0, 0, 0), new Point3f(200, 100, 0));
//		ImplicitLine SecondLine = new ImplicitLine(new Point3f(0, 0, 0), new Point3f(200, 200, 0));
//		ImplicitLine ThirdLine = new ImplicitLine(new Point3f(0, 0, 0), new Point3f(75, 200, 0));
//		ImplicitLine FourthLine = new ImplicitLine(new Point3f(0, 0, 0), new Point3f(25, 200, 0));
//
//		FirstLine.drawLine(g);
//		SecondLine.drawLine(g);
//		ThirdLine.drawLine(g);
//		FourthLine.drawLine(g);
		
		
		/*
		 * Goal:
		 * 	Test the line drawing (Parametric)
		 * */
		/*
		ParametricLine FirstLine = new ParametricLine(new Point3f(0, 0, 0), new Point3f(200, 100, 0));
		ParametricLine SecondLine = new ParametricLine(new Point3f(0, 0, 0), new Point3f(200, 200, 0));
		ParametricLine ThirdLine = new ParametricLine(new Point3f(0, 0, 0), new Point3f(75, 200, 0));
		ParametricLine FourthLine = new ParametricLine(new Point3f(0, 0, 0), new Point3f(25, 200, 0));
		
		FirstLine.drawLine(g);
		SecondLine.drawLine(g);
		ThirdLine.drawLine(g);
		FourthLine.drawLine(g);
		*/
		

		/*
		 * Goal:
		 * 	Try to draw a rectangle by using Parametric Way
		 * */	
		
//		ParametricLine FirstLine = new ParametricLine(new Point3f(0, 0, 0), new Point3f(0, 300, 0));
//		ParametricLine SecondLine = new ParametricLine(new Point3f(0, 300, 0), new Point3f(300, 300, 0));
//		ParametricLine ThirdLine = new ParametricLine(new Point3f(300, 300, 0), new Point3f(300, 0, 0));
//		ParametricLine FourthLine = new ParametricLine(new Point3f(300, 0, 0), new Point3f(0, 0, 0));

//		FirstLine.drawLine(g);
//		SecondLine.drawLine(g);
//		ThirdLine.drawLine(g);
//		FourthLine.drawLine(g);	 
		
		
		/*
		 * Goal:
		 * 	Test Parametric Triangle Drawing
		 * */
		/*
		ParametricTriangle MyFirstTriangle = new ParametricTriangle(
											new Point3f(200, 0, 0), 
											new Point3f(400,200, 0),
											new Point3f(200, 370, 0));

		MyFirstTriangle.drawTriangle(g);
		 */
		
		 
		/*
		 * Goal:
		 * 	Draw a house using following methods
		 * */
		drawBackground(g);
		drawHousebody(g);
		drawHouseRoof(g);
		drawWindow(g);
		drawDoor(g);
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
	
	//Draw the background to determine the floor which the house will stand
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
	
	
	//draw the shape of the body of house by using triangle to achieve the color interpolation 
	public static void drawHousebody(Graphics g) {
		// draw the shape of the front face of house
		ParametricTriangle tr1 = new ParametricTriangle(
				new Point3f(0, 0, 0), 
				new Point3f(0,200, 0),
				new Point3f(200, 0, 0),true,true,false);

		tr1.drawTriangle(g);
		
		ParametricTriangle tr2 = new ParametricTriangle(
				new Point3f(200, 200, 0), 
				new Point3f(0,200, 0),
				new Point3f(200, 0, 0),true,true,false);

		tr2.drawTriangle(g);
		
		// draw the shape of the side face of house
		ParametricTriangle tr3 = new ParametricTriangle(
				new Point3f(260, 230, 0),
				new Point3f(200,200, 0),
				new Point3f(200, 0, 0), 
				true,true,false);

		tr3.drawTriangle(g);
		
		ParametricTriangle tr4 = new ParametricTriangle(
				new Point3f(260, 230, 0),
				new Point3f(260,30, 0),
				new Point3f(200, 0, 0), true,true,false);

		tr4.drawTriangle(g);
	}
	
	//use the triangles to draw  the roof of the house by using triangle to achieve the color interpolation 
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
	
	//draw the window by using triangle to achieve the color interpolation 
	public static void drawWindow(Graphics g) {
		ParametricTriangle tr1 = new ParametricTriangle(
				new Point3f(20, 100, 0), 
				new Point3f(20, 150, 0),
				new Point3f(70, 100, 0),false,true,true);

		tr1.drawTriangle(g);
		
		ParametricTriangle tr2 = new ParametricTriangle(
				new Point3f(70, 150, 0), 
				new Point3f(20, 150, 0),
				new Point3f(70, 100, 0),false,true,true);

		tr2.drawTriangle(g);
		
		g.setColor(new Color(72,209,204));
		ParametricLine p1=new ParametricLine(new Point3f(45,100,0),new Point3f(45,150,0));
		p1.drawLine(g);
		ParametricLine p2=new ParametricLine(new Point3f(20,125,0),new Point3f(70,125,0));
		p2.drawLine(g);
		
		
		ParametricTriangle tr3 = new ParametricTriangle(
				new Point3f(130, 100, 0), 
				new Point3f(130, 150, 0),
				new Point3f(180, 150, 0),false,true,true);

		tr3.drawTriangle(g);
		
		ParametricTriangle tr4 = new ParametricTriangle(
				new Point3f(130, 100, 0), 
				new Point3f(180, 100, 0),
				new Point3f(180, 150, 0),false,true,true);

		tr4.drawTriangle(g);
		
		g.setColor(new Color(72,209,204));
		ParametricLine p3=new ParametricLine(new Point3f(155,100,0),new Point3f(155,150,0));
		p3.drawLine(g);
		ParametricLine p4=new ParametricLine(new Point3f(130,125,0),new Point3f(180,125,0));
		p4.drawLine(g);
	}
	
	
	//draw the door by using triangle to achieve the color interpolation 
	public static void drawDoor(Graphics g) {
		ParametricTriangle tr1 = new ParametricTriangle(
				new Point3f(80, 0, 0), 
				new Point3f(80, 75, 0),
				new Point3f(120, 75, 0),false,true,false);

		tr1.drawTriangle(g);
		
		ParametricTriangle tr2 = new ParametricTriangle(
				new Point3f(80 ,0, 0), 
				new Point3f(120, 0 , 0),
				new Point3f(120, 75, 0),false,true,false);

		tr2.drawTriangle(g);
		
		g.setColor(Color.white);
		ParametricLine p4=new ParametricLine(new Point3f(100,0,0),new Point3f(100,75,0));
		p4.drawLine(g);
		
	}
	
	//use line to draw the tips of house
	public static void drawTips(Graphics g) {
		
		ParametricTriangle tr1 = new ParametricTriangle(
				new Point3f(-130, 0, 0), 
				new Point3f(-130, 20, 0),
				new Point3f(-20, 20, 0),true,false,true);

		tr1.drawTriangle(g);
		
		ParametricTriangle tr2 = new ParametricTriangle(
				new Point3f(-130, 0, 0), 
				new Point3f(-20,0,0),
				new Point3f(-20, 20, 0),true,false,true);
		tr2.drawTriangle(g);
		
		ParametricTriangle tr3 = new ParametricTriangle(
				new Point3f(-80, 0, 0), 
				new Point3f(-60, 0, 0),
				new Point3f(-60, -70, 0),true,false,true);

		tr3.drawTriangle(g);
		
		ParametricTriangle tr4 = new ParametricTriangle(
				new Point3f(-80, 0, 0), 
				new Point3f(-80,-70,0),
				new Point3f(-60, -70, 0),true,false,true);

		tr4.drawTriangle(g);

		
		g.setColor(Color.black);
		g.drawString("My House", 400, 495);		
	}

}
