package method;

public class Main02 {				
	public static int findMax(int[] array) {
		int max = array[0];
		for(int num : array) {
			if( num > max ) {
				max = num;
			}
		}
		return max;
	}

	public static void main(String[] args) {
		int[] numbers = {3, 7, 1, 9, 4};
		int max = findMax(numbers);
		System.out.println("최대값: " + max);
	}

}







