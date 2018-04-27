package eric.karkos;

public class Bubble {

	public Bubble() {
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
			len -= 1;
		} while(isSwapped);
		
		return toSort;
	}

}
