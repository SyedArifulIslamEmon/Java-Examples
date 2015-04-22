package LCS;

public class LCS {

	private String str1, str2;

	private int arry1[][];

	private char arry2[][];

	private int len1, len2, i, j;

	private String subString = "";

	LCS(String str1, String str2) {

		this.str1 = str1;

		this.str2 = str2;

	}

	public void AllZero() {

		len1 = str1.length();

		len2 = str2.length();

		arry1 = new int[len1 + 1][len2 + 1];

		arry2 = new char[len1 + 1][len2 + 1];

		for (i = 0; i <= len1; i++) {

			arry1[i][0] = 0;

		}

		for (j = 0; j <= len2; j++) {

			arry1[0][j] = 0;

		}

	}

	public String lCSfind() {

		for (i = 1; i <= len1; i++) {

			for (j = 1; j <= len2; j++) {

				if (str1.charAt(i - 1) == str2.charAt(j - 1)) {

					arry1[i][j] = arry1[i - 1][j - 1] + 1;

					arry2[i][j] = 'A';

				}

				else if (arry1[i - 1][j] >= arry1[i][j - 1]) {

					arry1[i][j] = arry1[i - 1][j];

					arry2[i][j] = 'B';

				}

				else {

					arry1[i][j] = arry1[i][j - 1];

					arry2[i][j] = 'C';

				}

			}

		}
		i = len1;
		j = len2;

		while (i != 0 && j != 0) {

			if (arry2[i][j] == 'A') {

				subString = str1.charAt(i - 1) + subString;

				i = i - 1;

				j = j - 1;

			}

			if (arry2[i][j] == 'B') {

				i = i - 1;

			}

			if (arry2[i][j] == 'C') {

				j = j - 1;

			}

		}

		return subString;

	}
}
