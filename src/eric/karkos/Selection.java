package eric.karkos;

public class Selection {
	
	private Swap swap = new Swap();
	
	public Selection() {
		
	}
	
	public void selectionSort(int[] toSort) {
		int min = 0;
		for(int i=0;i<toSort.length-1;i++) {
			min = i;
			for(int j=i+1;j<toSort.length;j++) {
				if(toSort[j] < toSort[min]) {
					min = j;
				}
			}
			if(min != i)
				swap.swapElementsInt(i, min, toSort);
		}
	}

}
