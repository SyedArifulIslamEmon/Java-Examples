import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.nio.channels.OverlappingFileLockException;


public class Tests {
	public static void main (String args[]) throws IOException{
		
		
		File file = new File("C:/Users/User/Desktop/S.txt");
		FileChannel channel = new RandomAccessFile(file, "rw").getChannel();
		// Get an exclusive lock on the whole file
		FileLock lock = channel.lock();
		try {
		    lock = channel.tryLock();
		    // Ok. You get the lock
		} catch (OverlappingFileLockException e) {
		    // File is open by someone else
		} finally {
		    lock.release();
		}
	}

}
