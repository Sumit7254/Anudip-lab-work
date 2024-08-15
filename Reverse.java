import java.util.ArrayList;
import java.util.Collections;

class StringListReverser {
    private ArrayList<String> stringList;

    // Constructor to initialize the list
    public StringListReverser(ArrayList<String> stringList) {
        this.stringList = stringList;
    }

    // Method to reverse the list
    public void reverseList() {
        Collections.reverse(stringList);
    }

    // Method to display the list
    public void displayList() {
        for (String str : stringList) {
            System.out.println(str);
        }
    }
}

public class Main {
    public static void main(String[] args) {
        // Create an ArrayList of strings
        ArrayList<String> stringList = new ArrayList<>();
        stringList.add("Apple");
        stringList.add("Banana");
        stringList.add("Cherry");
        stringList.add("Date");

        // Create an instance of StringListReverser and pass the list
        StringListReverser reverser = new StringListReverser(stringList);

        // Display original list
        System.out.println("Original List:");
        reverser.displayList();

        // Reverse the list
        reverser.reverseList();

        // Display reversed list
        System.out.println("\nReversed List:");
        reverser.displayList();
    }
}
