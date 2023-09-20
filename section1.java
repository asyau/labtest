package labtest;

import java.util.Random;
import java.util.Scanner;

public class section1 {
    public static void main(String[] args) {
         // Given an array size, create an int array that contains random integers in the range [0,100].
         // All the remaining functionality will operate on this array.

         int size;
         int num;
         Scanner scan = new Scanner(System.in);
         System.out.println("Enter the size of the array: ");
         size = scan.nextInt();
         
         Random rand = new Random();
         int[] nums = new int[size];
         for (int i = 0; i < nums.length; i++){
            num = rand.nextInt(100);
            nums[i] = num;
         }
      

    }
}
