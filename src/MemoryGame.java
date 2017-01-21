import java.util.Scanner;

/**
 * Created by Михаил on 21.01.2017.
 */
public class MemoryGame {

    /**
     * The memory game
     *
     * @param args
     */
    public static void main(String[] args)
    {
        /* 1) create 2 arrays and fill them (call method fillArray()); */
        int[] pairDigits = new int[8];
        int[] opened = new int[8];
        fillArray(pairDigits, opened);

        /*  2) game loop; */
        Scanner sc = new Scanner(System.in);
        while (isGameOver(opened) == false) {
            /* ask user 2 index */
            System.out.println("Please enter index 1:");
            int ind1 = sc.nextInt();
            System.out.println("Please enter index 2:");
            int ind2 = sc.nextInt();
            if ((ind1 > 7) && (ind1 < 0)) {
                continue;
            }
            if ((ind2 > 7) && (ind2 < 0) && (ind2 == ind1)) {
                continue;
            }
            /* process game*/
            checkPlayerGuess(pairDigits, opened, ind1, ind2);

            System.out.println();

            /* print an array */
            displayArray(pairDigits, opened, ind1, ind2);


        }
    }


    /**
     * Fill first array with pair digits, fill second array opened with zeroes;
     *
     * @param pairDigits
     * @param opened
     */
    public static void fillArray(int[] pairDigits, int[] opened)
    {
        for (int i = 0; i < pairDigits.length; i++) {
            pairDigits[i] = i/2 + 1;
        }
        for (int i = 0; i < opened.length; i++) {
            opened[i] = 0;
        }
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
        for (int i = 0; i < pairDigits.length; i++) {
            /* method prints . if correspondent element of array opened equals 0 and actual element's index is not equal indexes.*/
            if ((opened[i] == 0) && (i != ind1) && (i != ind2)) {
                System.out.print(".");
                continue;
            }
            /* method prints braces if correspondent element doesn't equal 0 */
            if (opened[i] != 0) {
                System.out.print("(" + pairDigits[i] + ")");
                continue;
            }
            /* method prints without braces if correspondent element equals 0 and index of element matches with argument indexes */
            if ((opened[i] == 0) && ((i == ind1) || (i == ind2))) {
                System.out.print(pairDigits[i]);
                continue;
            }
            System.out.println("------------------------------------------------------");

        }
    }

    /**
     * If array opened doesn't contain 0 return true, otherwise return false;
     *
     * @param opened
     */
    public static boolean isGameOver(int[] opened)
    {
        for (int i = 0; i < opened.length; i++) {
            if (opened[i] != 0) {
                continue;
            } else {
                return false;
            }
        }
        return true;
    }

    /**
     * process If correspondent elements are equal, change element from opened to 1. Otherwise print error message.
     *
     * @param pairDigits;
     * @param opened
     * @param ind1
     * @param ind2
     */
    public static void checkPlayerGuess(int[] pairDigits, int[] opened, int ind1, int ind2)
    {
        if (pairDigits[ind1] == pairDigits[ind2]) {
            opened[ind1] = 1;
            opened[ind2] = 1;
            System.out.println("Yeah! You found a pair");
        } else {
            System.out.println("No, " + pairDigits[ind1] + " and" + pairDigits[ind2] + " is not a memory pair");
        }
    }
}


