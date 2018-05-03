package eric.karkos;

import java.util.Arrays;
import java.util.Random;
import java.util.Timer;

public class Main {

    private Random random = new Random();
    
    public Main(){
    	
    } // No-arg class constructor

    // Pre: The maximum size that you want the array returned to be
    // Post: Returns a random integer between 0 and maxSize
    private int getRandomSize(int maxSize) {
        return random.nextInt(maxSize);
    }

    // Pre: int of the maximum size of the elements
    // Post: Returns a random number between 0 and ceiling
    // Ex. If ceiling := 500 will return a random int between 0 and 500 (exclusive)
    private int getRandomElements(int ceiling) {
        return random.nextInt(ceiling);
    }

    // Pre: the maximum size the array (maxSize) can be and the maximum element (ceiling)
    // Post: Returns an int array of a random size and filled with random elements
    // 0 <= randomArray.size < ceiling
    public int[] createInts(int maxSize, int ceiling) {
        int[] randomArray = new int[getRandomSize(maxSize)];
        for (int i=0;i<randomArray.length;i++) {
            randomArray[i] = getRandomElements(ceiling);
        }
        return randomArray;
    }

    public static void main(String[] args) {
    	Main main = new Main();

    	// Bubble Sort
    	int[] bubbleArray = main.createInts(20, 500);
    	Bubble bubble = new Bubble();
    	bubble.bubbleSort(bubbleArray);
    	System.out.println("Bubble sort:");
    	System.out.println(Arrays.toString(bubbleArray) + "\n");

        // Bogo Sort
        int[] bogoArray = main.createInts(10, 500);
    	Bogo bogo = new Bogo();
    	bogo.bogoSort(bogoArray);
    	System.out.println("Bogo sort:");
    	System.out.println(Arrays.toString(bogoArray) + "\n");
    	
    	// Selection sort
    	int[] selectionArray = main.createInts(20, 500);
    	Selection selection = new Selection();
    	selection.selectionSort(selectionArray);
    	System.out.println("Selection sort:");
    	System.out.println(Arrays.toString(selectionArray) + "\n");
    	
    	// Quick sort
    	int[] quickArray = main.createInts(10, 500);
    	QuickSort quick = new QuickSort();
    	quick.quickSort(quickArray, 0, quickArray.length-1);
    	System.out.println("Quick sort:");
    	System.out.println(Arrays.toString(quickArray) + "\n");
    	
    	
    }
}
