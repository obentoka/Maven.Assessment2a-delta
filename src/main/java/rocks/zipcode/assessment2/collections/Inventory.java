package rocks.zipcode.assessment2.collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Logger;

/**
 * Use a map to keep track of inventory in a store
 */
public class Inventory {
    /**
     * @param strings list of strings to add / remove / fetch from
     */
    Map<String, Integer> things;
    private static final Logger LOGGER =
            Logger.getLogger((Inventory.class.getName()));

    public Inventory(List<String> item) {
        this();
        for(String i : item){
            if(i != null)
                things.put(i, 1);
        }
    }

    /**
     * nullary constructor initializes a new list
     */
    public Inventory() {
        things = new HashMap<>();
    }

    /**
     * @param item - increment the number of this item in stock by 1
     */
    public void addItemToInventory(String item) {
        if(things.containsKey(item))
            things.replace(item, things.get(item), things.get(item)+1);
        else
            things.put(item, 1);
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
        if(things.containsKey(item)){
            return things.get(item);
        }
        return 0;
    }
}
