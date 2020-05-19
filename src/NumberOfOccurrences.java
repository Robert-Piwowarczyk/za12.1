import java.util.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.File;
import java.io.FileNotFoundException;

class NumberOfOccurrences {
    public static void main(String[] args) {
        final String fileName = "Numbers.txt";

        TreeSet<String> number = new TreeSet<>(new Comparator<String>() {
            @Override
            public int compare(String number1, String number2) {
                return number1.compareTo(number2);
            }
        });
        try {
            BufferedReader allNumbers = new BufferedReader(new FileReader(fileName));
            int number = 0;
            for (int i = 0; i > number; i++) {
                if (number ==  number[i]) {
                    Collections.frequency(allNumbers, number);
                }
            }
        } catch (FileNotFoundException e) {
        System.err.println("Brak pliku " + fileName);
        }
    }
}


