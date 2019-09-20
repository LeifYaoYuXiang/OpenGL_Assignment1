package GraphicsObjects;



public class Vector3f {
	/*
	 * Author:Leif
	 * Date:2019/09/19
	 * BJUT Number:17372323
	 * UCD Number:17205995
	 * 
	 * */
	
	public float x=0;
	public float y=0;
	public float z=0;
	
	public Vector3f() 
	{  
		x = 0.0f;
		y = 0.0f;
		z = 0.0f;
	}
	 
	public Vector3f(float x, float y, float z) 
	{ 
		this.x = x;
		this.y = y;
		this.z = z;
	}
	
	/*
	 * Goal:
	 * 	use this vector plus a new vector
	 * Mechanism:
	 * 	use this vector's x-position plus Additonal's x-position----->x0
	 * 	use this vector's y-position plus Additonal's y-position----->y0
	 * 	use this vector's z-position plus Additonal's z-position----->z0
	 * 	use (x0,y0,z0) as this new vector 
	 * */ 
	public Vector3f PlusVector(Vector3f Additonal) 
	{ 
		this.x=Additonal.x+this.x;
		this.y=Additonal.x+this.y;
		this.z=Additonal.z+this.z;
		return this;
	} 
	
	/*
	 * Goal:
	 * 	use this vector minus a new vector
	 * Mechanism:
	 * 	use this vector's x-position minus Minus's x-position------>x0
	 * 	use this vector's y-position minus Minus's y-position------>y0
	 * 	use this vector's z-position minus Minus's z-position------>z0
	 * 	use (x0,y0,z0) as this new vector
	 * */  
	public Vector3f MinusVector(Vector3f Minus) 
	{ 
		this.x=this.x-Minus.x;
		this.y=this.y-Minus.y;
		this.z=this.z-Minus.z;
		
		return this;
	}
	
	/*
	 * Goal:
	 * 	use this vector add another point to get a new point
	 * Mechanism:
	 * 	use this vector's x-position add Additonal's x-position----->x0
	 * 	use this vector's y-position add Additonal's y-position----->y0
	 * 	use this vector's z-position add Additonal's z-position----->z0
	 * 	use (x0,y0,z0) as a new point
	 * */  
	public Point3f PlusPoint(Point3f Additonal) 
	{ 
		Point3f p=new Point3f(this.x=Additonal.x+this.x,this.y=Additonal.x+this.y,this.z=Additonal.z+this.z);
		return p;
	} 
	
	
	/*
	 * Goal:
	 * 	magnify or narrow this vector in one certain scale
	 * Mechanism:
	 * 	use this vector's x-position to multiply one constant------>x0;
	 * 	use this vector's y-position to multiply one constant------>y0;
	 * 	use this vector's z-position to multiply one constant------>z0;
	 * 	use (x0,y0,z0) as a this vector
	 * */ 
	public Vector3f byScalar(float scale )
	{
		this.x=this.x*scale;
		this.y=this.y*scale;
		this.z=this.z*scale;
		
		return this;
	}
	
	/*
	 * Goal:
	 * 	change the direction of the vector
	 * Mechanism:
	 * 	let the x,y,z position to be opposite
	 * */ 
	public Vector3f  NegateVector()
	{
		 this.x=-this.x;
		 this.y=-this.y;
		 this.z=-this.z;
		 return this;
	}
	
	/*
	 * Goal:
	 * 	calculate the length of one vector
	 * Mechanism:
	 * 	calculate the following:
	 * 		Math.sqrt(x*x+y*y+z*z); whereas x,y,z stands for the position of the original vector
	 * */
	public float length()
	{
	   return (float) Math.sqrt(x*x+y*y+z*z);
	}
	
	/*
	 * Goal:
	 * 	Get a vector which in the same direction of the original vector, however whose length is 1
	 * Mechanism:
	 * 	Use the x,y,z position divide the length of the original vector
	 * */
	public Vector3f Normal()
	{
		if(this.length()!=0) {
			Vector3f v=new Vector3f();
			v.x=this.x/this.length()+this.x%this.length();
			v.y=this.y/this.length()+this.y%this.length();
			v.z=this.z/this.length()+this.z%this.length();
			 
			return v;
		}else {
			return null;
		}
		
	} 
	
	
	/*
	 * Goal:
	 * 	calculate the dot product of this vector and another vector
	 * Mechanism:
	 * 	calculate the following:
	 * 		this.x*v.x+this.y*v.y+this.z*v.z
	 * */
	public float dot(Vector3f v)
	{ 
	  return (this.x*v.x+this.y*v.y+this.z*v.z);
	}
	
	/*
	 * Goal:
	 * 	calculate the cross product of this vector and another product
	 * Mechanism:
	 * 	calculate the determinant of the following matrix
	 * 		|i        j       k  | 
	 * 		|this.x this.y this.z|
	 * 		|v.x     v.y     v.z |	
	 * */
	public Vector3f cross(Vector3f v)  
	{ 
		Vector3f crossV=new Vector3f();
		
		crossV.x=this.y*v.z-v.y*this.z;
		crossV.y=-(this.x*v.z-v.x*this.z);
		crossV.z=this.x*v.y-v.x*this.y;
		
		return crossV;
	}
 
}
	 
	   

/*

										MMMM                                        
										MMMMMM                                      
 										MM MMMM                                    
 										MMI  MMMM                                  
 										MMM    MMMM                                
 										MMM      MMMM                              
  										MM        MMMMM                           
  										MMM         MMMMM                         
  										MMM           OMMMM                       
   										MM             .MMMM                     
MMMMMMMMMMMMMMM                        MMM              .MMMM                   
MM   IMMMMMMMMMMMMMMMMMMMMMMMM         MMM                 MMMM                 
MM                  ~MMMMMMMMMMMMMMMMMMMMM                   MMMM               
MM                                  OMMMMM                     MMMMM            
MM                                                               MMMMM          
MM                                                                 MMMMM        
MM                                                                   ~MMMM      
MM                                                                     =MMMM    
MM                                                                        MMMM  
MM                                                                       MMMMMM 
MM                                                                     MMMMMMMM 
MM                                                                  :MMMMMMMM   
MM                                                                MMMMMMMMM     
MM                                                              MMMMMMMMM       
MM                             ,MMMMMMMMMM                    MMMMMMMMM         
MM              IMMMMMMMMMMMMMMMMMMMMMMMMM                  MMMMMMMM            
MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM               ZMMMMMMMM              
MMMMMMMMMMMMMMMMMMMMMMMMMMMMM          MM$             MMMMMMMMM                
MMMMMMMMMMMMMM                       MMM            MMMMMMMMM                  
  									MMM          MMMMMMMM                     
  									MM~       IMMMMMMMM                       
  									MM      DMMMMMMMM                         
 								MMM    MMMMMMMMM                           
 								MMD  MMMMMMMM                              
								MMM MMMMMMMM                                
								MMMMMMMMMM                                  
								MMMMMMMM                                    
  								MMMM                                      
  								MM                                        
                             GlassGiant.com */