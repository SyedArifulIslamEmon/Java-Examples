import java.awt.AWTException;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;


public class Sceen {

	 public static void main(String[] args) throws IOException { int width; int height;

	    try{
	        // Get screen devices.
	        GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
	        GraphicsDevice[] gdevices = ge.getScreenDevices();

	        // Find out widht and height of each, print line.
	        for (int i = 0; i < gdevices.length; i++){
	            System.out.println("Device " + i);
	            System.out.println("Width:" + gdevices[i].getDisplayMode().getWidth());
	            System.out.println("Height:" + gdevices[i].getDisplayMode().getHeight());
	        }

	        // Get width and height again for later. Don't worry about this now.
	        width = gdevices[1].getDisplayMode().getWidth();
	        height = gdevices[1].getDisplayMode().getHeight();

	        // Initiate robot.
	        Robot robot = new Robot(gdevices[1]);
	        // Size of printscreen area. Temporary. Will be entire screen later.
	        Rectangle captureSize = new Rectangle(0,0,500,500);

	        // Take screenshot on gdevice[1]
	        BufferedImage bufferedImage = robot.createScreenCapture(captureSize);
	        File outputfile = new File("My Screenshot" + 1 + ".png");
	        boolean write = ImageIO.write(bufferedImage, "png",outputfile);

	        // Preparing to take another screenshot after.
	        /* Need to move mouse to monitor where screenshot is taken. Mouse
	         * is currently at a monitor that displays NetBeans, which is where 
	         * I'm running this from, for now.
	         */

	        robot.mouseMove(200,200);
	        /* Need to activate window by gaining focus, don't how to do with robot
	         * do with mouse instead.
	         */
	        robot.mousePress(InputEvent.BUTTON1_MASK);
	        robot.mouseRelease(InputEvent.BUTTON1_MASK);
	        /* After the first screen shot, scroll screen that's now 
	         * active (focused?)
	         */
	        robot.mouseWheel(3);

	        // Take second screenshot.
	        robot.delay(1000);
	        bufferedImage = robot.createScreenCapture(captureSize);
	        outputfile = new File("My Screenshot" + 2 + ".png");
	        //write into second half
	        write = ImageIO.write(bufferedImage, "png",outputfile);
	    }
	    catch (AWTException e){
	        System.err.println("Somethingfishy is going on ...");
	    }
	}

	} 
