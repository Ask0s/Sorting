package eric.karkos;

public class QuickSort {
	
	Swap swap = new Swap();
	
	public QuickSort() {
		
	}
	
	public void quickSort(int[] toSort, int low, int high) {
		int pivotIndex = 0;
		
		for(int i=0;i<toSort.length-1;i++) {
			pivotIndex = i;
			int storeIndex = i+1;
			for(int j=pivotIndex;j<toSort.length;j++) {
				if(toSort[j] < toSort[pivotIndex]) {
					swap.swapElementsInt(i, storeIndex, toSort);
					storeIndex++;
				}
			}
			swap.swapElementsInt(i, storeIndex-1, toSort);
		}
	}
	
	public void partition(int[] list, int low, int high) {
		int pivot = list[high];
		int s = low-1;
		for(int i=low;i<high;i++) {
			if(list[i] <= pivot) {
				s++;
				swap.swapElementsInt(s, i, list);
			}
		}
		swap.swapElementsInt(s+1, high, list);
	}

}
