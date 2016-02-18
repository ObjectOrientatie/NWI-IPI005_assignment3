package assignment3;

import java.util.Scanner;

/**
 * Contains user interaction for solving galgs.
 *
 * @author Hendrik Werner // s4549775
 * @author Jasper Haasdijk // s4449754
 */
public class GalgSolver {
    private static final Scanner SCANNER = new Scanner(System.in);
    private final Galg galg;

    /**
     * Constructor method.
     *
     * @param galg The galg this tries to solve.
     */
    public GalgSolver (Galg galg) {
        this.galg = galg;
    }

    public void solve () {
        while (galg.isAlive() && !galg.isSolved()) {
            // Jasper Noob
        }
    }

    private static String getNextLetter () {
        return String.valueOf(SCANNER.nextLine().charAt(0));
    }
}
