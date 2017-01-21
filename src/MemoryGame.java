/**
 * Created by Михаил on 21.01.2017.
 */
public class MemoryGame {
    public static void main(String[] args) {

        /**
         *  1 create array and fill it (call method fillArray());
         **/
        main()
        {
            /* 2 game loop */
            while (isGameOver() == false) {
                /* ask user 2 index */
                System.out.println();
                /* print an array */
                displayArray();
            }
        }

        /**
         *  1) Create array with pair digits, fill second array opened with zeroes;
         *  2) 2 arrays are parameters
         **/
        public static void fillArray(int[] Array, int[] opened)
            {
            }

    /**
     * 2) Display array;  user's index for array
     * @param Array
     * @param ind1 index of opened element
     * @param ind2 index of opened element
     * @param opened
     */
        public static void displayArray((int[] Array, int ind1, int ind2, int[] opened))
            {
            }

    /**
     * If array opened doesn't contain 0;
     * @param opened
     */
    public static void isGameOver(int[] opened)
        {
        }
}


}
