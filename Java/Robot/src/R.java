
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.io.IOException;
 
public class R {
 
public static void main(String[] args) throws IOException { 
try {
Robot robot = new Robot();
Runtime runtime = Runtime.getRuntime();
runtime.exec("C:/Program Files (x86)/Mozilla Firefox/firefox.exe");
robot.delay(10000);
robot.keyPress(KeyEvent.VK_F6);

robot.keyPress(KeyEvent.VK_DELETE);
robot.delay(1000);
robot.keyPress(KeyEvent.VK_F);
robot.delay(1000);
robot.keyPress(KeyEvent.VK_A);
robot.delay(1000);
robot.keyPress(KeyEvent.VK_C);
robot.delay(1000);
robot.keyPress(KeyEvent.VK_E);
robot.delay(1000);
robot.delay(70);
robot.keyPress(KeyEvent.VK_B);
robot.delay(1000);
robot.keyPress(KeyEvent.VK_O);
robot.delay(1000);
robot.keyPress(KeyEvent.VK_O);
robot.delay(1000);
robot.keyPress(KeyEvent.VK_K);
robot.delay(1000);
robot.keyPress(KeyEvent.VK_DECIMAL);
robot.delay(1000);
robot.keyPress(KeyEvent.VK_C);
robot.delay(1000);
robot.keyPress(KeyEvent.VK_O);
robot.delay(1000);
robot.keyPress(KeyEvent.VK_M);
robot.delay(1000);
robot.keyPress(KeyEvent.VK_ENTER);

robot.delay(10000);
robot.mouseMove(901,110);

robot.delay(2000);

robot.mousePress(InputEvent.BUTTON1_MASK);
robot.delay(1000);
robot.mousePress(InputEvent.BUTTON1_MASK);
//This delay keeps the button pressed for 2 seconds
robot.delay(2000);

robot.mouseRelease(InputEvent.BUTTON1_MASK);
robot.keyPress(KeyEvent.VK_CONTROL);

robot.keyPress(KeyEvent.VK_A);
robot.delay(2000);


robot.keyPress(KeyEvent.VK_DELETE);
robot.delay(1000);
robot.keyPress(KeyEvent.VK_S);
robot.delay(1000);
robot.keyPress(KeyEvent.VK_U);
robot.delay(1000);
robot.keyPress(KeyEvent.VK_SHIFT);
robot.keyPress(KeyEvent.VK_2);
robot.delay(1000);
robot.keyPress(KeyEvent.VK_E);
robot.delay(1000);
robot.keyPress(KeyEvent.VK_B);
robot.delay(1000);
robot.keyPress(KeyEvent.VK_O);
robot.delay(1000);
robot.keyPress(KeyEvent.VK_O);
robot.delay(1000);
robot.keyPress(KeyEvent.VK_K);
robot.delay(1000);
robot.keyPress(KeyEvent.VK_DECIMAL);
robot.delay(1000);
robot.keyPress(KeyEvent.VK_C);
robot.delay(1000);
robot.keyPress(KeyEvent.VK_O);
robot.delay(1000);
robot.keyPress(KeyEvent.VK_M);
robot.delay(1000);

robot.keyPress(KeyEvent.VK_ENTER);
} catch (AWTException e) {
	e.printStackTrace();
}
//Toolkit toolkit = Toolkit.getDefaultToolkit();
}
}
