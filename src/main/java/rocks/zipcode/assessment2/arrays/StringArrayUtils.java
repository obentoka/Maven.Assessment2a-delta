package rocks.zipcode.assessment2.arrays;

import java.util.logging.Logger;

/**
 * @author leon on 28/11/2018.
 */
public class StringArrayUtils {
    /**
     * @param arrayToBeSpliced - array to be evaluated
     * @param startingIndex - starting index of array to be spliced
     * @param endingIndex - ending index of array
     * @return an array with all elements between `startingIndex` and `endingIndex`
     */

    public static String[] getSubArray(String[] arrayToBeSpliced, int startingIndex, int endingIndex) {

        if (startingIndex >= arrayToBeSpliced.length || endingIndex >= arrayToBeSpliced.length)
            throw new IndexOutOfBoundsException();
        else if(startingIndex < 0 || endingIndex < 0)
            throw new IllegalArgumentException();
        else {
            String[] retString = new String[endingIndex - startingIndex];
            for (int i = 0; startingIndex < endingIndex; i++, startingIndex++) {
                retString[i] = arrayToBeSpliced[startingIndex];
            }
            return retString;
        }

    }


    /**
     * @param arrayToBeSpliced - array to be evaluated
     * @param startingIndex    - starting index of array to be spliced
     * @return an array all elements between after `startingIndex`
     */
    public static String[] getEndingArray(String[] arrayToBeSpliced, int startingIndex) {
        if (startingIndex >= arrayToBeSpliced.length)
            throw new IllegalArgumentException();
        else if(startingIndex < 0)
            throw new IndexOutOfBoundsException();
        else {
            String[] retString = new String[arrayToBeSpliced.length - startingIndex];
            for (int i = 0; startingIndex < arrayToBeSpliced.length; i++, startingIndex++) {
                retString[i] = arrayToBeSpliced[startingIndex];
            }
            return retString;
        }
    }
}
