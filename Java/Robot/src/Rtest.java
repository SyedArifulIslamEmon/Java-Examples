
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Rtest extends JFrame
                       implements ActionListener{

  Robot robot;

  public static void main(String[] args){
    new Rtest();
  }//end main
  //-------------------------------------------//

  public Rtest(){//constructor
    //Instantiate and save a new Robot object
    try{
      robot = new Robot();
    }catch(AWTException e){e.printStackTrace();}

    //Prepare the JFrame for use
    setDefaultCloseOperation(
                          JFrame.EXIT_ON_CLOSE );
    getContentPane().setLayout(
                            new GridLayout(1,3));
    setBounds(20,20,250,100);
    setTitle("Copyright 2003, R.G.Baldwin");

    //Create the buttons
    JToggleButton b1 = new JToggleButton( "1" );
    JToggleButton b2 = new JToggleButton( "2" );
    JToggleButton b3 = new JToggleButton( "3" );

    //Add the buttons to the frame
    getContentPane().add(b1);
    getContentPane().add(b2);
    getContentPane().add(b3);

    //Register an action listener on each of
    // the buttons.
    b1.addActionListener(this);
    b2.addActionListener(this);
    b3.addActionListener(this);

    //Set look and feel
    String plafClassName =
               "com.sun.java.swing.plaf.motif." +
                              "MotifLookAndFeel";
    try{
       UIManager.setLookAndFeel(plafClassName);
     }catch(Exception ex){ex.printStackTrace();}

     //Cause the new L&F to apply
     SwingUtilities.updateComponentTreeUI(this);

    //Make the frame visible
    setVisible( true );
  }//end constructor
  //-------------------------------------------//

  //Define the event handler that is registered
  // on each of the buttons.
  public void actionPerformed(ActionEvent e){
    JToggleButton button =
                  (JToggleButton)(e.getSource());
    //Spawn a thread to handle the event and
    // return from the event handler method.
    new HandleEvent(button,this).start();
  }//end actionPerformed
  //-------------------------------------------//

  //Objects of this inner Thread class are
  // spawned to handle action events on the
  // buttons.
  class HandleEvent extends Thread{
    JToggleButton button;
    ActionListener listener;

    HandleEvent(JToggleButton button,
                        ActionListener listener){
      this.button = button;
      this.listener = listener;
    }//end constructor

    public void run(){
      //Get the button's location.
      Point location =
                    button.getLocationOnScreen();
      //Disable action events on this button
      // until this process is complete.  Don't
      // allow the robot to generate an action
      // event on this button.
      button.removeActionListener(listener);
      //Cause the mouse pointer to automatically
      // move across the screen and click on the
      // button that fired the event currently
      // being processed.  This will un-select
      // the toggle button.
      mouseMoveAndClick(50,50,
              location.x + button.getWidth()/2,
              location.y + button.getHeight()/2);
      //Re-enable action events on this button
      button.addActionListener(listener);
    }//end run

  }//end class HandleEvent
  //-------------------------------------------//

  public void mouseMoveAndClick(int xStart,
                                int yStart,
                                int xLoc,
                                int yLoc){
    //Move the mouse pointer to the starting
    // position
    robot.mouseMove(xStart,yStart);

    //Change the cursor to a hand and delay
    setCursor(new Cursor(Cursor.HAND_CURSOR));
    robot.delay(1000);

    //Use double precision to avoid cumulative
    // arithmetic errors.  Calculate the
    // incremental distance for animated mouse
    // pointer movement.  Make animation speed
    // appropriate for distance to be traveled.
    double div;
    if ((xLoc - xStart) < 50.0) div = 15;
    else if ((xLoc - xStart) < 100.0) div = 30;
    else div = 60;

    double xInc = (xLoc - xStart)/div;
    double yInc = (yLoc - yStart)/div;

    //Initialize, and then execute a loop to move
    // the mouse pointer from the starting
    // position to the center of the button.
    // Sleep for 60 msec between each movement.
    double x = xStart;
    double y = yStart;
    while(((int)x < xLoc) || ((int)y < yLoc)){
      x += xInc;
      y += yInc;
      robot.mouseMove((int)x,(int)y);
      robot.delay(60);
    }//end while loop

    //Press and then release the left mouse
    // button when the mouse pointer is resting
    // in the location of the JToggleButton.
    robot.mousePress(InputEvent.BUTTON1_MASK);
    robot.mouseRelease(InputEvent.BUTTON1_MASK);

    //Return the cursor to the starting position
    // and restore it to a default pointer.
    robot.delay(1000);
    robot.mouseMove(xStart,yStart);
    setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
  }//end mouseMoveAndClick
  //-------------------------------------------//

}//end class definition