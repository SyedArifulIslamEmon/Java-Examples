package ProjectCode;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import java.io.*;
import java.net.*;

public class Jeditor extends JFrame implements ActionListener
{
	private JTextPane metin;
	private Dialog diyalog;
	private JButton dugme,ac,derle;
	private JTextField kutu,yuk,gen,baslik;
	private JMenuBar mb;
	private JScrollPane kay;
	private JMenu dosya,hazirkod,gorunum,yardim;
	private String icerik="";
	private JMenuItemyeni,kapat,yazdir,guigir,iogir,butongir,etiketgir,tasarlayici,win,linux,hakkimda;

	private JButton tamam;
	private JButton iptal;

	public Jeditor()
	{
		super("Java Editörü");
		setSize(680,530);

		Container c=getContentPane();

		metin=new JTextPane();
		dugme=new JButton("Kaydet");
		dugme.addActionListener(this);
		kutu=new JTextField();

		tasarlayici=new JMenuItem("Pencere Tasarla");
		tasarlayici.addActionListener(this);

		derle=new JButton("Kodu Derle");
		derle.addActionListener(this);

		ac=new JButton("Dosya Aç");
		ac.addActionListener(this);

		kay=new JScrollPane(metin);
		c.add(kay);

		mb=new JMenuBar();
		dosya=new JMenu("Dosya");
		hazirkod=new JMenu("Hemen Kod Ekle");
		yardim=new JMenu("Yardým");

		yeni=new JMenuItem("Yeni Proje Baþlat");
		yeni.addActionListener(this);

		hazirkod.add(tasarlayici);

		kapat=new JMenuItem("Kapat");
		kapat.addActionListener(this);

		yazdir=new JMenuItem("Kodu Yazdýr");
		yazdir.addActionListener(this);

		guigir=new JMenuItem("GUI Program Kodu Ekle");
		guigir.addActionListener(this);
		hazirkod.add(guigir);

		gorunum=new JMenu("Görünüm");
		win=new JMenuItem("Windows Tarzý");
		win.addActionListener(this);
		gorunum.add(win);

		linux=new JMenuItem("Linux Tarzý");
		linux.addActionListener(this);
		gorunum.add(linux);

		hakkimda=new JMenuItem("Hakkýmda");
		hakkimda.addActionListener(this);
		yardim.add(hakkimda);

		iogir=new JMenuItem("I/O Program Kodu Ekle");
		iogir.addActionListener(this);
		hazirkod.add(iogir);

		butongir=new JMenuItem("Buton Ekle");
		butongir.addActionListener(this);
		hazirkod.add(butongir);

		etiketgir=new JMenuItem("Etiket Ekle");
		etiketgir.addActionListener(this);
		hazirkod.add(etiketgir);

		dosya.add(yeni);
		dosya.add(yazdir);
		dosya.add(kapat);
		mb.add(dosya);
		mb.add(hazirkod);
		mb.add(gorunum);
		mb.add(yardim);

		kutu.setBounds(5,10,150,22);
		derle.setBounds(375,10,100,25);
		dugme.setBounds(172,10,100,25);
		kay.setBounds(5,40,660,440);
		ac.setBounds(274,10,100,25);

		c.setLayout(null);

		c.add(kay);
		c.add(derle);
		c.add(ac);
		c.add(dugme);
		c.add(kutu);
		setJMenuBar(mb);
		show();
	}


	private void frameAc()
	{

		diyalog=new Dialog(new JFrame());
		diyalog.resize(220,135);
		diyalog.move(320,220);
		diyalog.setLayout(null);
		diyalog.setTitle("Hazýr Pencere Düzenleyici");

		YeniPencereActionListener yp=new YeniPencereActionListener();

		tamam=new JButton("Tamam");
		tamam.addActionListener(yp);
		iptal=new JButton("Ýptal");
		iptal.addActionListener(yp);
		JLabel genet=new JLabel("Geniþlik");
		gen=new JTextField();

		JLabel yuket=new JLabel("Yükseklik");
		yuk=new JTextField();

		JLabel basliket=new JLabel("Programýn Baþlýðý");
		baslik=new JTextField();

		basliket.setBounds(10,30,60,20);
		baslik.setBounds(71,30,100,22);

		genet.setBounds(10,55,60,20);
		gen.setBounds(71,55,30,25);

		yuket.setBounds(10,80,60,20);
		yuk.setBounds(71,80,30,25);

		tamam.setBounds(10,105,100,25);
		iptal.setBounds(115,105,100,25);

		diyalog.add(baslik);
		diyalog.add(basliket);
		diyalog.add(tamam);
		diyalog.add(iptal);
		diyalog.add(yuk);
		diyalog.add(yuket);
		diyalog.add(gen);
		diyalog.add(genet);
		diyalog.show();
	}

	private void guiEkle()
	{
		String gui="import java.awt.*;";
		String gui2="public class BurayiAyarla extends Frame {";
		String gui3="public BurayiAyarla() 
 {";
		String gui4="super("Baslik Buraya"); 
 setSize(400,300);";
		String gui5="show(); 
 }";
		String gui6="public static void main(String[] args) 
 {";
		String gui7="BurayiAyarla a=new BurayiAyarla(); 
 } 
 }";
		String
ekle=gui+"
"+gui2+"
"+gui3+"
"+gui4+"
"+gui5+"
"+gui6+"
"+gui7;
		metin.setText(ekle);
	}

	private void ioEkle()
	{
		String io="import java.io.*; 
 public class BurayiAyarla 
 { 
 
public
static void main(String[] args) 
 { System.out.print("Merhaba
dünya..."); 
 } 
 }";
		metin.setText(io);
	}

	private void dosyaOku()
	{
	   	String m=kutu.getText();
		try {
			FileReader oku=new FileReader(m);
			BufferedReader buf=new BufferedReader(oku);
			String satir=buf.readLine();

			while (satir!=null)
			{
				icerik=icerik+satir;

				satir=buf.readLine();
			}
		    }
		    catch (IOException er)
		    {
	   		System.out.print("hata");
		 }
	}

	private void dosyaYaz()
	{
			String mesaj=kutu.getText();
			File dosya=new File(mesaj);
			try {
				dosya.createNewFile();
				FileOutputStream yaz=new FileOutputStream(mesaj);
				PrintWriter yazdirici=new PrintWriter(yaz);
				String al=metin.getText();
				yazdirici.print(al);
				yazdirici.close();
			}
			catch (IOException ei)
			{
				System.out.print("hata");
			}

	}

	private void win()
	{
			try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
			SwingUtilities.updateComponentTreeUI(this);
			}
			catch (Exception ef) {
				System.out.print("hata..");
			}
	}


	public void actionPerformed(ActionEvent e)
	{
		Object kaynak=e.getSource();

		if (kaynak==dugme)
		{
			dosyaYaz();
		}
		else if (kaynak==yeni)
		{
			kutu.setText("");
			metin.setText("");
		}
		else if (kaynak==kapat)
		{
			System.exit(0);
		}
		else if (kaynak==derle)
		{
			try {
				String derle1=kutu.getText();
				Runtime.getRuntime().exec("C:\command.exe javac " + derle1);
			} catch (IOException ek)
			  {
			  	//..
			  }
		}
		else if (kaynak==guigir)
		{
			guiEkle();
		}
		else if (kaynak==ac)
		{
			icerik="";
			dosyaOku();
			metin.setText(icerik);
		}
		else if (kaynak==hakkimda)
		{

		}
		else if (kaynak==iogir)
		{
			ioEkle();
		}
		else if (kaynak==tasarlayici)
		{
			frameAc();
		}
		else if (kaynak==win)
		{
			win();
		}
		else if (kaynak==linux)
		{

		}
	}

	class YeniPencereActionListener implements ActionListener
	{
		public void actionPerformed(ActionEvent ed)
		{
			Object k=ed.getSource();
			String yuk1=yuk.getText();
			String gen1=gen.getText();
			String bas=baslik.getText();
			if (k==tamam)
			{
				String ui="import java.awt.*;";
				String ui2="public class BurayiAyarla extends Frame {";
				String ui3="public BurayiAyarla() 
 {";
				String ui4="super("" + bas + ""); 
 setSize(" + gen1 + "," + 
yuk1 +
");";
				String ui5="show(); 
 }";
				String ui6="public static void main(String[] args) 
 {";
				String ui7="BurayiAyarla a=new BurayiAyarla(); 
 } 
 }";
				String 
kekle=ui+""+ui2+""+ui3+"
"+ui4+"
"+ui5+"
"+ui6+"
"+ui7;
				metin.setText(kekle);
				diyalog.hide();
			}
			else if (k==iptal){
				diyalog.hide();
			}
		}
	

	public static void main(String[] args)
	{
		Jeditor j=new Jeditor();
	}
	}}


