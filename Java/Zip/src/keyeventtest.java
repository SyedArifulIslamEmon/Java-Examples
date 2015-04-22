
//import kareltherobot.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public abstract class keyeventtest implements KeyListener
{

public void keyPressed(KeyEvent e)
{
    World.setVisible(true);
    int key = e.getKeyCode();

    int x = 1;
    int y = 1;

    Robot red = new Robot(x, y, North, 0);

    if (key == KeyEvent.VK_LEFT)
    {
        x--;
    }

    if (key == KeyEvent.VK_RIGHT)
    {
        x++;
    }

    if (key == KeyEvent.VK_UP)
    {
        y++;
    }

    if (key == KeyEvent.VK_DOWN)
    {
        y--;
    }


}
}
