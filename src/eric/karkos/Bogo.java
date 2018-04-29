package eric.karkos;

import java.util.Random;

public class Bogo {

    Random rand = new Random();

    public Bogo() {
    }

    public void bogoSort(int[] array) {
        int timesShuffled = 0;
        while (!isSorted(array)) {
            shuffle(array);
            timesShuffled++;
        }
        System.out.println("Wow that only took " + timesShuffled + " shuffles to sort!");
    }

    public boolean isSorted(int[] array) {
        for(int i=1;i<array.length;i++) {
            if (array[i-1] > array[i])
                return false;
        }
        return true;
    }

    public void shuffle(int[] anArray) {
        for(int i=0;i<anArray.length;i++) {
            int newPos = rand.nextInt(anArray.length);
            int t = anArray[i];
            anArray[i] = anArray[newPos];
            anArray[newPos] = t;
        }
    }
}
