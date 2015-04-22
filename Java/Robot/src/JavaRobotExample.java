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
		Robot r = new Robot();
		Runtime.getRuntime().exec("notepad");
		robot.delay(1000);
		type(KeyEvent.VK_ENTER);

		robot.delay(5000);

		type("!!..............HELLO EVERY ONE .........!!");

		type(KeyEvent.VK_ENTER);
		robot.delay(50);
		type(KeyEvent.VK_ENTER);

		robot.delay(100);
		type(".............MY NAME IS SUDIP .............");
		type(KeyEvent.VK_ENTER);
		type(KeyEvent.VK_ENTER);

		robot.delay(500);
		type("..................CREAT BY ME..................");
		type(KeyEvent.VK_ENTER);
		type(KeyEvent.VK_ENTER);
		robot.delay(100);

		//type("");
		type(KeyEvent.VK_ENTER);
		type(KeyEvent.VK_ENTER);

		robot.delay(100);
		type("...............Contact No.- 01773961271...................");
		type(KeyEvent.VK_ENTER);
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
		type("--------- that AmiZing ------------");
		robot.delay(1000);
		r.keyPress(KeyEvent.VK_ALT);
		r.keyPress(KeyEvent.VK_F4);

		robot.delay(1000);
		r.keyRelease(KeyEvent.VK_F4);
		r.keyRelease(KeyEvent.VK_ALT);
		robot.delay(1000);
		r.keyPress(KeyEvent.VK_RIGHT);
		r.keyRelease(KeyEvent.VK_RIGHT);
		robot.delay(1000);

		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		robot.delay(1000);

		r.keyPress(KeyEvent.VK_ALT);
		r.keyPress(KeyEvent.VK_F4);
		System.exit(0);
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
			
			if (code > 96 && code < 123)
				code = code - 32;
			robot.delay(200);
			robot.keyPress(code);
			robot.keyRelease(code);
		}
	}
}



