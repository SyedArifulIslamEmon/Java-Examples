
    import java.awt.*;  
    import java.util.*;  
    import java.lang.reflect.Field;  
    import java.awt.event.*;  
    import javax.swing.*;  
      
    public class RobotCharacter {  
        public static void main(String[] args) throws Exception {  
            JTextField textField = new JTextField(10);  
            JFrame frame = new JFrame();  
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
            frame.add(textField);  
            frame.pack();  
            frame.setLocationRelativeTo(null);  
            frame.setVisible(true);  
      
            parseChars("Hello! How are you?");  
            Thread.sleep(1000);  
            textField.setText("");  
            parseChars("Well, thanks.");  
              
         }  
      
         public static void parseChars(String letter) {  
         for (int i = 0; i < letter.length(); i ++) {  
         char chary = letter.charAt(i);  
         typeCharacter(Character.toString(chary));  
         }  
         }  
        public static void typeCharacter(String letter) {  
        Robot robot = null;  
        try { robot = new Robot(); }  
        catch (Exception ex) { ex.printStackTrace(); }  
        if (Character.isLetter(letter.charAt(0))) {  
            try {  
                boolean upperCase = Character.isUpperCase(letter.charAt(0));  
                String variableName = "VK_" + letter.toUpperCase();  
      
                KeyEvent ke = new KeyEvent(new JTextField(), 0, 0, 0, 0, ' ');  
                Class clazz = ke.getClass();  
                Field field = clazz.getField(variableName);  
                int keyCode = field.getInt(ke);  
                  
                System.out.println(keyCode + " = keyCode");  
      
                robot.delay(80);  
      
                if (upperCase) robot.keyPress(KeyEvent.VK_SHIFT);  
      
                robot.keyPress(keyCode);  
                robot.keyRelease(keyCode);  
      
                if (upperCase) robot.keyRelease(KeyEvent.VK_SHIFT);  
            }  
            catch(Exception e) { System.out.println(e); }  
            }  
            else {  
            if (letter.equals(".")) {  
                robot.keyPress(KeyEvent.VK_PERIOD); //keyCode 46  
                robot.keyRelease(KeyEvent.VK_PERIOD);  
                }  
                else if (letter.equals("!")) {  
                robot.keyPress(KeyEvent.VK_SHIFT); //keyCode 16  
                robot.keyPress(KeyEvent.VK_1); //keycode 49  
                robot.keyRelease(KeyEvent.VK_1);  
                robot.keyRelease(KeyEvent.VK_SHIFT);  
                }  
                else if (letter.equals(" ")) {  
                robot.keyPress(KeyEvent.VK_SPACE);  
                robot.keyRelease(KeyEvent.VK_SPACE);  
                }  
                else if (letter.equals("?")) {  
                robot.keyPress(KeyEvent.VK_SHIFT); //keyCode 16  
                robot.keyPress(KeyEvent.VK_SLASH); //keyCode 47  
                robot.keyRelease(KeyEvent.VK_SLASH);  
                robot.keyRelease(KeyEvent.VK_SHIFT);  
                }  
                else if (letter.equals(",")) {  
                robot.keyPress(KeyEvent.VK_COMMA);  
                robot.keyRelease(KeyEvent.VK_COMMA);  
                }  
            }  
        }  
    }  