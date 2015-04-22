

    import java.*;  
    public class Brutus {  
      
    char[] canUse = {  
    '0','1','2','3','4','5','6','7','8','9',  
    'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'  
    };  
      
    int maxlen = 2;  
    String code = "aaa";  
        public static void main (String[] args) {  
      
            Brutus b = new Brutus();  
        }  
          
      
        public Brutus() {  
        int k = 0;  
      
        while (k < canUse.length) {  
            nextString(new Character(canUse[k]).toString());  
            k++;  
        }  
      
        }  
      
      
        private void nextString(String s) {  
      
        int i = 0;  
      
        System.out.println(s);  
    try{  
        while (i< canUse.length) {  
            System.out.println(s + new Character(canUse[i]).toString());  
              
            if (new String(s + new Character(canUse[i]).toString()).length() <= maxlen) {nextString(s + new Character(canUse[i]).toString());}  
            i++;  
                    if (code == s + new Character(canUse[i]).toString()){  
                        System.out.println("This is the password");  
                    }else{  
                        System.out.println("This in not the password , try again");  
                    }  
        }  
    }catch(Exception e){  
        System.out.println("Exception raised");  
    }  
        }  
    }  