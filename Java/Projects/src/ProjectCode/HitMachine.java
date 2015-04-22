package ProjectCode;

import java.awt.*;  
import java.awt.event.*;  
import java.applet.*;  
import javax.swing.*;  
import javax.swing.event.*;  
/* 
<applet code="HitMachine.class" width=670 height=300> 
</applet> 
 */  
public class HitMachine extends Applet implements  
Runnable,KeyListener,MouseListener  
{  
    Thread th;  
    static  Rectangle ob[] = new Rectangle[30];  
    Ball ball;  
    Bar bar;  
    Message mes;  
    int i,j;  
    int x = 1;  
    int y=1;  
    int z = 0;  
    int xx,yy1,zz;  
    int b,b1;  
    int flag;  
    //static int yy=0;  
    boolean runing=true;  
    Image dbimage;  
    Graphics dbg;  
    int c1,c2,c3,c4;  
    int flagg=1;  
    //int ballCheck=0;  
    String ss = "";  
    String ss1="";  
    String me = "";  
    static int score = 0;  
    static Font ff;  
    TextArea ta;  
    public void start()  
    {  
        th = new Thread(this);  
        runing = false;  
        //th.start();  
    }  
    public void stop()  
    {  
        runing = true;  
        th = null;  
    }  
    public void run()  
    {  
        for(; ;)  
        {  
            if(ball.over())  
            {  
                ss = "Game Over!!!!!";  
                ss1 = "You have lost the game";  
                repaint();  
                System.out.print("braek");  
                break;  
            }  
            try  
            {     
                Thread.sleep(20);  
                if(runing)break;  
                int tempx=Ball.flagx;  
                int tempy=Ball.flagy;  
                if (tempx==1)  
                    ball.move();  
                else  
                    ball.move1();  
                if(tempy==1)  
                    ball.move2();  
                else  
                    ball.move3();  
                if(tempy==1)  
                    ball.move();  
                else  
                    ball.move3();  
                repaint();  
            }  
            catch(InterruptedException ie)  
            {  
                ie.printStackTrace();  
            }  
        }  
    }  
    /** 
     * Method init 
     * 
     */  
    public void init()  
    {  
        int xx=30,mm=30;  
        for(int i =0 ;i<24;i=i+3)  
        {  
            ob[i] = new Rectangle(xx,mm);  
            ob[i].display=true;  
            mm=mm+20;  
            ob[i+1] = new Rectangle(xx,mm);  
            ob[i+1].display=true;  
            mm=mm+20;  
            ob[i+2] = new Rectangle(xx,mm);  
            ob[i+2].display=true;  
            xx=xx+50;  
            mm = 30;  
        }  
        mes =new Message();  
        ball = new Ball(90,250);  
        bar = new Bar(70);  
        ff = new Font("comic sans",Font.BOLD,20);  
        this.addKeyListener(this);  
        this.addMouseListener(this);  
    }  
    public void paint(Graphics g)  
    {  
       int count=0;  
        for(int i=0;i<24;i++)  
        {  
            if(ob[i].display==false)  
                count++;  
        }  
        if(count==24)  
        {  
            mes.mess(g);  
            return;  
        }  
        g.setFont(new Font("comic sans",Font.PLAIN,15));  
        g.setColor(Color.pink);  
        g.fillRect(470,30,150,70);  
        g.setColor(Color.blue);  
        g.drawString("Score:  "+score,480,50);  
        g.drawString("Status:"+Ball.over,480,70);  
        g.drawString("Life:  "+Ball.life,480,90);  
        //g.drawString(""+Bar.yy,455,50);  
        g.setColor(Color.black);  
        g.fillRect(20,20,410,300);  
        g.setColor(Color.blue);  
        g.setFont(ff);  
        g.drawString(ss,100,200);  
        g.drawString(ss1,100,230);  
        g.setColor(Color.red);  
        for(int j = 0;j<24;j++)  
        {  
            if(ob[j].display==false)  
            {  
                continue;  
            }  
            System.out.print(" check   false  :  "+ob[j].display);  
            if(ob[j].display==true)  
            {  
                breaking(j) ;  
            }  
            if(ob[j].display==true)  
                ob[j].ppaint(g);  
        }  
        ball.bpaint(g);  
        bar.barpaint(g);  
    }  
    public void keyTyped(KeyEvent k)  
    {  
    }  
    public void keyReleased(KeyEvent k)  
    {  
    }  
    public void  keyPressed(KeyEvent k)  
    {  
        int R =k.getKeyCode();  
        if(R==k.VK_LEFT)  
        {  
            if(bar.yy > 25)  
                bar.yy=bar.yy-10;  
            System.out.println("Left");  
            repaint();  
        }  
        if(R==k.VK_RIGHT)  
        {  
            if(bar.yy < 365 )  
            {  
                bar.yy=bar.yy+10;  
            }  
            System.out.println("Right");  
            repaint();  
        }  
    }  
    public void mousePressed(MouseEvent me)  
    {  
     th.start();  
    }  
    public void mouseReleased(MouseEvent me)  
    {  
    }  
    public void mouseClicked(MouseEvent me)  
    {  
    }  
    public void mouseExited(MouseEvent me)  
    {  
    }  
    public void mouseEntered(MouseEvent me)  
    {  
    }  
    public void update(Graphics g) //to remove flickering  
    {  
        if (dbimage==null)  
        {  
            dbimage=createImage(this.getSize().width,this.getSize().height);  
            dbg=dbimage.getGraphics();  
        }  
        dbg.setColor(getBackground());  
        dbg.fillRect(0,0,this.getSize().width,this.getSize().height);  
        dbg.setColor(getForeground());  
        paint(dbg);  
        g.drawImage(dbimage,0,0,this);  
    }  
    public boolean breaking(int i)  
    {  
        if(check(i))  
            return true;  
        else  
            return false;  
    }  
    public boolean check(int i)  
    {  
        int am,ami;  
        am = Math.abs(ball.x1-ob[i].x);  
        ami = Math.abs(ball.y1-ob[i].y);  
        if(am<20 && ami<20 )  
        {  
            ob[i].display=false;  
            score=score+10;  
            Ball.flagy=1;  
            return true;  
        }  
        else  
        {  
           return false;  
        }  
    }  
} //Class main is end  
