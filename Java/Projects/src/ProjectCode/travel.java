package ProjectCode;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import java.util.*;
import java.text.*;
import java.sql.*;
import java.math.*;
//////////////////////////////////////////////////////////////////////////
///////////////////////////////
public class travel extends JFrame
{
public static int WIDTH=700;
public static int HEIGHT=700;
int counter;
public static String TITLE="TRAVEL AGENT";

Container framecontainer;
JMenuBar menubar=new JMenuBar();
JMenu filemenu=new JMenu("File");
JMenuItem fileexit=new JMenuItem("Egress");
String nm[]=new String[10];
JPanel panel=new JPanel();
String[] buttonlayout={"New","Edit","Find","Egress"};
String month[]={"Jan","Feb","Mar","Apr",
                 "May","Jun","Jul","Aug",
                 "Sep","Oct","Nov","Dec"};
JButton[] buttons=new JButton[buttonlayout.length];


JTextField textfname=new JTextField(" ",20);
JTextField textfadd=new JTextField(" ",50);
JTextField textfph=new JTextField(" ",20);
JTextField textfcity=new JTextField(" ",15);
JTextField textffax=new JTextField(" ",15);
JTextField textfemail=new JTextField(" ",20);
JTextField textfperson=new JTextField(" ",20);
JTextField textfcode=new JTextField(" ",10);

JLabel code=new JLabel("Code");
JLabel listname=new JLabel("Name");
JLabel listadd=new JLabel("Address");
JLabel listph=new JLabel("Phone");
JLabel listfax=new JLabel("Fax");
JLabel listemail=new JLabel("Email");
JLabel listperson=new JLabel("Contact Person");
JLabel listcity=new JLabel("City");
JLabel listHOTEL=new JLabel("HOTEL   DEOGARH    MAHAL");
JList namelist;
JScrollPane scroll;

GregorianCalendar g=new GregorianCalendar();
SimpleTimeZone t=new SimpleTimeZone(0530,"Bombay,Calcutta,Madras,NewDelhi");
JLabel listdate=new JLabel(g.get(Calendar.DATE)+""+month[g.get(Calendar.MONTH)]+" "+g.get(Calendar.YEAR));
//JLabel listtime=new JLabel(" "+TimeZone.getDefault());
 char mode='C';
 
}

