package ProjectCode;

import java.awt.Graphics;

class Rectangle  
{  
    int i;  
    int x,y;  
    Graphics g;  
    int ballCheck=0;  
    boolean display;  
    Rectangle(int m ,int n)  
    {  
        x = m;  
        y =n;  
    }  
    public void ppaint(Graphics g)  
    {  
        g.fillRect(x,y,40,10);  
    }  
}  
