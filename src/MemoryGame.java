/**
 * Created by Михаил on 21.01.2017.
 */
public class MemoryGame {
    public static void main(String[] args) {
        /**
         *  1) 1) Create array with pair digits, fill second array opened with zeroes;
         public void fillArray(int[] Array, int[] opened)
         *  2) Display array;  user's index for array
         *  public void displayArray(int[] Array, int ind1, int ind2, int[] opened);
         *  3) public boolean isGameOver(int[] opened);
         *
         */
        main()
        {
        /* 1 create array and fill it (call method fillArray()), create second array with zeroes  */
            fillArray();

        /* 2 game loop */
            /* public boolean isGameOver(int[] opened) */
            while (isGameOver() == false) {
                /* ask user 2 index */
                System.out.println();

                /* print an array */
                displayArray();

            }
    }
}
