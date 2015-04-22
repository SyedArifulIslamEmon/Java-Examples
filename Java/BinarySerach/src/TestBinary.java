import java.util.Scanner;

public class TestBinary {

	public static void main(String args[]) {

		int arr[] = new int[100];
		Scanner nScanner = new Scanner(System.in);

		System.out.println("How many number you intput array");
		int num = nScanner.nextInt();

		for (int i = 0; i < num; i++) {

			System.out.println("input index a[" + i + "] -----> ");

			arr[i] = nScanner.nextInt();

		}

		System.out.println("Which number You found");

		int value = nScanner.nextInt();

		BinarySearch binarySearch = new BinarySearch();

		int find = binarySearch.Search(arr, value, num);

		if (find != -1) {

			System.out.println("number is found , Position is ----> a["
					+ binarySearch.Search(arr, value, num) + "]");

		}

		else {

			System.out.println("Not Found");

		}

	}

}
