import java.util.Arrays;
import java.util.Random;

public class IntArray {
    // Fields
    private int length;
    private int[] myArray;

    // Constructor
    public IntArray(int l) {
        this.length = l;
        this.myArray = new int[length];
    }

    // Clear the array (set all elements to 0)
    public void clear() {
        Arrays.fill(this.myArray, 0);
    }

    // Fill the array with random values between 0 and 99
    public void fillRand() {
        Random rand = new Random();
        for (int i = 0; i < this.myArray.length; i++) {
            this.myArray[i] = rand.nextInt(6) + 1; // Random number between 0 and 99
        }
    }

    // Get the value at the given index
    public int get(int element) {
        if (element >= 0 && element < this.length) {
            return this.myArray[element];
        }
        throw new IndexOutOfBoundsException("Index out of bounds.");
    }

    // Set the value at the given index
    public void set(int element, int newValue) {
        if (element >= 0 && element < this.length) {
            this.myArray[element] = newValue;
        } else {
            throw new IndexOutOfBoundsException("Index out of bounds.");
        }
    }

    // Get the size of the array
    public int size() {
        return this.length;
    }

    // Check if the array is empty (if all elements are zero)
    public boolean isEmpty() {
        for (int num : this.myArray) {
            if (num != 0) {
                return false;
            }
        }
        return true;
    }

    // Sort the array in ascending order
    public void sort() {
        Arrays.sort(this.myArray);
    }

    // Convert the array to a string representation
    @Override
    public String toString() {
        return Arrays.toString(this.myArray);
    }
}
