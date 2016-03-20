import java.util.InputMismatchException;
import java.util.Scanner;

public class SearchInString {

	String text;
	int length;
	
	public SearchInString(){
		text = "Veronikao";
		length = text.length();
	}
	
	public SearchInString(String input){
		text = input;
		length = text.length();
	}
	
	public void print(){
		System.out.println(text);
	}
	
	public int search(char symbol){
		int counter = 0;
		for (int i = 0; i < length; i++){
			if (text.charAt(i) == symbol)
				counter = counter + 1;
		}
		return counter;
	}
	
	public static void main(String[] args) {
		SearchInString text1 = new SearchInString();	
		text1.print();
		Scanner in = new Scanner(System.in);              		
       // try {
        	System.out.print("Please enter required char: ");
        	char symbol = in.next().charAt(0);
        	System.out.println("Char occures in text " + text1.search(symbol) + " times");
        /*  
       }
       catch (InputMismatchException ex) {
	    	System.err.println("Entered not a char");	    	
	    }
        in.close();
      */  
        
	}
}
