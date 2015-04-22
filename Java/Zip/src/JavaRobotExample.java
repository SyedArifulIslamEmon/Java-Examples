
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.util.Scanner;

public class JavaRobotExample
{
Robot robot = new Robot();
Scanner scanner;
public static void main(String[] args) throws AWTException
{
new JavaRobotExample();
}

public JavaRobotExample() throws AWTException
{

scanner = new Scanner(System.in);

String get;

System.out.print("\nEnter Program Name to Run In Your Computer... :- ");
get = scanner.next();

robot.setAutoDelay(50);
robot.setAutoWaitForIdle(true);

robot.delay(100);
robot.keyPress(KeyEvent.VK_WINDOWS);
robot.delay(500);
type("R");
robot.delay(500);
robot.keyRelease(KeyEvent.VK_WINDOWS);

robot.delay(500);
type(get);
robot.delay(1000);
type(KeyEvent.VK_ENTER);

robot.delay(5000);

type("!!......................HELLO EVERY ONE ...................!!");

type(KeyEvent.VK_ENTER);
robot.delay(50);
type(KeyEvent.VK_ENTER);

robot.delay(100);
type("MY NANE IS SUDIP ...!!!");
type(KeyEvent.VK_ENTER);
type(KeyEvent.VK_ENTER);

robot.delay(500);
type("CREAT BY SUDIP SARKER");
type(KeyEvent.VK_ENTER);
type(KeyEvent.VK_ENTER);
robot.delay(100);

type("- FUCKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKK");
type(KeyEvent.VK_ENTER);
type(KeyEvent.VK_ENTER);

robot.delay(100);
type("Contact No.- 88 66 22 45 46");
type(KeyEvent.VK_ENTER);
type(KeyEvent.VK_ENTER);
type("THANK YOU..!!!");

robot.delay(500);
robot.keyPress(KeyEvent.VK_CONTROL);

type("s");
robot.keyRelease(KeyEvent.VK_CONTROL);

robot.delay(1000);
type("pratik");
robot.delay(500);
type(KeyEvent.VK_ENTER);

robot.delay(1000);
type("y");        
robot.delay(1000);

robot.delay(1000);
type(KeyEvent.VK_ALT);
robot.delay(1000);
type("f");
robot.delay(1000);
type("x");

type("n");
System.exit(0);
}

private void type(int i)
{
robot.delay(50);
robot.keyPress(i);
robot.keyRelease(i);
}

private void type(String s)
{
byte[] bytes = s.getBytes();
for (byte b : bytes)
{
int code = b;
// keycode only handles [A-Z] (which is ASCII decimal [65-90])
if (code > 96 && code < 123) code = code - 32;
robot.delay(40);
robot.keyPress(code);
robot.keyRelease(code);
}
}
}


