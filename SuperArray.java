import java.util.Random;

public class SuperArray {
	
	private int arraySize;
	private int[] array;
	
	public SuperArray(int size){
		arraySize = size;
		array = new int[size];				
	}
	
	public void randomize(){
		Random randomushka = new Random();  
        for (int i = 0; i < arraySize; i++) {
        	array[i] = randomushka.nextInt(100);        	
        }  
	}
	
	public void bubbleSort(){
		for (int i = 0; i < arraySize - 1; i++) 
			for (int j = 0; j < arraySize - 1; j++)
				if (array[j] > array[j + 1]) {
					int tmp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = tmp;
					}
	}
	
	public void print(){
		for (int i = 0; i < arraySize; i++)
	    	System.out.print(array[i] + " ");
		System.out.println();
	}
	
	public boolean search(int searchNum){		
		boolean isFound = false;
		for (int i = 0; i < arraySize - 1; i++){
			if (array[i] == searchNum)
				isFound = true;
		}		
		return isFound;
	}
	
	public boolean searchBin(int searchNum){	
		
		int first  = 0;
	    int last   = arraySize - 1;
	    int middle = (first + last)/2;
	 
	    while (first <= last) {
	    	if (array[middle] == searchNum)	    	
	    		return true;	    		    		
	    	else if (array[middle] < searchNum) 
	    		first = middle + 1;
	    	else 
		         last = middle - 1;
	    	middle = (first + last)/2;
	    }	  
	    return false;

	}	

}