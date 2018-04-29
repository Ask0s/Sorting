package eric.karkos;

public class Bubble {

	Swap swapper = new Swap();

	public Bubble() {
	}
	
	public void bubbleSort(int[] toSort) {
		int len = toSort.length;
		for(int i=0;i<len;i++) {
			for (int k=1;k<len;k++) {
				if(toSort[k-1] > toSort[k]) {
					swapper.swapElementsInt(k-1,k,toSort);
				}
			}
		}
	}
}
