package sef.module4.activity2;

// Needs to be completed

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

    public class ListActivity {

        public static void main(String[] args) {

            // TODO: 1 - Type code to create a list of names. Use ArrayList.

            // Add "John", "John", "Harry", and "Daniel" to the list.
            List<String> list = new ArrayList<>();
            list.add("John");
            list.add("John");
            list.add("Harry");
            list.add("Daniel");


            // TODO: 2 - Call print method to print the list passed as its parameter.
            print(list);

        }

        static void print(List list) {

            // TODO: 3 - Type code to print this list
            Iterator<Object> it = list.iterator();
               for (Object name: list)
                {
                    System.out.println(name);
                }

            // Notice the order in which elements get printed.

        }

    }


