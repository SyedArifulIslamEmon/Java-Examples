

import java.util.EnumSet;

public class EnumTest {

	public static void main(String[] args) {
		System.out.println("----------All Print----------");
		for(Book book: Book.values()){
			System.out.printf("%-10s%-45s%s\n",book,book.getBookName(),book.getCopyWrite());
		}
		
		
		System.out.println("-----Print first four Book-------");
		for(Book book :EnumSet.range(Book.JHTP, Book.VBHTP))
			System.out.printf("%-10s%-45s%s\n",book,book.getBookName(),book.getCopyWrite());
				

	}

}

 enum Book {
	JHTP( "Java How to Program", "2012" ),
	CHTP( "C How to Program", "2007" ),
	IW3HTP( "Internet & World Wide Web How to Program", "2008" ),
	CPPHTP( "C++ How to Program", "2012" ),
	VBHTP( "Visual Basic 2010 How to Program", "2011" ),
	CSHARPHTP( "Visual C# 2010 How to Program", "2011" );
	
	private final String BookName,Copywrite;
	
	 Book(String Bname,String cw){
		BookName =Bname;
		Copywrite = cw;
	}
	 public String getBookName(){
		 return BookName;
	 }
	 public String getCopyWrite(){
		 return Copywrite;
	 }

}
