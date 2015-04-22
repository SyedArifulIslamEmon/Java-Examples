
	

    import java.util.Scanner;
     
    public class Password {
     
            public static void main(String[] args) {
     
    //              set for 5 char password
    //              char[] word = { 'a', 'a', 'a', 'a', 'a' };
                   
                    Scanner in = new Scanner(System.in);
                    System.out.println("Write your password (5 character only)");
                    String password = in.nextLine();
                   
                    // for any length password
                    char[] word = password.toCharArray();
                   
                    // init 'word' to 'a ... a'
                    for (int i = 0; i < word.length; i++) {
                            word[i] = 'a';
                    }
     
                   
                    for (int i = 0; i < password.length(); i++){
                            for (int j = 48; j < 122; j++) {
                                    // for just 'a-z' you can change the for loop
                                    // to j = 0; j < 26; j++ and (int) j + i to
                                    // word[i] + 1
                                   
                                    // '48' is 0 in ASCII, '57' is 9
                                    // '65' is 'A', '90' is 'z'
                                    // '97' is 'a', '122' is 'z'
                                    if (word[i] == password.charAt(i)) {
                                            break; // break out of inside 'for' loop
                                    } else {
                                            word[i] = (char)((int) j + 1);
                                    }
                            }
                    }
                    System.out.println("Your password is: ");
                    // for-each loop, just iterates over word storing
                    // the index char into letter then printing it out
                    for (char letter : word) {
                            System.out.print(letter);
                    }
            }
     
    }


