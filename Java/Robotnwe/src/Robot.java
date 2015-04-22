
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Image;
import java.net.URL;
import java.util.ArrayList;

import javax.swing.Box;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Robot extends JFrame { 

    // Size and position
    private int NumberRows, NumberCols;
    private int CurrentRow,  CurrentCol;
    private int PreviousRow, PreviousCol;

    // User interface
    private JPanel panel;
    private Image robot;
    private ArrayList<JButton> buttons;

    // Robot constructor
    public Robot(int numberRows, int numberCols, int currentRow, int currentCol) {

    	// Check parameters
    	if ((numberRows < 4) || (numberCols < 4)) { System.out.println("Number of rows and columns must be >= 4!"); System.exit(-1); }
    	if ((numberRows > 8) || (numberCols > 8)) { System.out.println("Number of rows and columns must be <= 8!"); System.exit(-1); }
    	if ((currentRow < 0) || (currentRow >= numberRows)) { System.out.println("Initial row outside grid!"); System.exit(-1); }
    	if ((currentCol < 0) || (currentCol >= numberCols)) { System.out.println("Initial column outside grid!"); System.exit(-1); }

    	// Store parameters
        NumberRows = numberRows;
        NumberCols = numberCols;
        CurrentRow = currentRow;
        CurrentCol = currentCol;
        PreviousRow = 0;
        PreviousCol = 0;
        
        // Create panel and grid
        panel = new JPanel();
        panel.setLayout(new GridLayout(NumberRows, NumberCols, 0, 0));
        add(Box.createRigidArea(new Dimension(0, 5)), BorderLayout.NORTH);    
        add(panel, BorderLayout.CENTER);

        // Load and scale image
        URL url = Robot.class.getResource("Robot.jpg");
        ImageIcon icon = new ImageIcon(url);
        Image image = icon.getImage();
        robot = image.getScaledInstance(100, 100, Image.SCALE_DEFAULT);
 
        // Build panel of buttons
        buttons = new ArrayList<JButton>(); 
        for (int Row = 0; Row < NumberRows; Row++) {
            for (int Col = 0; Col < NumberCols; Col++) {
                // Initialize and add button
            	JButton button = new JButton();
                button.setText(Row + "," + Col);
                panel.add(button);
                buttons.add(button);
            }
        }
 
        // Configure window
        setSize(NumberRows * 100, NumberCols * 100);
        setTitle("Robot");
        setResizable(false);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setVisible(true);
        redraw();
    }

    // Move robot
    public void moveTo(int newRow, int newCol)
    {
    	// Check parameters
    	if ((newRow < 0) || (newRow >= NumberRows) || (newCol < 0) || (newCol >= NumberCols)) {
    		System.out.println ("Move to " + newRow + "," + newCol + " is out of bounds!");
    	}
    	else {
    		
    		// Store parameters
    		PreviousRow = CurrentRow;
    		PreviousCol = CurrentCol;
    		CurrentRow = newRow;
    		CurrentCol = newCol;

    		// Redraw grid
    		redraw();
    	}
    }
    
    // Redraw grid
    private void redraw()
    {
        // Wait for awhile
        try {
            Thread.sleep(500);
        } catch(InterruptedException ex) {
            Thread.currentThread().interrupt();
        }

        // Compute index and remove icon
        int index = (PreviousRow * NumberCols) + PreviousCol;
        buttons.get(index).setIcon(null);
        
        // Compute index and add icon
        index = (CurrentRow * NumberCols) + CurrentCol;
        buttons.get(index).setIcon(new ImageIcon(robot));
    }
}
