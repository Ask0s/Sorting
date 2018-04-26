package eric.karkos;

public class Bubble {
	
	private int[] bubbleArray;
	
	public Bubble(int[] unsortedArray) {
		// Sets elements in array to be bubble sorted
		this.bubbleArray = new int[unsortedArray.length];
		for(int i=0;i<bubbleArray.length;i++) {
			bubbleArray[i] = unsortedArray[i];
		}
	}
	
	public int[] bubbleSort(int[] toSort) {
		int len = toSort.length;
		Swap swapper = new Swap();
		boolean isSwapped = false;
		do {
			for(int i=1;i<len;i++) {
				if(toSort[i-1] > toSort[i]) {
					swapper.swapElementsInt(i-1, i, toSort);
					isSwapped = true;
				}
			}
			// len -= 1;
		} while(isSwapped);
		
		return toSort;
	}

}
