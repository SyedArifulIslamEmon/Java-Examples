



public class BinarySearch {

	public int Search(int arr[], int value, int num) {

		int frist = 0;

		int last = num;

		while (frist <= last) {

			int mid = (frist + last) / 2;

			if (value == arr[mid]) {

				return mid;
			}

			else if (value < arr[mid]) {

				last = mid;
			}

			else {
				frist = mid;
			}

		}

		return -1;

	}

}
