package sef.module4.activity2;

// Needs to be completed

import java.util.HashSet;

import java.util.Set;

    public class SetActivity {

        public static void main(String[] args) {

            // TODO: 1 - Type code to create a set of names using HashSet.

            // Add "John", "John", "Harry", and "Daniel" (and try adding a few more duplicate entries).
            Set<String> set = new HashSet<>();
            set.add("John");
            set.add("John");
            set.add("Harry");
            set.add("Daniel");
            set.add("Harry");
            set.add("Daniel");

            // TODO: 2 - Call print method to print the set passed as its parameter.
            print(set);
        }
            static void print(Set set) {

            // TODO: 3 - Type code to print this set

            // Notice the order in which elements get printed and whether duplicates appear.
                for (Object name : set) {
                    System.out.println(name);
                }

        }

    }

