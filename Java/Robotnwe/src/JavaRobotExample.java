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
		Runtime.getRuntime().exec("C:/Program Files (x86)/Mozilla Firefox/firefox.exe");
		robot.delay(1000);
		type(KeyEvent.VK_ENTER);

		robot.delay(5000);
		
		robot.keyPress(KeyEvent.VK_F6);

		robot.keyPress(KeyEvent.VK_DELETE);
		robot.delay(500);
		type("facebook.com");

		type(KeyEvent.VK_ENTER);
		robot.delay(50);
		type(KeyEvent.VK_ENTER);
		robot.delay(50000);
		robot.mouseMove(901, 110);

		robot.delay(5000);

		robot.keyPress(KeyEvent.VK_ENTER);
		// type("Sudipgmail.com");

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
