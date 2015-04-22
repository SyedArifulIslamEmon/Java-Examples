package ProjectCode;

import java.applet.*;
import java.awt.event.*;
import java. awt.*;

public class DoubleBuffering extends Applet implements
MouseMotionListener
{
 Graphics bg;
 Image img;
 Dimension dim;
 int curX,curY;

public void init()

{

dim=getSize();
addMouseMotionListener(this);
setBackground(Color.black);
img=createImage(dim.width,dim.height);
bg=img.getGraphics();
}
public void paint(Graphics g)
{
 bg.clearRect(0,0,dim.width,dim.width);
bg.setColor(Color.red);
bg.drawString("Bad double-Buffer",10,10);
bg.fillRect(curX,curY,20,20);
g.drawImage(img,0,0,this);


}
public void update(Graphics g)
{
paint(g);

}
public void mouseMoved(MouseEvent evt)
{
curX=evt.getX();
curY=evt.getY();
}


public void mouseDragged(MouseEvent evt)
{
	}
}
