package ProjectCode;

import java.applet.*;
import java.awt.*;

public class Main extends Applet implements Runnable
{

    // variables
  //  ...
    private Player player;
    private Shot [] shots;

    // constants
    private final int shotSpeed = -2;
  //  ...

    // double buffering
    private Image dbImage;
    private Graphics dbg;

    public void init()
    {
     //   ...
        // generate shot array
        shots = new Shot[5];
    }

   // ...

    public void run ()
    {

        while (true)
        {
            // Iterate over the shot array and move shots,
            // test if a shot has left the game area.
            // You can add other tests here (test for collisions
            // of enemies and shots...
            for(int i=0; i<shots.length; i++)
            {
                if(shots[i] != null)
                {
                    // move shot
                    shots[i].moveShot(shotSpeed);

                    // test if shot has left the game area
                    // if true, delete from array
                    if(shots[i].getYPos() < 0)
                    {
                        // delete shot
                        shots[i] = null;
                    }

                    // other operations to be added
                    // ...
                    // for example collision testing...
                    // ...
                
            

            // move player
            ...

            ...
        }
    }

    public boolean keyDown(Event e, int key)
    {
      //  ...

        // Spacebar is hit, generate new shot
        else if(key == 32){
            // generate new shot and try to store it in shots array
            for(int i=0; i<shots.length; i++)
            {
            // only store shot if there is a place left in the array
                if(shots[i] == null)
                {
                    shots[i] = player.generateShot();
                    // call break to store shot only once, important!
                    break;
                }
            }
        }

      //  ...
    }

  

	public void paint (Graphics g)
    {
        // draw player
       // ...

        // draw shots
        for(int i=0; i<shots.length; i++)
        {
            if(shots[i] != null)
            {
                shots[i].drawShot(g);
            }
        }
    }

} 
