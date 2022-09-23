package edu.cscc;

import java.sql.SQLOutput;
import java.util.TreeSet;
import java.util.Iterator;

//Tristan DeMaria, Lab#13, 4/26/2021
//Program is meant to print a tree set in order, then in reverse order, with titles for both sections.

public class Main {
    public static void main(String[] args) {

        //Remember, by definition, Tree Sets are put in natural order, so
        //printing as in the enhanced for loop below will display in alphabetic order
        System.out.println("Tree Set in Natural Order: ");
        System.out.println();
        TreeSet<String> tree_set = new TreeSet<>();
        tree_set.add("Red");
        tree_set.add("Green");
        tree_set.add("Orange");
        tree_set.add("White");
        tree_set.add("Black");

        for(String s: tree_set) {
            System.out.println(s);
        }

        System.out.println();
        System.out.println("Elements in Reverse Order: ");
        System.out.println();

        //create descending iterator object to reverse list later
        Iterator reverse = tree_set.descendingIterator();

        while(reverse.hasNext()){
            System.out.println(reverse.next());
        }
    }
}
