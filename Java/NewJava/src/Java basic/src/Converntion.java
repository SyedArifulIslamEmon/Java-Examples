
public class Converntion {
public static void main (String args[]){
	byte b;
	int i=257;
	double d=323.45656;
	
	b=(byte)i;
	System.out.println("i int  con byte-->"+i+"b byte"+b);
	i=(int)d;
	System.out.println("d  double con int--->"+d+"i int"+i);
	b=(byte)d;
	System.out.println("d double con to"+d+"b byte"+b);
	
}
}
