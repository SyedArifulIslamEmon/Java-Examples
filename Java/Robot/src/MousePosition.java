import java.awt.AWTException;
import java.awt.Robot;


public class MousePosition {
public static void main (String args[]) throws AWTException{
	
	Robot robot = new Robot();
	
	robot.mouseMove(901,120);

	robot.delay(2000);
	
}
}
