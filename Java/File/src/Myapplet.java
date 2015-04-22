
 import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.Toolkit;

import javax.swing.JApplet;
import javax.swing.JOptionPane;

import java.awt.Dimension;

public class Myapplet extends JApplet {

/**
* Create the applet.
*/
public Myapplet() {

}
public void paint(Graphics g)
{


super.paint(g);
this.setBackground(Color.WHITE);
int y=440,x=280,ry=300,rx=80;
g.setColor(Color.BLACK);
int i=1;
while(i<=9)
{
g.drawOval(y,x,ry,rx);
//g.drawOval(500,360, 160,320);
y=y-50;
x=x-30;
ry=ry+120;
rx=rx+70;
i++;
}
g.setColor(Color.GREEN);
g.fillOval(120,160,40,40);

/*
* code to move in ellipse but not working
*
* int a=120,b=160,p=0;
double s=0.0399;
while(p<=30)
{
a=rx;
b=ry;
b=(int) (rx*Math.cos(p*s)+300);
a=(int) (ry*Math.sin(p*s)+250);
g.fillOval(b,a,40,40);

p++;
}
*/

}
}
