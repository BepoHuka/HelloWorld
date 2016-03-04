import java.util.Scanner;
import java.util.Random;
 
public class ArraySorting {

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите размер массива: ");
        int arraySize = in.nextInt();		//переменная хранящая размер массива (введённый с консоли)
        int [] array = new int[arraySize];	//переменная хранящая массив
        array = randomize(arraySize);
        
        System.out.print("Сгенерирован массив случайных чисел: "); 
        for (int i = 0; i < arraySize; i++) {
        	System.out.print(array[i] + " ");
        }
        System.out.println();
        
        array = sort(array);
        
        System.out.print("Массив отсортирован по возрастанию: ");         
        for (int i = 0; i < arraySize; i++) {
        	System.out.print(array[i] + " ");
        }
        System.out.println();
        
        in.close();
        
    }
    
    private static int[] randomize(int size) {
        int [] randomArray = new int[size];

        Random randomushka = new Random();  
        for (int i = 0; i < size; i++)
        {
        	randomArray[i] = randomushka.nextInt(100);
        	
        }
        
        return randomArray;
            
    }
    
    private static int[] sort(int[] arrayToSort) {  
    	   	
    	for (int i = 0; i < arrayToSort.length - 1; i++) {
    		for (int j = 0; j < arrayToSort.length - 1; j++) {
    			if (arrayToSort[j] > arrayToSort[j + 1]){
    				int tmp = arrayToSort[j];
    				arrayToSort[j] = arrayToSort[j + 1];
    				arrayToSort[j + 1] = tmp;
    			}
    		}
    	}
    	
    	return arrayToSort;    	
    }
}