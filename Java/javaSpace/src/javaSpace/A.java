package javaSpace;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class A {
	public static void main (String args[]) throws NoSuchAlgorithmException{
		
		
	    String toEnc = "123456"; // Value to encrypt  
	    MessageDigest mdEnc = MessageDigest.getInstance("MD5"); // Encryption algorithm  
	    mdEnc.update(toEnc.getBytes(), 0, toEnc.length());  
	    String md5 = new BigInteger(1, mdEnc.digest()).toString(16);
	    
	    System.out.println(md5);
	}

}
