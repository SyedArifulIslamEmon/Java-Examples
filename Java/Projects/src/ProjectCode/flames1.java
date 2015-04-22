package ProjectCode;


import java.awt.*;
import javax.swing.*;
import java.io.*;

class flam
{
  static int a_count[]=new int[30];
  static int b_count[]=new int[30];
}

class  flames1
{
  public static void main(String args[])
  {
   String s1,s2;
   int i,j,len,sum=0;
   int result[]=new int[30];
   char str1[],str2[];
   s1=JOptionPane.showInputDialog("Enter name of the Boy");
   s2=JOptionPane.showInputDialog("Enter name of the Girl:");
   str1=s1.toCharArray();
   str2=s2.toCharArray();
   flam ob=new flam();

   for(i=0;i<s1.length();i++)
   {
    if(str1[i]=='A' || str1[i]=='a')
    {
     ob.a_count[0]++;
    }

    else
    if(str1[i]=='B' || str1[i]=='b')
    {
     ob.a_count[1]++;
    }

    else
    if(str1[i]=='C' || str1[i]=='c')
    {
     ob.a_count[2]++;
    }

    else
    if(str1[i]=='D' || str1[i]=='d')
    {
     ob.a_count[3]++;
    }

    else
    if(str1[i]=='E' || str1[i]=='e')
    {
     ob.a_count[4]++;
    }

    else
    if(str1[i]=='F' || str1[i]=='f')
    {
     ob.a_count[5]++;
    }

    else
    if(str1[i]=='G' || str1[i]=='g')
    {
     ob.a_count[6]++;
    }

    else
    if(str1[i]=='H' || str1[i]=='h')
    {
     ob.a_count[7]++;
    }
    else
    if(str1[i]=='I' || str1[i]=='i')
    {
     ob.a_count[8]++;
    }

    else
    if(str1[i]=='J' || str1[i]=='j')
    {
     ob.a_count[9]++;
    }
    else
    if(str1[i]=='K' || str1[i]=='k')
    {
     ob.a_count[10]++;
    }

    else
    if(str1[i]=='L' || str1[i]=='l')
    {
     ob.a_count[11]++;
    }
    else
    if(str1[i]=='M' || str1[i]=='m')
    {
     ob.a_count[12]++;
    }

    else
    if(str1[i]=='N' || str1[i]=='n')
    {
     ob.a_count[13]++;
    }
    else
    if(str1[i]=='O' || str1[i]=='o')
    {
     ob.a_count[14]++;
    }

    else
    if(str1[i]=='P' || str1[i]=='p')
    {
     ob.a_count[15]++;
    }

    else
    if(str1[i]=='Q' || str1[i]=='q')
    {
     ob.a_count[16]++;
    }

    else
    if(str1[i]=='R' || str1[i]=='r')
    {
     ob.a_count[17]++;
    }

    else
    if(str1[i]=='S' || str1[i]=='s')
    {
     ob.a_count[18]++;
    }
    else
    if(str1[i]=='T' || str1[i]=='t')
    {
     ob.a_count[19]++;
    }

    else
    if(str1[i]=='U' || str1[i]=='u')
    {
     ob.a_count[20]++;
    }

    else
    if(str1[i]=='V' || str1[i]=='v')
    {
     ob.a_count[21]++;
    }

    else
    if(str1[i]=='W' || str1[i]=='w')
    {
     ob.a_count[22]++;
    }

    else
    if(str1[i]=='X' || str1[i]=='x')
    {
     ob.a_count[23]++;
    }

    else
    if(str1[i]=='Y' || str1[i]=='y')
    {
     ob.a_count[24]++;
    }

    else
    if(str1[i]=='Z' || str1[i]=='z')
    {
     ob.a_count[25]++;
    }
  }


  for(i=0;i<s2.length();i++)
  {
    if(str2[i]=='A' || str2[i]=='a')
    {
     ob.b_count[0]++;
    }

    else
    if(str2[i]=='B' || str2[i]=='b')
    {
     ob.b_count[1]++;
    }

    else
    if(str2[i]=='C' || str2[i]=='c')
    {
     ob.b_count[2]++;
    }

    else
    if(str2[i]=='D' || str2[i]=='d')
    {
     ob.b_count[3]++;
    }

    else
    if(str2[i]=='E' || str2[i]=='e')
    {
     ob.b_count[4]++;
    }

    else
    if(str2[i]=='F' || str2[i]=='f')
    {
     ob.b_count[5]++;
    }

    else
    if(str2[i]=='G' || str2[i]=='g')
    {
     ob.b_count[6]++;
    }

    else
    if(str2[i]=='H' || str2[i]=='h')
    {
     ob.b_count[7]++;
    }
    else
    if(str2[i]=='I' || str2[i]=='i')
    {
     ob.b_count[8]++;
    }

    else
    if(str2[i]=='J' || str2[i]=='j')
    {
     ob.b_count[9]++;
    }
    else
    if(str2[i]=='K' || str2[i]=='k')
    {
     ob.b_count[10]++;
    }

    else
    if(str2[i]=='L' || str2[i]=='l')
    {
     ob.b_count[11]++;
    }
    else
    if(str2[i]=='M' || str2[i]=='m')
    {
     ob.b_count[12]++;
    }

    else
    if(str2[i]=='N' || str2[i]=='n')
    {
     ob.b_count[13]++;
    }
    else
    if(str2[i]=='O' || str2[i]=='o')
    {
     ob.b_count[14]++;
    }

    else
    if(str2[i]=='P' || str2[i]=='p')
    {
     ob.b_count[15]++;
    }

    else
    if(str2[i]=='Q' || str2[i]=='q')
    {
     ob.b_count[16]++;
    }

    else
    if(str2[i]=='R' || str2[i]=='r')
    {
     ob.b_count[17]++;
    }

    else
    if(str2[i]=='S' || str2[i]=='s')
    {
     ob.b_count[18]++;
    }
    else
    if(str2[i]=='T' || str2[i]=='t')
    {
     ob.b_count[19]++;
    }

    else
    if(str2[i]=='U' || str2[i]=='u')
    {
     ob.b_count[20]++;
    }

    else
    if(str2[i]=='V' || str2[i]=='v')
    {
     ob.b_count[21]++;
    }

    else
    if(str2[i]=='W' || str2[i]=='w')
    {
     ob.b_count[22]++;
    }

    else
    if(str2[i]=='X' || str2[i]=='x')
    {
     ob.b_count[23]++;
    }

    else
    if(str2[i]=='Y' || str2[i]=='y')
    {
     ob.b_count[24]++;
    }

    else
    if(str2[i]=='Z' || str2[i]=='z')
    {
     ob.b_count[25]++;
    }
  }



   for(i=0;i<26;i++)
   result[i]=Math.abs(ob.a_count[i]-ob.b_count[i]);

   for(i=0;i<26;i++)
   sum=sum+result[i];


   if(sum==1)
   JOptionPane.showMessageDialog(null,"SISTER","The Relationshipis",JOptionPane.INFORMATION_MESSAGE);
   else
   if(sum==2 || sum==4 || sum==7 || sum==9)
   JOptionPane.showMessageDialog(null,"ENEMIES","The Relationshipis",JOptionPane.INFORMATION_MESSAGE);
   else
   if(sum==3 || sum==5 || sum==14)
   JOptionPane.showMessageDialog(null,"FRIENDS","The Relationshipis",JOptionPane.INFORMATION_MESSAGE);
   else
   if(sum==6 || sum==11 || sum==15)
   JOptionPane.showMessageDialog(null,"MARRIAGE","The Relationshipis",JOptionPane.INFORMATION_MESSAGE);
   else
   if(sum==10)
   JOptionPane.showMessageDialog(null,"LOVE","The Relationshipis",JOptionPane.INFORMATION_MESSAGE);
   else
   if(sum==8 || sum==12 || sum==13)
   JOptionPane.showMessageDialog(null,"AFFECTION","The Relationshipis",JOptionPane.INFORMATION_MESSAGE);
   else
   JOptionPane.showMessageDialog(null,"Not available in this Version");
   System.exit(0);
 }
}

