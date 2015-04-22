
import java.io.File;
 
public class DiskSpaceDetail
{
    public static void main(String[] args)
    
    {
    	String s1="C:";
    	File file = new File(s1);
    	long totalSpace1 = file.getTotalSpace();
    	
    	long freeSpace1 = file.getFreeSpace(); 
 
    	System.out.println("---------HardDisk Details ------------------");
 
    	System.out.println("----------------bytes--"+s1+"--Drive------------------");
    	System.out.println("Total size : " + totalSpace1 + " bytes");
    	System.out.println("Use Space : " + (totalSpace1-freeSpace1) + " bytes");
    	System.out.println("Space free : " + freeSpace1 + " bytes");
 
    	System.out.println(" ----------------MB--"+s1+"---Drive -------------");
    	System.out.println("Total size : " + (double)totalSpace1 /1024 /1024 + "MB");
    	System.out.println("Use Space : " + (double)(totalSpace1-freeSpace1) /1024 /1024 + "MB");
    	System.out.println("Space free : " + (double)freeSpace1 /1024 /1024 + "MB");
    	System.out.println(" ------------------GB--"+s1+"---Drive -------------");
    	System.out.println("Total size : " + (double)totalSpace1 /1024 /1024/1024 + " GB");
    	System.out.println("Use Space : " + (double)(totalSpace1-freeSpace1) /1024 /1024/1024 + " GB");
    	System.out.println("Space free : " + (double)freeSpace1 /1024 /1024/1024 + "GB");
    	
    	
    	String s2="D:";
    	File file1 = new File(s2);
    	long totalSpace2 = file1.getTotalSpace();
    	
    	long freeSpace2 = file1.getFreeSpace(); 
 
    
 
    	System.out.println("----------------bytes--" +s2+"--Drive------------------");
    	System.out.println("Total size : " + totalSpace2 + " bytes");
    	System.out.println("Use Space  : " + (totalSpace2-freeSpace2) + " bytes");
    	System.out.println("Space free : " + freeSpace2 + " bytes");
 
    	System.out.println(" ----------------MB--"+s2+"--Drive -------------");
    	System.out.println("Total size : " + (double)totalSpace2 /1024 /1024 + "MB");
    	System.out.println("Use Space : " + (double)(totalSpace2-freeSpace2) /1024 /1024 + "MB");
    	System.out.println("Space free : " + (double)freeSpace2 /1024 /1024 + "MB");
    	System.out.println(" ------------------GB--"+s2+"--Drive-------------");
    	System.out.println("Total size : " + (double)totalSpace2 /1024 /1024/1024 + " GB");
    	System.out.println("Use Space : " + (double)(totalSpace2-freeSpace2) /1024 /1024/1024 + " GB");
    	System.out.println("Space free : " + (double)freeSpace2 /1024 /1024/1024 + "GB");
    }
}
