package fl;

import java.lang.*;

public class SystemDemo {

   public static void main(String[] args) {

      int arr1[] = { 111, 4, 6, 8, 9, 12 };
      int arr2[] = { 0, 10, 20, 30, 40, 50 };
    
      // copies an array from the specified source array
      System.arraycopy(arr1, 0, arr2, 0,3);
      System.out.print("array2 = ");
      System.out.print(arr2[0] + " ");
      System.out.print(arr2[1] + " ");
      System.out.print(arr2[2] + " ");
      System.out.print(arr2[3] + " ");
      System.out.print(arr2[4] + " ");
      System.out.print(arr2[5] + " ");
   }
}
