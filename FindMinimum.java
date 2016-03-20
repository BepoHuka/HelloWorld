public class FindMinimum {
	
	public static int findMin(int a, int b){
		if (a < b)
			return a;
		else 
			return b;
	}

	public static int findMin(int a, int b ,int c){		
		return findMin(findMin(a, b), c);
	}

	public static int findMin(int a, int b ,int c, int d){
		return findMin(findMin(a, b, c), d);
}

	public static void main(String[] args){
		System.out.println("Minimum argument 1: " + findMin(1, 12));
		System.out.println("Minimum argument 2: " + findMin(3, 7, 5));
		System.out.println("Minimum argument 3: " + findMin(4, 10, 8, 9));
	}
}

