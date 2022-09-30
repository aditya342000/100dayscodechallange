//You are given a date. You just need to write the method,getDay , which returns the day on that date. To simplify your task, we have provided a portion of the code in the editor.
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int month = scanner.nextInt();
            int day = scanner.nextInt();
            int year = scanner.nextInt();

            Calendar calendar = Calendar.getInstance();
            calendar.set(Calendar.DATE, day);
            calendar.set(Calendar.MONTH, month - 1);
            calendar.set(Calendar.YEAR, year);

            System.out.println(calendar.getDisplayName(Calendar.DAY_OF_WEEK,
                    Calendar.LONG, new Locale("en", "US")).toUpperCase());
        }
    }
}
