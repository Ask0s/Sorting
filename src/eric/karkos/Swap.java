package eric.karkos;

public class Swap {
	
	public Swap() {
	}
	
	
	public int[] swapElementsInt(int leftIndex, int rightIndex, int[] array) {
		System.out.println("BEFORE:");
		System.out.println("LEFT: " + array[leftIndex]);
		System.out.println("RIGHT: " + array[rightIndex]);
		int tempVar = array[rightIndex];
		array[rightIndex] = leftIndex;
		array[leftIndex] = tempVar;
		System.out.println("AFTER:");
		System.out.println("LEFT: " + array[leftIndex]);
		System.out.println("RIGHT: " + array[rightIndex]);
		System.out.println();
		return array;
	}
	
	
	
}
