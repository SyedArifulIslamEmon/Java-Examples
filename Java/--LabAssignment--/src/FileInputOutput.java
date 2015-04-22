import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;


public class FileInputOutput {
	static int i,n;

	public static void main(String[] args) throws IOException {
		int number, s, carry, j;
		int arr[] = new int[20000];

		Scanner in = new Scanner(new File("C:/Users/User/workspace/--LabAssignment--/src/InputFile"));
		
		PrintWriter out = new PrintWriter(new FileWriter("C:/Users/User/workspace/--LabAssignment--/src/OutputFile"));
		n=in.nextInt();
		while (in.hasNext()) {
			number=in.nextInt();
			
			arr[i++] = number;
			
		}
		for (j = 1; j <= n; j++) {
			s = j;

			while (s > 0 && arr[s] < arr[s - 1]) {
				carry = arr[s];
				arr[s] = arr[s - 1];
				arr[s - 1] = carry;

				s--;
			}
		}
		out.print("Ascending order :-  l");
		for (int l = 0; l <n; l++) {
			out.print(" "+arr[l]);

		}
		out.print("\r\n");
		for (j = 1; j <= n; j++) {
			s = j;

			while (s > 0 && arr[s] > arr[s - 1]) {
				carry = arr[s];
				arr[s] = arr[s - 1];
				arr[s - 1] = carry;

				s--;
			}
		}
		out.print("********** Descending order ************\r\n\t   ");
		for (int l = 1; l <=n; l++) {
			out.print(" "+arr[l]);

		}
	
		out.close();
	}

}
