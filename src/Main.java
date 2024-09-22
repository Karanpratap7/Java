import java.util.ArrayList;
import java.util.Scanner;

public class Main {
        public static void main(String[] args) {

            ArrayList<String> fruits = new ArrayList<>();

            fruits.add("apple");

            fruits.add("banana");

            fruits.add("cherry");

            fruits.add("date");



            fruits.add(2, "elderberry");

            fruits.remove(4);



            System.out.println(fruits);
            
    }
}