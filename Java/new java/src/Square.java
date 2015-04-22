
	class Circle extends Shape{
	
		private double radius=1.0;
		
		public Circle(){
			
 }
		public Circle(double radius){
			this.radius=radius;
 }
		public Circle(double radius,String color,boolean filled){
			super( color,filled);
			this.radius=radius;
 }
		
		public double getRadius(){
			return radius;
 }
		
		public void setRadius(double radius){
			this.radius=radius;
 }
		public double getArea(){
			return radius*radius*Math.PI;
			
 }
		
		public double getPerimeter(){
			return 2*Math.PI*radius;
			
 }
		public String toString(){
			
			return "Circle[radius="+radius+",color="+",filled="+"]";
 }
 }
	
	   class Rectangle extends Shape{
	   
		   private double width=1.0;
		   private double length=1.0;
	   
	   public Rectangle(){
		   
 }
	   Rectangle(String color,boolean filled){
		   
		   super(color,filled);
	   }
	   public Rectangle(double width,double length){
		   this.width=width;
		   this.length=length;
		   
 }
	   public Rectangle(double width,double length,String color,boolean filled){
		   super( color,filled);
		   this.width=width;
		   this.length=length;
		   
 }
	    public double getWidth(){
	    	return width;
 }
	    
	    public void setWidth(double width){
	    	this.width=width;
 } 
	    public double getLength(){
	    	return length;
 }
	    public void setLength(double length){
	    	 this.length=length;
	    	
 }
	   public double getArea(){
		   return width*length;
	   
 }
	   public double getPerimeter(){
		   return 2*(width+length);
 }
	   public String toString(){
			
			return " Rectangle[width="+width+",length="+",color="+",filled="+"]";
 }
 }
	
	   class Square extends Rectangle{
		   private double side;
		   public Square(){
			   
		   }
		   public Square(double side){
			 this.side=side;
		    
		   }
		   public Square(double side,String color, boolean filled){
			   super(color,filled);
			    
			   this.side=side;
			  
		   }
		   
		   public double getSide(){
			   return side;
			   
		   }
		   
		   public void setSide(double side){
			   this.side=side;
		   }
		   
		   public void setWidth(double side){
			   this.side=side;
		   }
		   public void setLength(double side){
			   this.side=side;
		   }
		   public String toString(){
				
				return " Square[side="+side+",width="+",length="+",color="+",filled="+"]";
	 }
		   
		   public  static void main(String[]arg){
			   
			   Circle c1 = new Circle();
			   System.out.println("Circle:\n" + "\tradius=" + c1.getRadius()
						+ "\tColor=" + c1.getColor() + "\tCircle's area=" + c1.getArea()
						+"\tCircle's Perimeter="+c1.getPerimeter()+"\tFilled=" +c1.isFilled());

			  Circle c2 = new Circle(10,"red",true);
			  System.out.println("\nCircle:\n" + "\tradius=" + c2.getRadius()
						+ "\tColor=" + c2.getColor() + "\tCircle's area=" + c2.getArea()
						+"\tCircle's Perimeter="+c1.getPerimeter()+"\tFilled= "+c1.isFilled());

			  Rectangle r1 = new Rectangle();
			  System.out.println("\nRectangle:\n" + "\twidth=" + r1.getWidth()+"\tLength="+r1.getLength()
						+ "\tColor=" + r1.getColor() + "\tRectangle's area=" + r1.getArea()
						+"\tRectangle's Perimeter="+r1.getPerimeter()+"\tFilled=" +r1.isFilled());
			  Rectangle r2 = new Rectangle(20,30);
			  System.out.println("\nRectangle:\n" + "\twidth=" + r2.getWidth()+"\tLength="+r2.getLength()
						+ "\tColor=" + r2.getColor() + "\tRectangle's area=" + r2.getArea()
						+"\tRectangle's Perimeter="+r2.getPerimeter()+"\tFilled=" +r2.isFilled());
			  Rectangle r3 = new Rectangle(10,25,"red",true);
			  System.out.println("\nRectangle:\n" + "\twidth=" + r3.getWidth()+"\tLength="+r3.getLength()
						+ "\tColor=" + r3.getColor() + "\tRectangle's area=" + r3.getArea()
						+"\tRectangle's Perimeter="+r3.getPerimeter()+"\tFilled=" +r3.isFilled());
			  
			  Square s1 = new Square(50);
			  System.out.println("\nSquare:\n" + "\tSide=" + s1.getSide()+ "\tColor=" + s1.getColor() 
					+"\tFilled=" +s1.isFilled());
			  Square s2 = new Square(100,"red",true);
			  System.out.println("\nSquare:\n" + "\tSide=" + s2.getSide()+ "\tColor=" + s2.getColor() 
						+"\tFilled=" +s2.isFilled());
			  
			  
		   }
	   }
	
	
	
	
	
	
	