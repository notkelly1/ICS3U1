/* Kelly Wang ICS3U 2025-05-14

"TimeTable"

Create a 2D array of characters with the specified dimensions, and initialize each element to be ‘*’.  Then print out the content of the array as a table to the file “star.txt”.
*/

import java.util.*;
import java.lang.*;
import java.io.*;
public class TimeTable {
    public static void main(String[] args) {
        // initialize objects
        final String FILE_NAME = "timetable.txt";

        try {
            // try to create a buffered writer object
            BufferedWriter out = new BufferedWriter(new FileWriter(FILE_NAME, false));

            // print the times table to the file
            for (int i = 1; i <= 12; i++) {
                for (int j = 1; j <= 12; j++) {
                    out.write(i * j + "\t");
                }
                out.write("\n");
            }

            // dont forget to close the file
            out.close();
        } catch (IOException e) {
            // catch any errors
            System.out.println("Error: " + e);
        }
    }
}