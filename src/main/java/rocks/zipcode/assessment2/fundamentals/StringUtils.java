package rocks.zipcode.assessment2.fundamentals;

/**
 * @author leon on 28/11/2018.
 */
public class StringUtils {
    /**
     * @param stringToBePadded - string value to be flushed right
     * @param amountOfPadding - amount of padding to be flushed left
     * @return `stringToBePadded` flushed right by left-padding
     */
    public static String padLeft(String stringToBePadded, int amountOfPadding) {
        return String.format("%" + amountOfPadding + "s", stringToBePadded);
    }

    /**
     * @param stringToBePadded - string value to be flushed left
     * @param amountOfPadding - amount of padding to be flushed right
     * @return `stringToBePadded` flushed right by right-padding
     */
    public static String padRight(String stringToBePadded, int amountOfPadding) {
        return String.format("%-" + amountOfPadding + "s", stringToBePadded);
    }

    /**
     * @param stringToBeRepeated - string value to be repeated
     * @param numberOfTimeToRepeat - number of times to repeat `stringToBeRepeated`
     * @return the string repeated and concatenated `n` times
     */
    public static String repeatString(String stringToBeRepeated, int numberOfTimeToRepeat) {
        StringBuilder retString = new StringBuilder();
        for (int i = 0; i < numberOfTimeToRepeat; i++) {
            retString.append(stringToBeRepeated);
        }
        return retString.toString();
    }

    /**
     * @param string - string to be evaluated
     * @return - true if string only contains alpha characters
     */
    public static Boolean isAlphaString(String string) {
        String together = string.replaceAll(" ", "");
        for (int i = 0; i < together.length(); i++) {
            Character charAt = together.toLowerCase().charAt(i);
            if(charAt.charValue() < 97 || charAt.charValue() > 122)
                return false;
        }
        return true;
    }

    /**
     * @param string - string to be evaluated
     * @return - true if string only contains numeric characters
     */
    public static Boolean isNumericString(String string) {
        String together = string.replaceAll(" ", "");
        for (int i = 0; i < together.length(); i++) {
            Character charAt = together.toLowerCase().charAt(i);
            if(charAt.charValue() < 48 || charAt.charValue() > 57)
                return false;
        }
        return true;
    }

    /**
     * @param string - string to be evaluated
     * @return - true if string only contains special characters
     */
    public static Boolean isSpecialCharacterString(String string) {
        String together = string.replaceAll(" ", "");
        for (int i = 0; i < together.length(); i++) {
            Character charAt = together.toLowerCase().charAt(i);
            if((charAt.charValue() < 32 || charAt.charValue() > 47) &&
                    (charAt.charValue() < 58 || charAt.charValue() > 64) &&
                    (charAt.charValue() < 91 || charAt.charValue() > 96) &&
                    (charAt.charValue() < 123 || charAt.charValue() > 126))
                return false;
        }
        return true;
    }
}
