package eric.karkos;

public class Bubble {

	public Bubble() {
	}
	
	public int[] bubbleSort(int[] toSort) {
		int len = toSort.length;
		Swap swapper = new Swap();
		boolean isSwapped = false;
		do {
			for(int i=1;i<len-1;i++) {
				if(toSort[i-1] > toSort[i]) {
					swapElementsInt(i-1, i, toSort);
					isSwapped = true;
				}
			}
		} while(!isSwapped);
		
		return toSort;
	}
	
	public void swapElementsInt(int leftIndex, int rightIndex, int[] array) {
		int t = array[leftIndex];
		array[leftIndex] = array[rightIndex];
		array[rightIndex] = t;
	}

}
