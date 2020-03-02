package rocks.zipcode.assessment2.fundamentals;

public class BasicStringUtils {
    /**
     * @param string1 - Base string to be added to
     * @param string2 - String to add to `string1`
     * @return concatenation of `string1` and `string2`
     */
    public static String concatentate(String string1, String string2) {
        StringBuilder retString = new StringBuilder(string1);
        retString.append(string2);
        return retString.toString();
    }

    /**
     * @param string1 - String to be reversed
     * @return an identical string with characters in reverse order
     */
    public static String reverse(String string1) {
        StringBuilder revString = new StringBuilder(string1);
        revString.reverse();
        return revString.toString();
    }

    /**
     * @param string1 - first string to be reversed
     * @param string2 - second string to be reversed
     * @return concatenation of the reverse of `string1` and reverse of `string2`
     */
    public static String reverseThenConcatenate(String string1, String string2) {
        String revString = reverse(string1);
        String revString2 = reverse(string2);
        String retString = concatentate(revString, revString2);
        return retString;
    }

    /**
     * @param string - the string to be manipulated
     * @param charactersToRemove - Characters that should be removed from `string`
     * @return `string` with `charactersToRemove` removed
     */
    public static String removeCharacters(String string, String charactersToRemove) {
        String retString = string;
        for (int i = 0; i < charactersToRemove.length() ; i++) {
            String charAt = charactersToRemove.substring(i, i+1);
            retString = retString.replaceAll(charAt, "");
        }
        return retString;
    }

    /**
     * @param string - the string to be manipulated
     * @param charactersToRemove - characters to be removed from the string
     * @return reverse of `string` with `charactersToRemove` removed
     */
    public static String removeCharactersThenReverse(String string, String charactersToRemove) {
        String stringRemoved = removeCharacters(string, charactersToRemove);
        String revString = reverse(stringRemoved);
        return revString;
    }
}
