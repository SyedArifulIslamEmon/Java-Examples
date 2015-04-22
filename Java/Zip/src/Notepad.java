
import java.awt.Robot;
import java.awt.event.KeyEvent;

public class Notepad {

    static int keyInput[] = { KeyEvent.VK_J, KeyEvent.VK_A, KeyEvent.VK_V,
            KeyEvent.VK_A, KeyEvent.VK_SPACE };
    static int keyInputForNotepadName[] = {KeyEvent.VK_R,KeyEvent.VK_O, KeyEvent.VK_B,KeyEvent.VK_O, KeyEvent.VK_DECIMAL,KeyEvent.VK_T, KeyEvent.VK_X,KeyEvent.VK_T};
    public static void main(String[] args) throws Exception {

        Runtime.getRuntime().exec("notepad");

        Robot robot = new Robot();
        for (int i = 0; i < keyInput.length; i++) {
            robot.keyPress(keyInput[i]);
           // robot.delay(100);
           //java  Runtime.getRuntime().exec("save");
           robot.delay(5000);
        }
        
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
     

      

           robot.keyPress(KeyEvent.VK_ALT);
            robot.keyPress(KeyEvent.VK_F4); 
            robot.delay(5000);  
            
    }
}