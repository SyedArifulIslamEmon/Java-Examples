
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Filoes {
	static int i,n;

	public static void main(String[] args) throws IOException {
		int num, k, temp, j;
		int array[] = new int[100];

		Scanner in = new Scanner(new File("C:/Users/User/workspace/Lab/src/input"));
		PrintWriter out = new PrintWriter(new FileWriter("C:/Users/User/workspace/Lab/src/output"));
		n=in.nextInt();
		while (in.hasNext()) {
			num = in.nextInt();
			
			array[i++] = num;
			
		}
		for (j = 1; j <= n; j++) {
			k = j;

			while (k > 0 && array[k] < array[k - 1]) {
				temp = array[k];
				array[k] = array[k - 1];
				array[k - 1] = temp;

				k--;
			}
		}
		out.print("Ascending order----->");
		for (int l = 0; l <n; l++) {
			out.print(" "+array[l]);

		}
		out.print("\r\n");
		for (j = 1; j <= n; j++) {
			k = j;

			while (k > 0 && array[k] > array[k - 1]) {
				temp = array[k];
				array[k] = array[k - 1];
				array[k - 1] = temp;

				k--;
			}
		}
		out.print("Descending order---->");
		for (int l = 0; l <n; l++) {
			out.print(" "+array[l]);

		}
	
		out.close();
	}

}
