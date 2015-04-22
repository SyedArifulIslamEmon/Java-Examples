
 import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
public class RobotExmple {
//Store Keystrokes in an array for the content in notepad
static int keyInputForNotepadContent[] = {KeyEvent.VK_J,KeyEvent.VK_A, KeyEvent.VK_V,KeyEvent.VK_A,KeyEvent.VK_J ,KeyEvent.VK_A,KeyEvent.VK_Z, KeyEvent.VK_Z,KeyEvent.VK_U,KeyEvent.VK_P};
//Store Keystrokes in an array to give name of the notepad
static int keyInputForNotepadName[] = {KeyEvent.VK_R,KeyEvent.VK_O, KeyEvent.VK_B,KeyEvent.VK_O, KeyEvent.VK_DECIMAL,KeyEvent.VK_T, KeyEvent.VK_X,KeyEvent.VK_T};
public static void main(String[] args) {
try { Robot robot = new Robot();
//Press keys Ctrl+Esc and then key R to open “run” program.
robot.keyPress(KeyEvent.VK_CONTROL);
robot.keyPress(KeyEvent.VK_ESCAPE);
robot.keyRelease(KeyEvent.VK_CONTROL);

	  	robot.keyRelease(KeyEvent.VK_ESCAPE);
	  	robot.keyPress(KeyEvent.VK_R);
//Type NOTEPAD in run program and press ENTER ket to open a notepad.
robot.keyPress(KeyEvent.VK_N);
robot.keyPress(KeyEvent.VK_O);
robot.keyPress(KeyEvent.VK_T);
robot.keyPress(KeyEvent.VK_E);
robot.keyPress(KeyEvent.VK_P);
robot.keyPress(KeyEvent.VK_A);
robot.keyPress(KeyEvent.VK_D);
robot.keyPress(KeyEvent.VK_ENTER);
robot.delay(1000);

// Creates the delay of 1 sec
//Press keys of characters to write on the notepad.

for (int i = 0; i < keyInputForNotepadContent.length; i++){ 
	robot.keyPress(keyInputForNotepadContent[i]);
	robot.delay(500);
}
robot.delay(1000);

// Press keys ALT+F+S to save the file

robot.keyPress(KeyEvent.VK_ALT); 
robot.keyPress(KeyEvent.VK_F);
robot.keyPress(KeyEvent.VK_S);
robot.keyRelease(KeyEvent.VK_ALT);
robot.delay(500);
//Press keys of characters to write the name of notepad.
for (int i = 0; i < keyInputForNotepadName.length; i++){
	robot.keyPress(keyInputForNotepadName[i]);
	robot.delay(500);
}
robot.keyPress(KeyEvent.VK_ENTER);
// Replace the file if it already exists. robot.keyPress(KeyEvent.VK_ALT); robot.keyPress(KeyEvent.VK_Y); robot.keyRelease(KeyEvent.VK_ALT);
}
catch (AWTException e) {
e.printStackTrace();
}
}
} 
