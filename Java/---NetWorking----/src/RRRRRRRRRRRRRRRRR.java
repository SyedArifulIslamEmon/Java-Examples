
public class RRRRRRRRRRRRRRRRR {
	public JavaRobotExample() throws AWTException, IOException {
		Robot r = new Robot();
		Runtime.getRuntime().exec("notepad");
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
		robot.delay(10000);
		robot.mouseMove(901,110);

		robot.delay(2000);

		robot.mousePress(InputEvent.BUTTON1_MASK);
		
		robot.delay(2000);

		
		robot.keyPress(KeyEvent.VK_CONTROL);

		robot.keyPress(KeyEvent.VK_A);
		robot.delay(2000);


		robot.keyPress(KeyEvent.VK_DELETE);
		robot.delay(1000);
		robot.keyPress(KeyEvent.VK_CONTROL);

		robot.keyPress(KeyEvent.VK_A);
		robot.delay(2000);
		robot.keyPress(KeyEvent.VK_DELETE);
		robot.delay(2000);
		robot.keyPress(KeyEvent.VK_CONTROL);

		robot.keyPress(KeyEvent.VK_A);
		robot.delay(2000);
		robot.keyPress(KeyEvent.VK_DELETE);
		robot.delay(2000);
		robot.mousePress(InputEvent.BUTTON1_MASK);
		robot.delay(1000);
		robot.mousePress(InputEvent.BUTTON1_MASK);
		//This delay keeps the button pressed for 2 seconds
		robot.delay(2000);

		robot.mouseRelease(InputEvent.BUTTON1_MASK);

		
		type("Sudipgmail.com");

}
