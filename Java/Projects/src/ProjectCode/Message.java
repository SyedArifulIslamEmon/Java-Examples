package ProjectCode;

import java.awt.Color;
import java.awt.Graphics;

class Message  
{  
    public void mess(Graphics g)  
    {  
        g.setColor(Color.black);  
        g.fillRect(0,0,400,300);  
        g.setColor(Color.red);  
        g.setFont(HitMachine.ff);  
        g.drawString("YOU HAVE WON THE GAME",160,180);  
        g.drawString("Your Score is:"+HitMachine.score,160,200);  
    }  
}  
