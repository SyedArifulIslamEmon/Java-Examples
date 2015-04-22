

import java.awt.AWTException;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.io.IOException;
 
public class S {
 
public static void main(String[] args) throws IOException { 

try {
	Robot robot = new Robot();
	Toolkit toolkit = Toolkit.getDefaultToolkit();
	Dimension dimension = toolkit.getScreenSize();
	Rectangle ra=Rectangle.intersect(0, dimension.height, dimension.width);
} catch (AWTException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}


}
}
