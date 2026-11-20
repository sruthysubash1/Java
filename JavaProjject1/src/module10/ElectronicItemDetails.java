package module10;

import java.util.HashMap;
import java.util.Map;

public class ElectronicItemDetails {

    public static void main(String[] args) {

        // HashMap with String name and Double price
        HashMap<String, Double> itemHashMap = new HashMap<>();

        //Adding 4 items in hashmap
        itemHashMap.put("TV", 150.00);
        itemHashMap.put("Refrigerator", 300.00);
        itemHashMap.put("Washing Machine", 450.00);
        itemHashMap.put("Laptop", 1000.00);

        //print the price of TV
        System.out.println("Price of TV is " + returnPriceOfItem(itemHashMap, "TV"));
    }


    //Returning the price of an item
    public static double returnPriceOfItem(Map<String, Double> itemHashMap, String name) {
        if (itemHashMap != null && itemHashMap.containsKey(name)) {
            return itemHashMap.get(name); //return item
        }
        else{
        return 0;}
    }

}
