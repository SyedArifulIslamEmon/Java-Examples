
class Unicode{
public static void main(String[] args){

// character array of unicode
char set1[]={"\u0c05".charAt(0),"\u0c06".charAt(0) };

char set2[]={"\u0c05".charAt(0),"\u0c06".charAt(0) };

// conversion into string
String str1= new String (set1);

String str2= new String( set2 );

// compare two strings
System.out.println(str1.equals(str2));

}
}
