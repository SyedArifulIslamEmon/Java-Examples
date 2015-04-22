
public class Bruteforces {

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
		for (int i = 0; i < n-m; i++) {
			int j = 0;
			while (j < m && text[i+j] == pattern[j]) {
				j++;
			}
			if (j == m) return i;
		}
		return -1;
	}
}


