package InputFiles;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class WriteMiddle {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		RandomAccessFile f = new RandomAccessFile(new File("C:/Users/User/Desktop/S.txt"), "rw");
	    long aPositionWhereIWantToGo = 99;
	    f.seek(aPositionWhereIWantToGo); // this basically reads n bytes in the file
	    f.write("Im in teh fil, writn bites".getBytes());
	    f.close();
	}

}
