import java.util.Scanner;
import java.util.Random;
public class ArrayRandomNum {

	public static void main(String[] args) {
		Random randomNum = new Random();
		Scanner userNum = new Scanner(System.in);
		int arrayRow;
		int arrayColumn;
		int row;
		int column;
		int max = 0;
		int min = 0;

		//Ask For Array Dimensions && Declare/Initialize Array
		System.out.println("Give me the number of rows in the array");
		arrayRow = userNum.nextInt();
		System.out.println("\nGive me the number of columns in the array");
		arrayColumn = userNum.nextInt();
		System.out.println();
		int [][] myArray = new int[arrayRow][arrayColumn];
		
		//Fill Array
		for(row = 0; row < arrayRow; row++) {
			for(column = 0; column < arrayColumn; column++) {
				myArray[row][column] = randomNum.nextInt(100);
				if(row == 0 && column == 0) {
					min = myArray[row][column];
					max = myArray[row][column];
				} else if(myArray[row][column] < min) {
					min = myArray[row][column];
				} else if(myArray[row][column] > max) {
					max = myArray[row][column];
				}
				if(myArray[row][column] < 10) {
					System.out.print(myArray[row][column] + "  ");
				} else {
				System.out.print(myArray[row][column] + " ");
				}
			}
			System.out.println();
		}
		System.out.println("\nGreatest number is " + max);
		System.out.println("\nSmallest number is " + min);
	}
}
