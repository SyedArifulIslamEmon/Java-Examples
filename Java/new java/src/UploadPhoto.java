
 import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class UploadPhoto extends JFrame implements ActionListener{
JButton upload=new JButton("Upload Photo");
UploadPhoto(){
this.add(upload);
upload.addActionListener(this);
this.setSize(300,300);
this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
this.setLocationRelativeTo(null);

this.setVisible(true);
this.setTitle("UploadPhoto");

}//constructor


public static void main(String[] args){
new UploadPhoto();
}//psvm

public void actionPerformed(ActionEvent e){
if (e.getSource()==upload){

}

}

}
