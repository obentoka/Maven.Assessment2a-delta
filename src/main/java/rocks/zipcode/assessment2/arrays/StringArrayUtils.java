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
    private static final Logger LOGGER =
            Logger.getLogger((StringArrayUtils.class.getName()));

    public static String[] getSubArray(String[] arrayToBeSpliced, int startingIndex, int endingIndex) {
        try {
            if ((startingIndex >= 0 && startingIndex < arrayToBeSpliced.length) &&
                    (endingIndex < arrayToBeSpliced.length && endingIndex > 1)) {
                String[] retString = new String[endingIndex - startingIndex];
                for (int i = 0; startingIndex < endingIndex; i++, startingIndex++) {
                    retString[i] = arrayToBeSpliced[startingIndex];
                }
                return retString;
            }
        }catch (IndexOutOfBoundsException e){
            LOGGER.info(""+e);
        }
        return null;
    }


    /**
     * @param arrayToBeSpliced - array to be evaluated
     * @param startingIndex - starting index of array to be spliced
     * @return an array all elements between after `startingIndex`
     */
    public static String[] getEndingArray(String[] arrayToBeSpliced, int startingIndex) {
        if(startingIndex < arrayToBeSpliced.length) {
            String[] retString = new String[arrayToBeSpliced.length - startingIndex];
            for (int i = startingIndex; i < arrayToBeSpliced.length; i++) {
                retString[i] = arrayToBeSpliced[i];
            }
            return retString;
        }else {
            String[] retString = new String[0];
            return retString;
        }
    }
}
