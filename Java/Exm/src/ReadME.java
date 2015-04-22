public class ReadME {
	public static void main(String[] args) {

		String str1 = "               SSssds    gfggh dfdfdf ".trim();
int x=0,y=0;
		int Count = 0;
		System.out.println(str1);

		for (int i = 0; i < str1.length(); i++) {
			if (str1.charAt(i)!=' ') {
				y++;
				
			}
			if (y==1) {
				Count++;
			}

			if (str1.charAt(i) == ' ') {
				
				if (str1.charAt(i + 1) != ' ') {
Count--;
					x++;
					Count++;

				}
				if (x==1) {
					Count++;
				}

			}
			

		}
		
		System.out.println("number of word is -------------> " + Count);
		for (int j = 0; j < str1.length(); j++) {

			System.out.print(str1.charAt(j));
			if (str1.charAt(j) == ' ') {
				if (str1.charAt(j + 1) != ' ') {
					System.out.println();

				}

			}

		}
	}
}

