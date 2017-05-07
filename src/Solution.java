import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        int line = (int) Math.round(Math.sqrt(s.length()));
        int column = ((line * line) >= s.length()) ? line : line + 1;
        String [][] crypt = new String[line][column];
        int counter = 0;
        int counter2 = 0;
        String print = "";
        for (int i=0; i < line; i++){
            for (int j=0; j < column; j++){
                if (counter < s.length()) {
                    crypt[i][j] = "" + s.charAt(counter);
                    counter++;
                }
            }
        }
        for (int j=0; j < column; j++){
            for (int i=0; i < line; i++){
                counter2++;
                print += (crypt[i][j] != null) ? crypt[i][j] : "";
                if (counter2==line) {
                    print += " ";
                    counter2 = 0;
                }
            }
        }
        System.out.println(print);
    }
}
