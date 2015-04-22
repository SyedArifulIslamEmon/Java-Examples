
import javax.swing.JOptionPane;   // Needed to use JOptionPane
public class Test {
   public static void main(String[] args) {
      String radiusStr;
      double radius;
	double area;
      // Read input String from dialog box
      radiusStr = JOptionPane.showInputDialog("Enter the radius of the circle");
      radius = Double.parseDouble(radiusStr);   // Convert String to double
      
      
      area =( radius*radius*Math.PI);
      
      
      JOptionPane.showMessageDialog(null, "Area"+area);
     // System.out.println("The area is " + area);
   }
}
