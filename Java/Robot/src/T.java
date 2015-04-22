import java.awt.AWTException;
import java.awt.MouseInfo;
import java.awt.Point;
import java.awt.PointerInfo;
import java.awt.Robot;


public class T {

	public static void main(String[] args) throws AWTException {
		// TODO Auto-generated method stub


PointerInfo a = MouseInfo.getPointerInfo();
Point b = a.getLocation();
int x = (int) b.getX();
int y = (int) b.getY();
System.out.print(y + "jjjjjjjjj");
System.out.print(x);
Robot r = new Robot();
r.mouseMove(x, y - 50);


	}

}
