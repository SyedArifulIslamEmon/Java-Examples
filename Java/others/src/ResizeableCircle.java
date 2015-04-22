
public class ResizeableCircle extends Circle implements Resizeble {

	public ResizeableCircle(double radius) {
		super(radius);
		
	}
	
	public void resize(int percent){
		
		radius=percent;
	}
	
	

}
