package ProjectCode;

import java.awt.*;
import java.awt.event.*;
import java.awt.image.*;
import javax.swing.*;
import javax.swing.border.TitledBorder;

public class ImageEffectExample extends JFrame {
  ShowPanel spanel;
  JRadioButton button1, button2, button3, button4;

  public ImageEffectExample() {
    super("Show Image Effects");
    Container container = getContentPane();
    spanel = new ShowPanel();
    container.add(spanel);
    JPanel panel = new JPanel();
    panel.setLayout(new GridLayout(2, 2));
    panel.setBorder(new TitledBorder("select"));
  ButtonGroup group=new ButtonGroup();

    button1 = new JRadioButton("Show Image Red");
  panel.add(button1);
  group.add(button1);
    button1.addActionListener(new ButtonListener());

    button2 = new JRadioButton("Show Image Green");
  panel.add(button2);
  group.add(button2);
    button2.addActionListener(new ButtonListener());

    button3 = new JRadioButton("Show Image Blue");
  panel.add(button3);
  group.add(button3);
    button3.addActionListener(new ButtonListener());

    button4 = new JRadioButton("Reset");
  panel.add(button4);
  group.add(button4);
    button4.addActionListener(new ButtonListener());
    container.add(BorderLayout.NORTH, panel);

    addWindowListener(new WindowAdapter() {
      public void windowClosing(WindowEvent e) {
        System.exit(0);
      }
    });
  setSize(350,200);
    setVisible(true);
  }
    public static void main(String args[]) {
    new ImageEffectExample();
  }
    class ButtonListener implements ActionListener {
    public void actionPerformed(ActionEvent e) {
      JRadioButton button = (JRadioButton) e.getSource();
      if (button.equals(button1)) {
        spanel.combine(ShowPanel.RED_MATRIX);
        spanel.repaint();
      } else if (button.equals(button2)) {
        spanel.combine(ShowPanel.GREEN_MATRIX);
        spanel.repaint();
      } else if (button.equals(button3)) {
        spanel.combine(ShowPanel.BLUE_MATRIX);
        spanel.repaint();
      } else if (button.equals(button4)) {
        spanel.reset();
        spanel.repaint();
      }
    }
  }
}
class ShowPanel extends JLabel {
  static final float RED_MATRIX[][] = { { 2.0f, 0.0f, 0.0f },
      { 0.0f, 0.0f, 0.0f }, { 0.0f, 0.0f, 0.0f } };
  static final float GREEN_MATRIX[][] = { { 0.0f, 0.0f, 0.0f },
      { 0.0f, 2.0f, 0.0f }, { 0.0f, 0.0f, 0.0f } };
  static final float BLUE_MATRIX[][] = { { 0.0f, 0.0f, 0.0f },
      { 0.0f, 0.0f, 0.0f }, { 0.0f, 0.0f, 2.0f } };
Image image;
BufferedImage bufferedImage1;
BufferedImage bufferedImage2;
Raster raster;
WritableRaster writableRaster;
BufferedImage bufferedImage;
Graphics2D g2d;

ShowPanel() {
    loadImage();
    setSize(image.getWidth(this), image.getWidth(this));
    createImages();
    bufferedImage = bufferedImage1;
  }
  public void loadImage() {
    image = Toolkit.getDefaultToolkit().getImage("alert.gif");
    MediaTracker mediaTracker = new MediaTracker(this);
    mediaTracker.addImage(image, 1);
    try {
      mediaTracker.waitForAll();
    } catch (Exception e) {}
    }

  public void createImages() {
    bufferedImage1 = new BufferedImage(image.getWidth(this), image.getHeight(this), BufferedImage.TYPE_INT_RGB);
    g2d = bufferedImage1.createGraphics();
    g2d.drawImage(image, 0, 0, this);
    raster = bufferedImage1.getRaster();
    bufferedImage2 = new BufferedImage(image.getWidth(this), image
        .getHeight(this), BufferedImage.TYPE_INT_RGB);
    writableRaster = (WritableRaster) bufferedImage2.getRaster();
  }
    public void combine(float[][] combineMatrix) {
    BandCombineOp band = new BandCombineOp(combineMatrix, null);
    band.filter(raster, writableRaster);
    bufferedImage = bufferedImage2;
  }
 public void reset() {
    g2d.setColor(Color.black);
    g2d.clearRect(0, 0, bufferedImage.getWidth(this), bufferedImage.
       getHeight(this));
    g2d.drawImage(image, 0, 0, this);
    bufferedImage = bufferedImage1;
  }
    public void paintComponent(Graphics g) {
    super.paintComponent(g);
    Graphics2D g2D = (Graphics2D) g;
    g2D.drawImage(bufferedImage, 0, 0, this);
  }
} 