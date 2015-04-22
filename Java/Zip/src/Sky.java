
import java.awt.Robot;
import java.awt.event.KeyEvent;

public class Sky {

    static int keyInput[] = { KeyEvent.VK_J, KeyEvent.VK_A, KeyEvent.VK_V,
            KeyEvent.VK_A, KeyEvent.VK_SPACE };

    public static void main(String[] args) throws Exception {
    	Runtime runtime = Runtime.getRuntime();
    	//runtime.exec(""C:\Program Files (x86)\Notepad++\notepad++.exe"");
        Runtime.getRuntime().exec("C:/Program Files (x86)/Notepad++/notepad++.exe");
}
}