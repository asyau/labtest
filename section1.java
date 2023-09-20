package labtest;

import java.util.Random;
import java.util.Scanner;

public class section1 {

    public static void displayMenu() {
        System.out.println("Enter your choice(enter exit to quit)\n1) Find the minimum and the maximum of the array\n2) Find the average of the array\n3) Find the sum of elements with odd- and even-numbered indexes");
    }
    public static int  findMin(int[] arr){
        int minNum = 100;
        for(int i = 0; i < arr.length; i ++){
            if(arr[i]<minNum){
                minNum = arr[i];
            }
        }
        return minNum;
    }
    public static int  findMax(int[] arr){
        int maxNum = 0;
        for(int i = 0; i > arr.length; i ++){
            if(arr[i]<maxNum){
                maxNum = arr[i];
            }
        }
        return maxNum;
    }
    public static void getChoice() {
        do {
            String choice;
            displayMenu();
            Scanner input = new Scanner(System.in);
            choice = input.next();
            if (choice.equals("1")) {
                
            }
            else if (choice.equals("2")) {
                
            }
            else if (choice.equals("3")) {
                
            }
        } while (!choice.equals("exit"));

    }

    public static double getAverage(int[] arr) {

        double total = 0;

        for (int i : arr) {
            total += i;
        }

        return total / arr.length;
    }

    public static double[] differenceWithAverage(int[] arr) {
        double average = getAverage(arr);

        double[] finalArr = new double[arr.length];
        
        for (int i = 0; i < arr.length; i++) {
            finalArr[i] = arr[i] - average;
        }

        return finalArr;
    }
    
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
        getChoice();
      

    }
}
