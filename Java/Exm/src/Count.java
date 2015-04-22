
public class Count
{
    public static void main (String[] args)
    {

         

//            String str1= null;//"  java    ".trim();

            int Count = 1;
//          System.out.println(args);
//str1 = args[0];
            for (int i = 0; i < args[0].length(); i++) 
            {
            	System.out.print(args[0].charAt(i));
                if (args[0].charAt(i) == ' ') 
                {
                	if (args[0].charAt(i+1)!=' ') {
                		System.out.println();
                		Count++;
                	
					}
                    
                   
                } 
              
              }

            System.out.println("\nnumber of word is -------------> " + Count);
    }
}
