
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;

public class KeyListenerExample {
    
    JTextArea inputText;
    JTextArea feedbackText;

     //Note: Typically the main method will be in a
    //separate class. As this is a simple one class
    //example it's all in the one class.
    public static void main(String[] args) {
     

         //Use the event dispatch thread for Swing components
         EventQueue.invokeLater(new Runnable()
         {
             
            @Override
             public void run()
             {
                 
                 new KeyListenerExample();         
             }
         });
              
    }
    
    public KeyListenerExample()
    {
        JFrame guiFrame = new JFrame();
        
        //make sure the program exits when the frame closes
        guiFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        guiFrame.setTitle("Creating a Table Example");
        guiFrame.setSize(700,200);
      
        //This will center the JFrame in the middle of the screen
        guiFrame.setLocationRelativeTo(null);
        
        feedbackText = new JTextArea();
        JScrollPane scrollText = new JScrollPane(feedbackText);
        
        inputText = new JTextArea();

        //place keylistener code here
        
        guiFrame.add(inputText, BorderLayout.NORTH);
        guiFrame.add(scrollText, BorderLayout.CENTER);
        guiFrame.setVisible(true);
    }
    inputText.addKeyListener(new KeyListener()
    {
        @Override 
        public void keyPressed(KeyEvent e)
        {
            feedbackText.append("Key Pressed: " + e.getKeyChar() + "\n");
        }

        @Override
        public void keyReleased(KeyEvent e)
        {
            feedbackText.append("Key Released: " + e.getKeyChar() + "\n");
        }
                  
        @Override
        public void keyTyped(KeyEvent e)
        {
            feedbackText.append("Key Typed: " + e.getKeyChar() + " " + KeyEvent.getKeyModifiersText(e.getModifiers()) + "\n");
        }
    }); 
    
}
