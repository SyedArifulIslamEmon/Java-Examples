package ProjectCode;

import java.awt.Color;
import java.awt.Graphics;

class Ball  
{  
    static int flag=3;  
    static int flagx=1;  
    static int flagy=2;  
    static int Point = 0;  
    static String over="";  
    static int life=1;  
    int x,y,m;  
    int x1,y1;  
    Graphics g;  
    Ball(int a1,int a2)  
    {  
        x1 = a1;  
        y1 = a2;  
    }  
    public void bpaint(Graphics g)  
    {  
        //g.drawString("  y : "+y1,455,250);  
        if(20>=x1||x1>=410||y1<=20||y1>=260)   //checking boundaries  
        {  
            getflag();  
        }  
        g.setColor(Color.magenta);  
        g.fillOval(x1,y1,15,15);  
    }  
    public boolean over()  
    {  
        //System.out.println(""+y1);  
        if(y1>290)  
            return true;  
        else  
            return false;  
    }  
    public void move()  
    {  
        x1++;  
    }  
    public void move1()  
    {  
        x1--;  
    }  
    public void move2()  
    {  
        y1=y1+2;  
    }  
    public void move3()  
    {  
        y1=y1-2;  
    }  
    public void move4()  
    {  
        x1++;  
        y1--;  
    }  
    public void getflag()  
    {  
        if(x1<=20)  // check boundaries and ball motion  
        {  
            x1=20;  
            flagx=1;  
        }  
        if(x1>=410)  
        {  
            x1=410;  
            flagx=2;  
        }  
        if(y1<=20)  
        {  
            y1=20;  
            Point = Point +10;  
            flagy=1;  
        }  
        if(y1>=260)  
        {  
            if(Bar.yy>=x1||x1<=(Bar.yy+50))  
            {  
                System.out.print("/n /n true Bar.yy :"+Bar.yy+"Y1:"+y1);  
                System.out.print(" /n/n/n/ncheck ok");  
                y1=260;  
                flagy=2;  
            }  
            else  
            {  
                System.out.print("/n /n falseBar.yy :"+Bar.yy+" Y1:"+y1);  
                if(Bar.yy>260 && Bar.yy<200)  
                {  
                    flag=2;  
                    System.out.print("/n game over");  
                }  
                else  
                {  
                    if(Bar.yy>290)  
                    {  
                    }  
                    else  
                    {  
                        life=0;  
                        System.out.print(Bar.yy);  
                        over="LOST GAME";  
                    }  
                }  
  
            } //else1 end  
        }  
    }  
}//end class  
