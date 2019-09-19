package GraphicsObjects;

public class Point3f {
	
	/*
	 * Author:Leif
	 * Date:2019/09/17
	 * BJUT Number:17372323
	 * UCD Number:17205995
	 * 
	 * */
	
	
	public float x;
	/*x-axis*/
	public float y;
	/*y-axis*/
	public float z;
	/*z-axis*/
	
	
	// default constructor
	public Point3f() { 
		x = 0.0f;
		y = 0.0f;
		z = 0.0f;
	}
	
	//initializing constructor
	public Point3f(float x, float y, float z) { 
		this.x = x;
		this.y = y;
		this.z = z;
	}
	
	// sometimes for different algorithms we will need to address the point using positions 0 1 2
	//
	public float getPostion(int postion)
	{
		switch(postion)
		{
		case 0: return x;
		case 1: return y;
		case 2: return z; 
		default: return Float.NaN;  
		} 
	}
	
	public String toString()
	{
		return ("(" + x +"," + y +"," + z +")");
    }


	
	/*
	 * Goal:
	 * 	let this point add another vector and change its position
	 * Mechanisms: 
	 * 	use its x-position plus Additonal's x-position; 
	 * 	use its y-position plus Additonal's y-position;
	 * 	use its z-position plus Additonal's z-position; 
	 * */			
	public Point3f PlusVector(Vector3f Additonal) {
		this.x=this.x+Additonal.x;
		this.y=this.y+Additonal.y;
		this.z=this.z+Additonal.z;
		
		return this; 
	} 
	
	/*
	 * Goal:
	 * 	let this point minus another vector and change its position
	 * Mechanism:
	 * 	use its x-position minus Minus's x-position
	 * 	use its y-position minus Minus's y-position
	 * 	use its z-position minus Minus's z-position
	 * */ 
	public Point3f MinusVector(Vector3f Minus) { 
		this.x=this.x-Minus.x;
		this.y=this.y-Minus.y;
		this.z=this.z-Minus.z;
		
		return this;
	}
	
	
	/*
	 * Goal:
	 * 	let this point minus another point and get one vector
	 * Mechanism:
	 * 	use its x-position minus Minus's x-position---->X0
	 * 	use its y-position minus Minus's y-position---->y0
	 * 	use its z-position minus Minus's z-position---->z0
	 * 	use (x0,y0,z0) as a new vector
	 * */
	public Vector3f MinusPoint(Point3f Minus) { 
		Vector3f v=new Vector3f(this.x-Minus.x,this.y-Minus.y,this.z-Minus.z);
		return v;
	}
	
}

/*................................................................................
................................................................................
................................................................................
................................................................................
................................................................................
................................................................................
................................................................................
................................................................................
................................................................................
....................................=?7777+.....................................
.............................,8MMMMMMMMMMMMMMMMM7...............................
...........................$MMMMMMMMMMMMMMMMMMMMMM7.............................
........................IMMMMMMMMMMMMMMMMMMMMMMMMMMMM?..........................
......................?MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMN........................
.....................MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM$......................
...................ZMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM.....................
..................MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM8....................
.................NMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM...................
................IMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM..................
................MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM$.................
...............=MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMZ................
..............:MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM................
..............7MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM:...............
..............DMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMZ...............
..............MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM8...............
..............MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMN...............
..............NMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMO...............
..............$MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMI...............
..............+MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM=...............
...............8MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM................
................MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM8................
................MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMN,................
................=MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM..................
.................MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMZ..................
..................MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMD...................
...................?MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM.....................
....................8MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM......................
.....................,8MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM,.......................
........................NMMMMMMMMMMMMMMMMMMMMMMMMMMMMN?.........................
..........................NMMMMMMMMMMMMMMMMMMMMMMMMMI...........................
.............................$MMMMMMMMMMMMMMMMMMM?..............................
.................................,I$NMMMMMN$?...................................
................................................................................
................................................................................
................................................................................
.......................................................................*/
