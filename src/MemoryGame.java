/**
 * Created by Михаил on 21.01.2017.
 */
public class MemoryGame {

    /**
     * The memory game
     *
     * @param args
     */
    public static void main(String[] args) {
        /* 1) create 2 arrays and fill them (call method fillArray());
        *  2) game loop
        */
        while (isGameOver() == false) {
            /* ask user 2 index */
            System.out.println();
            /* print an array */
            displayArray();
        }
    }


    /**
     * Fill first array with pair digits, fill second array opened with zeroes;
     * @param pairDigits
     * @param opened
     */
    public static void fillArray(int[] pairDigits, int[] opened)
    {
    }

    /**
     * Display array
     *
     * @param pairDigits
     * @param ind1       index of opened element
     * @param ind2       index of opened element
     * @param opened
     */
    public static void displayArray(int[] pairDigits, int[] opened, int ind1, int ind2)
    {
    }

    /**
     * If array opened doesn't contain 0 return true, otherwise return false;
     *
     * @param opened
     */
    public static boolean isGameOver(int[] opened)
    {
    }
}


