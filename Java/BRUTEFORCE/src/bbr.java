

public class bbr{
		public static void main(String[] args)
		{
			String foo = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
			int nfoos = foo.length();
			int i=4,j,k;
			char[] ca1=new char[i];
			for(j=0;j<i;j++)
				ca1[j]='a';
			
			String s1=new String(ca1);
			System.out.println(s1 + nfoos);
			
			for(j=i-1;j>=0;j--)
				{
					for(k=0;k<nfoos;k++)
					{	ca1[j]=foo.charAt(k);
						s1=String.copyValueOf(ca1);
						System.out.println(s1);
						}
					i--;
				}
				
			
		}
}