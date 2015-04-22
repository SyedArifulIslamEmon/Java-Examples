

public class BF {

	private char[] text;
	private char[] pattern;
	private int n;
	private int m;
	
	public void setString(String t, String p) {
		this.text = t.toCharArray();
		this.pattern = p.toCharArray();
		this.n = t.length();
		this.m = p.length();
	}
	
	public int search() {
		int i,j;
		for (i = 0,j=0; j<n&&i < m; i++) 
		if(text[i]!=pattern[j]){
			
			i-=j-1;
			j=-1;
		}
		if(j==m){
		return i-m;	
			
		}
		else {
			return i;
		}
	
}
}
