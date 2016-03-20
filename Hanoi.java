import java.util.Scanner;

public class Hanoi {
	
	public static void move(int n, char from, char temp, char to){
		if (n > 1){
			move(n - 1, from, to, temp);
			System.out.println(n + " moved from " + from + " to " + to);
			move(n - 1, temp, from, to);
		} 
		else {
			System.out.println(n + " moved from " + from + " to " + to);			
		}
				
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);  
		System.out.print("Please enter count of rings: ");
    	int ringsCount = in.nextInt();
    	move(ringsCount, 'A', 'B', 'C');
    	in.close();
	}

}

