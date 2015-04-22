package javaSpace;

import java.security.spec.AlgorithmParameterSpec;  
import javax.crypto.Cipher;  
import javax.crypto.spec.IvParameterSpec;  
import javax.crypto.spec.SecretKeySpec;  
import sun.misc.BASE64Decoder;  

  public class testDecrypt {  

/*  Mode = CipherMode.CBC,-( Cipher-block chaining) 
  Padding = PaddingMode.PKCS7 or PKCS5, 
  KeySize = 128, 
  BlockSize = 128, 
  Key = keyBytes, 
  IV = keyBytes */  

   Cipher cipher;   

  // Input encrypted String  
  static  String input = "sw0SrUIKe0DmS7sRd9+XMgtYg+BUiAfiOsdMw/Lo2RA=";  

 // password to decrypt 16 bit  
  final static String strPassword = "password12345678";  

 // put this as key in AES  
 static SecretKeySpec key = new SecretKeySpec(strPassword.getBytes(), "AES");  


 public static void main(String args []) throws Exception{  

  AlgorithmParameterSpec paramSpec = new IvParameterSpec(strPassword.getBytes());   
  //Whatever you want to encrypt/decrypt using AES /CBC padding  
  Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");  

  //You can use ENCRYPT_MODE or DECRYPT_MODE   
   cipher.init(Cipher.DECRYPT_MODE, key, paramSpec);    

   //decode data using standard decoder  
   byte[] output =  new BASE64Decoder().decodeBuffer(input);    

     // Decrypt the data   
   byte[] decrypted = cipher.doFinal(output);  

   System.out.println("Original string: " +  
           new String(input));  

   // decryptedData .;  
   System.out.println("Decrypted string: " +  
   new String(decrypted));      

 }  

}  


