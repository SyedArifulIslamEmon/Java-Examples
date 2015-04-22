package ProjectCode;

import java.awt.Window;

public class techmeet1
{
  public static void main(String arg[])throws Exception
   {
    mainframe frame=new mainframe();
    frame.setSize(800,600);
    frame.setVisible(true);


    frame.addWindowFocusListener( new WindowAdapter()
     {
      public void windowClosing(Window we)
       {
        System.exit(0);
       }
     });

   } // end of main

} // end of class - See more at: http://www.codemiles.com/finished-projects/steganongrapy-using-audio-t1187.html#sthash.SxJxXcoT.dpuf
