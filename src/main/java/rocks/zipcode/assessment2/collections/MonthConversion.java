package rocks.zipcode.assessment2.collections;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/**
 * Use a map to solve
 */
public class MonthConversion {
    Map<Integer, String> months = new LinkedHashMap<>();
    Set<Map.Entry<Integer, String>> setMonth = this.months.entrySet();
    /**
     * @param monthNumber - ordinal of month in the year; i.e. January = 1, February = 2
     * @param monthName - name of month
     */
    public void add(Integer monthNumber, String monthName) {
        months.put(monthNumber, monthName);
    }

    /**
     * @param monthNumber - ordinal of month in the year
     * @return the name of the respective month
     */
    public String getName(Integer monthNumber) {
        if(monthNumber > 12 || monthNumber < 0) {
            throw new NullPointerException();
        }else {
           return months.get(monthNumber);
        }
    }

    /**
     * @param monthName - name of month
     * @return - the ordinal of the month in the year
     */
    //FIGURE OUT THIS ONE!!!
    public Integer getNumber(String monthName) {
        for(Map.Entry<Integer, String> i : setMonth){
            if(i.getValue().equalsIgnoreCase(monthName))
                return i.getKey();
        }

        return null;
    }

    /**
     * @param monthNumber
     * @return true if the monthNumber is in the keySet
     */
    public Boolean isValidNumber(Integer monthNumber) {
        return months.containsKey(monthNumber);
    }

    /**
     * @param monthName
     * @return true if the monthName is in the valueSet
     */
    public Boolean isValidMonth(String monthName) {
        return months.containsValue(monthName);
    }

    /**
     * @return number of entries in this mapping
     */
    public Integer size() {
        return setMonth.size();
    }

    /**
     * @param monthNumber - number of month in year
     * @param monthName - name of month
     */
    public void update(Integer monthNumber, String monthName) {
        if(isValidNumber(monthNumber)){
            months.replace(monthNumber, monthName);
        }
    }
}
