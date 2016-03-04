import java.util.Scanner;
import java.util.Random;
 
public class ArraySorting 
{

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("¬ведите размер массива: ");
        int arraySize = in.nextInt();		//переменна€ хран€ща€ размер массива (введЄнный с консоли)
        int [] array = new int[arraySize];	//переменна€ хран€ща€ массив
        int [] array2 = new int[arraySize];
        array = randomize(arraySize);
        array2 = randomize(arraySize);
        
        System.out.print("—генерирован массив случайных чисел: "); 
        for (int i = 0; i < arraySize; i++) 
        {
        	System.out.print(array[i] + " ");
        }
        	System.out.println();
           	array = bublesort(array);
           	array2 = insertionSort(array);
        
           	System.out.print("ћассив отсортирован по возрастанию методом пузырька: ");         
           	for (int i = 0; i < arraySize; i++) 
           		{
           			System.out.print(array[i] + " ");
           		}
           	System.out.println();
           	System.out.print("ћассив отсортирован по возрастанию методом вставки: ");         
           	for (int i = 0; i < arraySize; i++) 
           		{
           			System.out.print(array2[i] + " ");
           		}
       	System.out.println();
        in.close();
        
    }
    
    private static int[] randomize(int size) 
    {
        int [] randomArray = new int[size];

        Random randomushka = new Random();  
        for (int i = 0; i < size; i++)
        {
        	randomArray[i] = randomushka.nextInt(100);
        	
        }
        
        return randomArray;
            
    }
    
    private static int[] bublesort(int[] arrayToSort) 
    {  
    	   	
    	for (int i = 0; i < arrayToSort.length - 1; i++) 
    	{
    		for (int j = 0; j < arrayToSort.length - 1; j++) 
    		{
    			if (arrayToSort[j] > arrayToSort[j + 1])
    			{
    				int tmp = arrayToSort[j];
    				arrayToSort[j] = arrayToSort[j + 1];
    				arrayToSort[j + 1] = tmp;
    			}
    		}
    	}
    	
    	return arrayToSort;    	
    	
    }  
    
    private static int[] insertionSort(int[] insArray)
    {
    	for (int i = 0; i < insArray.length; i++)
    	{
    		int arrayElement = insArray[i];
    		int j = i-1;
    		while(j >= 0 && insArray[j] > arrayElement)
    		{
    			insArray[j] = insArray[i];
    			j=j-1;
    			insArray[j+1]=arrayElement;
    		}
       	}
    	return insArray;
    }
}