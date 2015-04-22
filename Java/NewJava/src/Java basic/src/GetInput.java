

	import java.util.Scanner;
	 
	class GetInput
	{
	   public static void main(String args[])
	   {
	      int a;
	      float b;
	      String s;
	 
	      Scanner n = new Scanner(System.in);
	 
	      System.out.println("Enter a string");
	      s = n.nextLine();
	      System.out.println("You entered string "+s);
	 
	      System.out.println("Enter an integer");
	      a = n.nextInt();
	      System.out.println("You entered integer "+a);
	 
	      System.out.println("Enter a float");
	      b = n.nextFloat();
	      System.out.println("You entered float "+b);  
	      System.out.println("Enter a string");
	      s = n.nextLine();
	      s = n.nextLine();
	      System.out.println("You entered string "+s);
	   }
	}


