package sef.module4.activity2;

// Needs to be completed

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Iterator;

    public class MapActivity {

        public static void main(String[] args) {

            // 1 - Type code to create a HashMap of key-value pairs

            // where key is id of type String and value is a name
            Map<String, String> map = new HashMap<>();
            map.put("1", "Sara");
            map.put("2", "Alin");
            map.put("3", "David");

            // 2 - Call print method to print the map passed as its parameter.

            // (Hint: Notice print() is a non-static method, so create an instance of MapActivity)
            MapActivity activity = new MapActivity();
            activity.print(map);

        }

        void print(Map map) {

            // 3 - Type code to print this map (keys and values)
            Set keys = map.keySet();
            for (Object key : keys) {
                System.out.println(  "\t"+key + "\t" + map.get(key));
            }

        }

    }


