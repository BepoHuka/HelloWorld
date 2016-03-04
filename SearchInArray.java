import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Random;
 
public class SearchInArray 
{
	  private int n;  
	  private int i;  
	  private int[] generatedArray;
	
    public static void main(String[] args)
    {
    	int n = 0;
    	Scanner in = new Scanner(System.in);
        System.out.print("Введите размер массива: ");
        		
	        try
	        	{
	        	n = in.nextInt();
	        	} 
	        catch (InputMismatchException ex)
	        	{
	            System.err.println("Вы ввели не целое число");
	            return;
	        	}
	        
	        
   int [] array = new int[n];	
   array = randomize(n);
 
		        
   System.out.print("Сгенерирован массив случайных чисел: "); 
   for (int i = 0; i < n; i++) 
		        {
		        	System.out.print(array[i] + " ");
		        }
		        	System.out.println();
		           	array = bublesort(array);
		          
		        
		           	System.out.print("Массив отсортирован по возрастанию методом пузырька: ");         
		           	for (int i = 0; i < n; i++) 
		           		{
		           			System.out.print(array[i] + " ");
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
 /*
    private static int[] searchOne(int[] array) 
    {    	   	
    	 for (int j = 0; j < array.length; j++) 
    	 {
             if (array[j] == i) 
             { 
               return j;
             }
         }
         return -1; 
    }  
*/ 
}