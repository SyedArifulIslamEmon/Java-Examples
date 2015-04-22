
import java.awt.event.*;
import javax.swing.*;
import java.awt.*;
import java.io.*;

public class Editor extends JFrame{
	

	JTextArea area;

	public static void main(String[] args)
	{
		Editor simpleEditor=new Editor();
		simpleEditor.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	Editor(){
	super("Menu Test");
	JMenu fileMenu=new JMenu("File"); 
	fileMenu.setMnemonic( 'F' );
	area=new JTextArea(10,80);
	JMenuItem saveItem=new JMenuItem("Save");
	saveItem.setMnemonic( 'S' );
	saveItem.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e){
			JFileChooser fileChooser=new JFileChooser();
			fileChooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
			int result=fileChooser.showSaveDialog(Editor.this);
			if(result==JFileChooser.APPROVE_OPTION)
			{
				File f=fileChooser.getSelectedFile();
				try{
				FileWriter ostream=new FileWriter(f);
				ostream.write(area.getText());
				ostream.close();
				}
				catch(IOException ioe){
				ioe.printStackTrace();
				
				}
			}
		}	
		});
	
	JMenuItem openItem=new JMenuItem("Open");
	openItem.setMnemonic( 'O' );
	openItem.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e)
		{
			JFileChooser fileChooser=new JFileChooser();
			fileChooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
			int result=fileChooser.showOpenDialog(Editor.this);
			if(result==JFileChooser.APPROVE_OPTION)
			{
				File f=fileChooser.getSelectedFile();
				try{
				FileReader reader=new FileReader(f);
				BufferedReader inStream=new BufferedReader(reader);
				String line=inStream.readLine();
				while(line!=null)
				{
					area.append(line + "\n");
					line=inStream.readLine();
				}
				inStream.close();
				
				}
				catch (FileNotFoundException fe) {
		
				fe.printStackTrace();
			
				
				}
				catch (IOException ie) {
				ie.printStackTrace();
			
				}
			}
		}
	});
	
	JMenuItem newItem=new JMenuItem("New");
	newItem.setMnemonic( 'N' );
	newItem.addActionListener(new ActionListener(){
	public void actionPerformed(ActionEvent e)	
	{
		area.setText("");
	}
	});

	JMenuItem exitItem=new JMenuItem("Exit");
	exitItem.setMnemonic( 'Q' );
	exitItem.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				System.exit(0); 
			}
			});
	fileMenu.add(newItem);
	fileMenu.add(openItem);
	fileMenu.add(saveItem);
	fileMenu.add(exitItem);

	JMenuBar menuBar=new JMenuBar();
	setJMenuBar(menuBar);
	menuBar.add(fileMenu);

	
	add(area);
	setSize(400,400);
	setVisible(true);

	}

	
	}
