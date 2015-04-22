package ProjectCode;

import java.awt.Color;
import java.awt.Graphics;

class Bar  
{  
    int ss;  
    static int yy=0;  
    int q;  
    static int pp;  
    Bar(int a)  
    {  
        yy=a+yy;  
    }  
    public void barpaint(Graphics g)  
    {  
        g.setColor(Color.green);  
        g.fillRect(yy,270,60,10);  
    }  
}  
