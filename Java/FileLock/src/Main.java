

import java.io.File;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;

public class Main {
  public static void main(String[] argv) throws Exception {
    File file = new File("C:/Users/User/Desktop/Algo site.txt");
    FileChannel channel = new RandomAccessFile(file, "rw").getChannel();

    FileLock lock = channel.lock();

    lock = channel.tryLock();

    lock.release();

    channel.close();
  }
}