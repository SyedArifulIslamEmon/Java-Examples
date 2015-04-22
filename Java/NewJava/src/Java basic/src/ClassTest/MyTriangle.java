/*A getPerimeter() method that returns the length of the perimeter in double.
 You should use the distance() method of MyPoint to compute the perimeter.*/
/*A method printType(), which prints "equilateral" if all the three sides are equal, "isosceles"
 *  if any two of the three sides are equal, or "scalene" if the three sides are different.
 */

package ClassTest;

public class MyTriangle {
	MyPoint v1;
	MyPoint v2;
	MyPoint v3;

	public MyTriangle(int x1, int y1, int x2, int y2, int x3, int y3) {
		v1 = new MyPoint(x1, y1);
		v2 = new MyPoint(x2, y2);
		v3 = new MyPoint(x3, y3);

	}

	public MyTriangle(MyPoint v1, MyPoint v2, MyPoint v3) {
		this.v1 = v1;
		this.v2 = v2;
		this.v3 = v3;

	}

	public String toString() {

		return "Tringle@ (" + v1.getX() + "," + v1.getY() + "),(" + v2.getX()
				+ "," + v2.getY() + "),(" + v3.getX() + "," + v3.getY() + ")";
	}

	public double getPerimeter() {
		return v1.distance(v1) + v2.distance(v2) + v3.distance(v3);

	}

	public void printType() {
		
		if(v1.distance(v1)==v2.distance(v2)&&v2.distance(v2)==v3.distance(v3)){
			
			System.out.println("equilateral");
			
		}
	else if(v1.distance(v1)==v2.distance(v2)||v2.distance(v2)==v3.distance(v3)||v3.distance(v3)==v1.distance(v1)){
        	System.out.println("isosceles");
        	
        }
	else{
		
		System.out.println("Scalene");
	}
        
	}

}
