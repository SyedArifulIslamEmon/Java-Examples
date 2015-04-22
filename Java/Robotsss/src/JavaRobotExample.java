
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.util.Scanner;

public class JavaRobotExample {
	Robot robot = new Robot();
	Scanner scanner;

	public static void main(String[] args) throws AWTException, IOException {
		new JavaRobotExample();
	}

	public JavaRobotExample() throws AWTException, IOException {
		
		
		Runtime.getRuntime().exec("C:/Program Files (x86)/Mozilla Firefox/firefox.exe");
		robot.delay(1000);
		type(KeyEvent.VK_ENTER);

		robot.delay(5000);
		
		robot.keyPress(KeyEvent.VK_F6);

		robot.keyPress(KeyEvent.VK_DELETE);
		robot.delay(500);
		type("facebook.com");

		type(KeyEvent.VK_ENTER);
	//	robot.delay(500);
		//type(KeyEvent.VK_ENTER);
		

		robot.delay(20000);

		robot.keyPress(KeyEvent.VK_ENTER);
		// type("Sudipgmail.com");
		robot.delay(15000);
		Runtime.getRuntime().exec("notepad");
		robot.delay(1000);
		type(KeyEvent.VK_ENTER);

		robot.delay(3000);

		type("!!..............HELLO EVERY ONE .........!!");

		type(KeyEvent.VK_ENTER);
		robot.delay(50);
		type(KeyEvent.VK_ENTER);

		robot.delay(100);
		type(".............MY NANE IS SUDIP .............");
		type(KeyEvent.VK_ENTER);
		robot.delay(50);
		type(KeyEvent.VK_ENTER);

		robot.delay(500);
		type("..................I creat automatic open firefox, facebook.com type,go facebook page, logn in ,");
		type(KeyEvent.VK_ENTER);
		robot.delay(50);
		type(KeyEvent.VK_ENTER);
		type("open notepad and typing automatic,save file ,creat new file,type and don,t save .....");
		type(KeyEvent.VK_ENTER);
		robot.delay(50);
		type(KeyEvent.VK_ENTER);
		robot.delay(500);

		//type("");
//		type(KeyEvent.VK_ENTER);
//		type(KeyEvent.VK_ENTER);

		//robot.delay(100);
		type("...............Contact No.- 01773961271...................");
		type(KeyEvent.VK_ENTER);
		robot.delay(50);
		type(KeyEvent.VK_ENTER);
		type("..................THANK YOU................");

		robot.delay(500);
		robot.keyPress(KeyEvent.VK_CONTROL);

		type("s");
		robot.keyRelease(KeyEvent.VK_CONTROL);

		robot.delay(1000);
		type("SUDIP");
		robot.delay(500);
		type(KeyEvent.VK_ENTER);

		robot.delay(1000);

		robot.delay(1000);
		type(KeyEvent.VK_ALT);
		robot.delay(1000);
		type("f");
		robot.delay(1000);
		type("n");
		type("--------- that Amiging ------------");
		robot.delay(1000);
		robot.keyPress(KeyEvent.VK_ALT);
		robot.keyPress(KeyEvent.VK_F4);

		robot.delay(1000);
		robot.keyRelease(KeyEvent.VK_F4);
		robot.keyRelease(KeyEvent.VK_ALT);
		robot.delay(1000);
		robot.keyPress(KeyEvent.VK_RIGHT);
		robot.keyRelease(KeyEvent.VK_RIGHT);
		robot.delay(1000);

		robot.keyPress(KeyEvent.VK_ENTER);
		robot.delay(50);
		robot.keyRelease(KeyEvent.VK_ENTER);
		robot.delay(1000);

		robot.keyPress(KeyEvent.VK_ALT);
		robot.keyPress(KeyEvent.VK_F4);
		robot.delay(1000);

		robot.keyPress(KeyEvent.VK_ALT);
		robot.keyPress(KeyEvent.VK_F4);
		
	}

	private void type(int i) {
		robot.delay(50);
		robot.keyPress(i);
		robot.keyRelease(i);
	}

	private void type(String s) {
		byte[] bytes = s.getBytes();
		for (byte b : bytes) {
			int code = b;
			// keycode only handles [A-Z] (which is ASCII decimal [65-90])
			if (code > 96 && code < 123)
				code = code - 32;
			robot.delay(200);
			robot.keyPress(code);
			robot.keyRelease(code);
		}
	}
}
