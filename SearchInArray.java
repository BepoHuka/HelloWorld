import java.util.InputMismatchException;
import java.util.Scanner;

public class SearchInArray {

	public static void main(String[] args) {
		
    	Scanner in = new Scanner(System.in);              		
        try {
        	System.out.print("Please enter size of array: ");
        	int arraySize = in.nextInt();
        	SuperArray myArray = new SuperArray(arraySize);
        	myArray.randomize();
        	System.out.print("Randomized array: ");
        	//myArray.print();
        	/*
        	myArray.bubbleSort();
        	System.out.print("Sorted array: ");
        	myArray.print();
        	*/
        	System.out.print("Please enter value to find: ");
        	int number = in.nextInt();        	
        	
        	long startTime = System.currentTimeMillis();
        	System.out.println("One by one search result: " + myArray.search(number));
        	long endTime = System.currentTimeMillis();
        	long elapsedTime = endTime - startTime;
        	System.out.println("One by one search time: " + elapsedTime);
        	
        	myArray.bubbleSort();
        	
        	startTime = System.currentTimeMillis();
        	System.out.println("Binary search result: " + myArray.searchBin(number));
        	endTime = System.currentTimeMillis();
        	long elapsedTime2 = endTime - startTime;
        	System.out.println("Binary search time: " + elapsedTime2);
        	
        	if (elapsedTime > elapsedTime2)
        		System.out.println("One by one search took more time");
        	else if (elapsedTime == elapsedTime2)
        		System.out.println("Search time equal");
        	else
        		System.out.println("Binary search took more time");
        	/*
        	if (myArray.search(number)) {
        		System.out.println("Number is found");
        	} 
        	else {
        		System.out.println("Number is not found");
        	}
        	*/
        	
        }        	
	    catch (InputMismatchException ex) {
	    	System.err.println("Entered not an integer.");	    	
	    	}
        in.close();
	}
}
