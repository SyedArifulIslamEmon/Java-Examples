
import javax.swing.*;
import java.awt.*;
import java.util.*;
import java.awt.event.*;

class JavaRobot
{
public static void main(String args[]) throws Exception
{
Robot r=new Robot();

r.setAutoDelay(200);

r.keyPress(KeyEvent.VK_WINDOWS);
r.keyPress(KeyEvent.VK_R);
r.keyRelease(KeyEvent.VK_R);
r.keyRelease(KeyEvent.VK_WINDOWS);

r.keyPress(KeyEvent.VK_N);
r.keyRelease(KeyEvent.VK_N);

r.keyPress(KeyEvent.VK_O);
r.keyRelease(KeyEvent.VK_O);

r.keyPress(KeyEvent.VK_T);
r.keyRelease(KeyEvent.VK_T);

r.keyPress(KeyEvent.VK_E);
r.keyRelease(KeyEvent.VK_E);

r.keyPress(KeyEvent.VK_P);
r.keyRelease(KeyEvent.VK_P);

r.keyPress(KeyEvent.VK_A);
r.keyRelease(KeyEvent.VK_A);

r.keyPress(KeyEvent.VK_D);
r.keyRelease(KeyEvent.VK_D);

r.keyPress(KeyEvent.VK_ENTER);

r.keyPress(KeyEvent.VK_H);
r.keyRelease(KeyEvent.VK_H);

r.keyPress(KeyEvent.VK_A);
r.keyRelease(KeyEvent.VK_A);

r.keyPress(KeyEvent.VK_I);
r.keyRelease(KeyEvent.VK_I);

r.keyPress(KeyEvent.VK_SPACE);
r.keyRelease(KeyEvent.VK_SPACE);

r.keyPress(KeyEvent.VK_V);
r.keyRelease(KeyEvent.VK_V);

r.keyPress(KeyEvent.VK_A);
r.keyRelease(KeyEvent.VK_A);

r.keyPress(KeyEvent.VK_I);
r.keyRelease(KeyEvent.VK_I);


r.keyPress(KeyEvent.VK_ALT);
r.keyPress(KeyEvent.VK_F4);

r.keyRelease(KeyEvent.VK_F4);
r.keyRelease(KeyEvent.VK_ALT);

r.keyPress(KeyEvent.VK_RIGHT);
r.keyRelease(KeyEvent.VK_RIGHT);

r.keyPress(KeyEvent.VK_ENTER);
r.keyRelease(KeyEvent.VK_ENTER);

}
}
