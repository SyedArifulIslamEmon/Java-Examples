
public class bd {

/**
* @param args
*/
public static void main(String[] args) {
String myName;
myName = new String("deeptomoy bhattacharjee");

prln("This is our newMethod");
prln(myName);
prln("\nthe number of chacter in my name is:"+myName.length());

int twoDarray[][]=new int [3][7]; //akane error show kore
twoDarray[0][0]=1;
twoDarray[0][1]=2;
twoDarray[0][2]=4;
twoDarray[0][3]=5;

twoDarray[1][0]=2;
twoDarray[1][1]=4;
twoDarray[1][2]=6;
twoDarray[1][3]=9;

twoDarray[1][2]+=twoDarray[0][2]+twoDarray[0][3];
prln("at twoDarray[1][2]:"+twoDarray[1][2]);


//1 2 4 5
//2 4 6 9
}

static void prln(Object anyObject){
System.out.println(anyObject);
}

static void pr(Object anyObject){
System.out.println(anyObject);
}
}