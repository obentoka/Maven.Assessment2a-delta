package rocks.zipcode.assessment2.collections;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

/**
 * Use a map to keep track of inventory in a store
 */
public class Inventory {
    /**
     * @param strings list of strings to add / remove / fetch from
     */
    List<String> things;
    private static final Logger LOGGER =
            Logger.getLogger((Inventory.class.getName()));
    public Inventory(List<String> strings) {
        things = strings;
    }

    /**
     * nullary constructor initializes a new list
     */
    public Inventory() {
        things = new ArrayList<>();
    }

    /**
     * @param item - increment the number of this item in stock by 1
     */
    public void addItemToInventory(String item) {
        things.add(item);
    }

    /**
     * @param item - decrement the number of this item in stock by 1
     */
    public void removeItemFromInventory(String item) {
        try{
            things.remove(item);
        }catch (Exception e){
            LOGGER.info(""+e);
        }
    }

    /**
     * @param item - Search for this item in stock
     * @return - return the number of items
     */
    public Integer getItemQuantity(String item) {
        if(things.contains(item)){
            int count = 0;
            for (String i : things){
                if(i.equalsIgnoreCase(item)) {
                    count++;
                }
            }
            return count;
        }else {
            return 0;
        }
    }
}
