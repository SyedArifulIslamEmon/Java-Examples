package InputFiles;

import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.ClipboardOwner;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.Transferable;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

public class JavaToSystemClipboard {

public static void main(final String[] args) throws Exception {
    final File fileOut = new File("C:/Users/User/Desktop/T.tx");
    putFileToSystemClipboard(fileOut);

}

public static void putFileToSystemClipboard(final File fileOut) throws Exception {
    final Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
    final ClipboardOwner clipboardOwner = null;

    final Transferable transferable = new Transferable() {
        public boolean isDataFlavorSupported(final DataFlavor flavor) {
            return false;
        }
        public DataFlavor[] getTransferDataFlavors() {
            return new DataFlavor[] { DataFlavor.javaFileListFlavor, DataFlavor.stringFlavor };
        }
        public Object getTransferData(final DataFlavor flavor) {
            if (flavor.equals(DataFlavor.javaFileListFlavor)) {
                final List<String> list = new ArrayList<>();
                list.add(fileOut.getAbsolutePath());
                return list;
            }
            if (flavor.equals(DataFlavor.stringFlavor)) {
                return fileOut.getAbsolutePath();
            }
            return null;
        }
    };
    clipboard.setContents(transferable, clipboardOwner);
}
}
