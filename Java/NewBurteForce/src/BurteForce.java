public class BurteForce {

	private char s1[]=new char[100];

	private char s2[]=new char[100];

	int len1, len2;

	BurteForce(String s1, String s2) {

		this.s1 = s1.toCharArray();

		this.s2 = s2.toCharArray();

	}

	public int Stringmatch() {
		len1=s1.length;
		len2=s2.length;
		for (int i = 0; i <= len1; i++) {
			int j = 0;
			while (j < len2 && s1[i+j] == s2[j]) {
				j++;
			}
			if (j == len2){
				
				return i;
			}
		}
		return -1;
	}

}
