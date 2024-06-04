package Task1;/* Task 1 - Check if an array is sorted ascending
Write a program that reads an array of ints and checks if the array is sorted ascending (from smallest to largest number).


Input data format:

The first line contains the size of an array.
The second line contains elements of the array separated by spaces.

Output data format:

Only a single value: true or false.

Sample Input 1:

4

1 2 3 4


Sample Output 1:

True


Sample Input 2:

4

1 2 3 0

Sample Output 2:
false
 */

import java.util.Scanner;

public class AscendingArray {
    public static void main(String[] args) {

        Scanner   sc = new Scanner(System.in);
        System.out.println("enter size of array");
        int size = sc.nextInt();
        int[] array = new int[size];

        sc.nextLine();

        System.out.println("enter elements");
        String[] elements = sc.nextLine().split("");


        for (int i = 0; i < elements.length; i++) {
            array[i] = Integer.parseInt(elements[i]);
        }

        System.out.println(isSortedAscend(array));

    }

    public static boolean isSortedAscend(int []arr){
        for(int i= 0; i < arr.length -1; i++){
            if (arr[i] > arr[i +1]){
                return false;
            }
        }
        return true;

    }


}