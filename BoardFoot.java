/*
*  This program calculates the needed length for a board foot.
*      to be 144 inches³.
*
* @author  Rodas Nega
* @version 1.0
* @since   2022-09-25
*/

import java.util.Scanner;

/**
 * This function calculates the length for a board foot.
 */
final class BoardFoot {

    /**
    * Prevent instantiation.
    * Throw an exception IllegalStateException.
    * if this ever is called
    *
    * @throws IllegalStateException
    *
    */
    private BoardFoot() {
        throw new IllegalStateException("Cannot be instantiated");
    }

    /**
     * This function returns the main function with a length value.
     *
     * @param userHeight parameter one as a number
     * @param userWidth parameter two as a number
     * @return return userLength value as a number
    */
    public static double boardLength(final double userHeight,
        final double userWidth) {
        // process
        final double volume = 144;
        final double userLength = volume / (userWidth * userHeight);

        return userLength;

    }

    /**
    * The starting main() function.
    *
    * @param args No args will be used
    */
    public static void main(String[] args) {

        try {
            // input & output
            final Scanner numberInput = new Scanner(System.in);
            final Scanner numberInputTwo = new Scanner(System.in);
            System.out.print("Enter a width: ");
            final double userWidth = numberInput.nextDouble();
            System.out.print("Enter a height: ");
            final double userHeight = numberInputTwo.nextDouble();
            final double calculatedLength = boardLength(userHeight, userWidth);

            if (userWidth <= 0 || userHeight <= 0) {
                throw new IllegalArgumentException("That is an"
                                    + "invalid number.");
            } else {
                System.out.println("The required length is "
                    + calculatedLength + " inches for the "
                    + "board foot to be 144 inches³");
            }
        } catch (java.util.InputMismatchException ex) {
            System.out.println("That is an invalid response.");
        } catch (IllegalArgumentException ex) {
            System.out.println("That is an invalid input.");
        } finally {
            System.out.println("\nDone.");
        }
    }
}

