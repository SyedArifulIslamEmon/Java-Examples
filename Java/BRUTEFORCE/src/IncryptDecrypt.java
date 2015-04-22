
import javax.crypto.*;
25: import java.security.*;
26: public class IncryptDecrypt
27: {
28:    private static SecretKey key = null;         // in java.security
29:    private static Cipher cipher = null;         // in javax.crypto
30: 
31:    /*
32:     * Lots of exceptions can be thrown here.  I've chosen
33:     * not to deal with them and just let the application
34:     * fail.  These exceptions are:
35:     *                              javax.crypto.IllegalBlockException
36:     *                              javax.crypto.BadPaddingException
37:     *                              java.securty.InvalidKeyException
38:     */
39: 
40:    public static void main(String[] args) throws Exception
41:    {
42:       // This statement is not needed since the SunJCE is
43:       // (statically) installed as of SDK 1.4.  Do this to
44:       // dynamically install another provider.
45: 
46:       Security.addProvider(new com.sun.crypto.provider.SunJCE());
47: 
48:       // Generate a secret key for a symmetric algorithm and
49:       // create a Cipher instance. DESede key size is always
50:       // 168 bits. Other algorithms, like "blowfish", allow
51:       // for variable length keys.
52: 
53:       KeyGenerator keyGenerator =
54:          KeyGenerator.getInstance("DESede");
55:       keyGenerator.init(168);
56:       SecretKey secretKey = keyGenerator.generateKey();
57:       cipher = Cipher.getInstance("DESede");
58: 
59:       // Store the string as an array of bytes.  You should
60:       // specify the encoding method for consistent encoding
61:       // and decoding across different platforms.
62: 
63:       String clearText = "I sure love working with the JCE.";
64:       byte[] clearTextBytes = clearText.getBytes("UTF8");
65: 
66:       // Initialize the cipher and encrypt this byte array
67: 
68:       cipher.init(Cipher.ENCRYPT_MODE, secretKey);
69:       byte[] cipherBytes = cipher.doFinal(clearTextBytes);
70:       String cipherText = new String(cipherBytes, "UTF8");
71: 
72:       // Reinitialize the cipher an decrypt the byte array
73: 
74:       cipher.init(Cipher.DECRYPT_MODE, secretKey);
75:       byte[] decryptedBytes = cipher.doFinal(cipherBytes);
76:       String decryptedText = new String(decryptedBytes, "UTF8");
77: 
       System.out.println("Before encryption: " + clearText);
       System.out.println("After encryption: " + cipherText);
       System.out.println("After decryption: " + decryptedText);
    }
 }