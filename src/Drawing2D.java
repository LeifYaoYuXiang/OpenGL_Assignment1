import java.awt.Color;
import java.awt.Graphics;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
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
		drawSecondHouseBody(g);
		drawSecondHouseRoof(g);
		drawSecondHouseWindow(g);
		drawSecondHouseDoor(g);
		drawHouseShadow(g);
		
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
		 ParametricTriangle tr1 = new ParametricTriangle(
					new Point3f(-500, 30, 0), 
					new Point3f(-500,-450, 0),
					new Point3f(1030, 30, 0),
					new int[]{34,124},new int[]{139,252},new int[]{0,34}) ;
		tr1.drawTriangle(g);
		
		ParametricTriangle tr2 = new ParametricTriangle(
					new Point3f(1030, -450, 0), 
					new Point3f(-500, -450, 0),
					new Point3f(1030, 30, 0),
					new int[]{34,124},new int[]{139,252},new int[]{0,34});

		tr2.drawTriangle(g);
	}
	
	
	//draw the shape of the body of house by using triangle to achieve the color interpolation 
	public static void drawHousebody(Graphics g) {
		// draw the shape of the front face of house
		//227 23 13

		ParametricTriangle tr1 = new ParametricTriangle(
				new Point3f(0, 0, 0), 
				new Point3f(0,200, 0),
				new Point3f(200, 0, 0),
				new int[]{227,255},new int[]{0,23},new int[]{0,13}) ;
		tr1.drawTriangle(g);
		
		ParametricTriangle tr2 = new ParametricTriangle(
				new Point3f(200, 200, 0), 
				new Point3f(0,200, 0),
				new Point3f(200, 0, 0),
				new int[]{227,255},new int[]{0,23},new int[]{0,13});

		tr2.drawTriangle(g);
		
		// draw the shape of the side face of house
		ParametricTriangle tr3 = new ParametricTriangle(
				new Point3f(260, 230, 0),
				new Point3f(200,200, 0),
				new Point3f(200, 0, 0), 
				new int[]{128,178},new int[]{34,42},new int[]{34,42});

		tr3.drawTriangle(g);
		
		ParametricTriangle tr4 = new ParametricTriangle(
				new Point3f(260, 230, 0),
				new Point3f(260,30, 0),
				new Point3f(200, 0, 0), 
				new int[]{128,178},new int[]{34,42},new int[]{34,42});

		tr4.drawTriangle(g);
		
	}
	
	//use the triangles to draw  the roof of the house by using triangle to achieve the color interpolation 
	public static void drawHouseRoof(Graphics g) {
		ParametricTriangle tr1 = new ParametricTriangle(
				new Point3f(100, 280, 0),
				new Point3f(0, 200, 0), 
				new Point3f(200,200, 0),
				new int[]{210,240},new int[]{164,180},new int[]{96,140}
				);
		tr1.drawTriangle(g);
		
		ParametricTriangle tr2 = new ParametricTriangle(
				new Point3f(100, 280, 0), 
				new Point3f(260, 230, 0),
				new Point3f(200,200, 0),
				new int[]{139,160},new int[]{69,82},new int[]{19,45});
		tr2.drawTriangle(g);
			
			
	}
	
	//draw the window by using triangle to achieve the color interpolation 
	public static void drawWindow(Graphics g) {
		ParametricTriangle tr1 = new ParametricTriangle(
				new Point3f(20, 100, 0), 
				new Point3f(20, 150, 0),
				new Point3f(70, 100, 0),
				new int[]{136,255},new int[]{206,255},new int[]{235,255});

		tr1.drawTriangle(g);
		
		ParametricTriangle tr2 = new ParametricTriangle(
				new Point3f(70, 150, 0), 
				new Point3f(20, 150, 0),
				new Point3f(70, 100, 0),
				new int[]{136,255},new int[]{206,255},new int[]{235,255});

		tr2.drawTriangle(g);
		
		g.setColor(new Color(72,209,204));
		ParametricLine p1=new ParametricLine(new Point3f(45,100,0),new Point3f(45,150,0));
		p1.drawLine(g);
		ParametricLine p2=new ParametricLine(new Point3f(20,125,0),new Point3f(70,125,0));
		p2.drawLine(g);
		
		
		ParametricTriangle tr3 = new ParametricTriangle(
				new Point3f(130, 100, 0), 
				new Point3f(130, 150, 0),
				new Point3f(180, 150, 0),
				new int[]{136,255},new int[]{206,255},new int[]{235,255});

		tr3.drawTriangle(g);
		
		
		ParametricTriangle tr4 = new ParametricTriangle(
				new Point3f(130, 100, 0), 
				new Point3f(180, 100, 0),
				new Point3f(180, 150, 0),
				new int[]{136,255},new int[]{206,255},new int[]{235,255});

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
				new Point3f(120, 75, 0),
				new int[]{128,210},new int[]{42,105},new int[]{30,42});

		tr1.drawTriangle(g);
		
		ParametricTriangle tr2 = new ParametricTriangle(
				new Point3f(80 ,0, 0), 
				new Point3f(120, 0 , 0),
				new Point3f(120, 75, 0),
				new int[]{128,210},new int[]{42,105},new int[]{30,42});

		tr2.drawTriangle(g);
		
		g.setColor(Color.white);
		ParametricLine p4=new ParametricLine(new Point3f(100,0,0),new Point3f(100,75,0));
		p4.drawLine(g);
		
	}
	
	//use line to draw the tips of house
	public static void drawTips(Graphics g) {
		ParametricTriangle tr5 = new ParametricTriangle(
				new Point3f(-80, -70, 0), 
				new Point3f(-60,-70,0),
				new Point3f(-60, -50, 0),
				new int[]{128, 192},new int[]{138, 199},new int[]{135,192});

		tr5.drawTriangle(g);
		
		ParametricTriangle tr6 = new ParametricTriangle(
				new Point3f(-60, -50, 0), 
				new Point3f(-60,-70,0),
				new Point3f(-40, -50, 0),
				new int[]{128, 192},new int[]{138, 199},new int[]{135,192});

		tr6.drawTriangle(g);
		
		ParametricTriangle tr7 = new ParametricTriangle(
				new Point3f(-80, -50, 0), 
				new Point3f(-20, -50, 0),
				new Point3f(-75, -45, 0),
				new int[]{128, 192},new int[]{138, 199},new int[]{135,192});

		tr7.drawTriangle(g);
		

		ParametricTriangle tr8 = new ParametricTriangle(
				new Point3f(-75, -45, 0), 
				new Point3f(-20, -50,0),
				new Point3f(-10, -45, 0),
				new int[]{128, 192},new int[]{138, 199},new int[]{135,192});

		tr8.drawTriangle(g);
		
		ParametricTriangle tr1 = new ParametricTriangle(
				new Point3f(-130, 0, 0), 
				new Point3f(-130, 20, 0),
				new Point3f(-20, 20, 0),
				new int[]{210,255},new int[]{180,255},new int[]{140,255});

		tr1.drawTriangle(g);
		
		ParametricTriangle tr2 = new ParametricTriangle(
				new Point3f(-130, 0, 0), 
				new Point3f(-20,0,0),
				new Point3f(-20, 20, 0),
				new int[]{210,255},new int[]{180,255},new int[]{140,255});
		tr2.drawTriangle(g);
		
		ParametricTriangle tr3 = new ParametricTriangle(
				new Point3f(-80, 0, 0), 
				new Point3f(-60, 0, 0),
				new Point3f(-60, -70, 0),
				new int[]{210,255},new int[]{180,255},new int[]{140,255});

		tr3.drawTriangle(g);
		
		ParametricTriangle tr4 = new ParametricTriangle(
				new Point3f(-80, 0, 0), 
				new Point3f(-80,-70,0),
				new Point3f(-60, -70, 0),
				new int[]{210,255},new int[]{180,255},new int[]{140,255});

		tr4.drawTriangle(g);

		
		g.setColor(Color.black);
		g.drawString("Pencil House", 400, 495);	
		
		
		
	}
	
	
	private static void drawSecondHouseBody(Graphics g) {
		//draw the front face of the second house
		ParametricTriangle tr1 = new ParametricTriangle(
				new Point3f(200, 0, 0), 
				new Point3f(200, 400, 0),
				new Point3f(400, 0, 0),
				new int[]{227,255},new int[]{0,23},new int[]{0,13}) ;
		tr1.drawTriangle(g);
		
		ParametricTriangle tr2 = new ParametricTriangle(
				new Point3f(400, 400, 0), 
				new Point3f(200, 400, 0),
				new Point3f(400, 0, 0),
				new int[]{227,255},new int[]{0,23},new int[]{0,13});

		tr2.drawTriangle(g);
		
		// draw the side face of the second house
		ParametricTriangle tr3 = new ParametricTriangle(
				new Point3f(400, 0, 0),
				new Point3f(460, 30, 0),
				new Point3f(400, 400, 0), 
				new int[]{128,178},new int[]{34,42},new int[]{34,42});

		tr3.drawTriangle(g);
		
		ParametricTriangle tr4 = new ParametricTriangle(
				new Point3f(460, 430, 0),
				new Point3f(460, 30, 0),
				new Point3f(400, 400, 0), 
				new int[]{128,178},new int[]{34,42},new int[]{34,42});

		tr4.drawTriangle(g);
		
	}
	
	public static void drawSecondHouseRoof(Graphics g) {
		ParametricTriangle tr1 = new ParametricTriangle(
				new Point3f(300, 480, 0),
				new Point3f(200, 400, 0), 
				new Point3f(400, 400, 0),
				new int[]{210,240},new int[]{164,180},new int[]{96,140}
				);
		tr1.drawTriangle(g);
		
		ParametricTriangle tr2 = new ParametricTriangle(
				new Point3f(300, 480, 0), 
				new Point3f(460, 430, 0),
				new Point3f(400, 400, 0),
				new int[]{139,160},new int[]{69,82},new int[]{19,45});
		tr2.drawTriangle(g);
	}

	public static void drawSecondHouseWindow(Graphics g) {
		ParametricTriangle tr1 = new ParametricTriangle(
				new Point3f(220, 300, 0), 
				new Point3f(220, 350, 0),
				new Point3f(270, 300, 0),
				new int[]{136,255},new int[]{206,255},new int[]{235,255});

		tr1.drawTriangle(g);
		
		ParametricTriangle tr2 = new ParametricTriangle(
				new Point3f(270, 350, 0), 
				new Point3f(220, 350, 0),
				new Point3f(270, 300, 0),
				new int[]{136,255},new int[]{206,255},new int[]{235,255});

		tr2.drawTriangle(g);
		
		g.setColor(new Color(72,209,204));
		ParametricLine p1=new ParametricLine(new Point3f(245,300,0),new Point3f(245,350,0));
		p1.drawLine(g);
		ParametricLine p2=new ParametricLine(new Point3f(220,325,0),new Point3f(270,325,0));
		p2.drawLine(g);
		
		
		ParametricTriangle tr3 = new ParametricTriangle(
				new Point3f(330, 300, 0), 
				new Point3f(330, 350, 0),
				new Point3f(380, 350, 0),
				new int[]{136,255},new int[]{206,255},new int[]{235,255});

		tr3.drawTriangle(g);
		
		
		ParametricTriangle tr4 = new ParametricTriangle(
				new Point3f(330, 300, 0), 
				new Point3f(380, 300, 0),
				new Point3f(380, 350, 0),
				new int[]{136,255},new int[]{206,255},new int[]{235,255});

		tr4.drawTriangle(g);
		
		g.setColor(new Color(72,209,204));
		ParametricLine p3=new ParametricLine(new Point3f(355,300,0),new Point3f(355,350,0));
		p3.drawLine(g);
		ParametricLine p4=new ParametricLine(new Point3f(330,325,0),new Point3f(380,325,0));
		p4.drawLine(g);
		
		
		ParametricTriangle tr5 = new ParametricTriangle(
				new Point3f(220, 100, 0), 
				new Point3f(220, 150, 0),
				new Point3f(270, 100, 0),
				new int[]{136,255},new int[]{206,255},new int[]{235,255});

		tr5.drawTriangle(g);
		
		ParametricTriangle tr6 = new ParametricTriangle(
				new Point3f(270, 150, 0), 
				new Point3f(220, 150, 0),
				new Point3f(270, 100, 0),
				new int[]{136,255},new int[]{206,255},new int[]{235,255});

		tr6.drawTriangle(g);
		
		g.setColor(new Color(72,209,204));
		ParametricLine p5=new ParametricLine(new Point3f(245,100,0),new Point3f(245,150,0));
		p5.drawLine(g);
		ParametricLine p6=new ParametricLine(new Point3f(220,125,0),new Point3f(270,125,0));
		p6.drawLine(g);
		
		
		ParametricTriangle tr7 = new ParametricTriangle(
				new Point3f(330, 100, 0), 
				new Point3f(330, 150, 0),
				new Point3f(380, 150, 0),
				new int[]{136,255},new int[]{206,255},new int[]{235,255});

		tr7.drawTriangle(g);
		
		
		ParametricTriangle tr8 = new ParametricTriangle(
				new Point3f(330, 100, 0), 
				new Point3f(380, 100, 0),
				new Point3f(380, 150, 0),
				new int[]{136,255},new int[]{206,255},new int[]{235,255});

		tr8.drawTriangle(g);
		
		g.setColor(new Color(72,209,204));
		ParametricLine p7=new ParametricLine(new Point3f(355,100,0),new Point3f(355,150,0));
		p7.drawLine(g);
		ParametricLine p8=new ParametricLine(new Point3f(330,125,0),new Point3f(380,125,0));
		p8.drawLine(g);
	}
	
	public static void drawSecondHouseDoor(Graphics g) {
		ParametricTriangle tr1 = new ParametricTriangle(
				new Point3f(280, 0, 0), 
				new Point3f(280, 75, 0),
				new Point3f(320, 75, 0),
				new int[]{128,210},new int[]{42,105},new int[]{30,42});

		tr1.drawTriangle(g);
		
		ParametricTriangle tr2 = new ParametricTriangle(
				new Point3f(280 ,0, 0), 
				new Point3f(320, 0 , 0),
				new Point3f(320, 75, 0),
				new int[]{128,210},new int[]{42,105},new int[]{30,42});

		tr2.drawTriangle(g);
		
		g.setColor(Color.white);
		ParametricLine p4=new ParametricLine(new Point3f(300,0,0),new Point3f(300,75,0));
		p4.drawLine(g);
	}
	
	
	public static void drawHouseShadow(Graphics g) {
		//46 139 87
		
		ParametricTriangle tr1 = new ParametricTriangle(
				new Point3f(400, 0, 0), 
				new Point3f(460, 30, 0),
				new Point3f(800, 0, 0),
				new int[]{0,46},new int[]{0,139},new int[]{0,87});

		tr1.drawTriangle(g);
		
		ParametricTriangle tr2 = new ParametricTriangle(
				new Point3f(860 ,30, 0), 
				new Point3f(460, 30 , 0),
				new Point3f(800, 0, 0),
				new int[]{0,46},new int[]{0,139},new int[]{0,87});

		tr2.drawTriangle(g);
	}
}
