// Jennifer Broxson
// C00278444
// CMPS 261
// Program Description: Read words from a text file and print all non-duplicate words in ascending order. Solution must use a
//class from the Java API that implements interface Set as an integral part of the solution.
//I certify that the code in the method functions including method function main of this project are entirely my own work.

package com.company;

/**
 * @author C00278444
 * @version 1.0
 * <p>Read words from a text file and print all non-duplicate words in ascending order. Solution must use a
 * class from the Java API that implements interface Set as an integral part of the solution.</p>
 */

import java.io.*;
import java.util.*;

public class Main {
    /**
     * @param args
     * @exception Exception or (should be) IOException thrown if java cannot read file
     * <p>This is the main method. It reads a text file into an SortedSet. Then prints the words in ascending order using an Iterator. </p>
     */

    public static void main(String[] args){

        SortedSet<String> wordsList = new TreeSet<String>();
        try {
            Scanner s = new Scanner(new File("fstein.txt"));
            while (s.hasNext()){
                wordsList.add(s.next());
            }
            s.close();

        } catch(Exception e) {
            e.printStackTrace();
        }

        int count = 0;
        Iterator<String> i = wordsList.iterator();
        while (i.hasNext()) {
            count++;
            System.out.println(i.next());
        }

       System.out.println("There are " + count + " number of words in the list."); //I just wanted to do this

    }
}
