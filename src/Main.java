import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> word = new ArrayList<>();
        ArrayList<String> word2 = new ArrayList<>();
        System.out.println("Type any word 5 times: ");
        Scanner input = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            word.add(input.nextLine());
        }
        System.out.println("List 1: " + word);

        System.out.println("Type any word 5 times: ");
        Scanner input2 = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            word2.add(input2.nextLine());
        }
        System.out.println("List 2: " + word2 + "\n");


        ArrayList<String> word3 = new ArrayList<>();
        word3.addAll(word);
        word3.addAll(word2);

        Collections.swap(word3, 9, 1);
        Collections.swap(word3, 9, 2);
        Collections.swap(word3, 8, 3);
        Collections.swap(word3, 7, 4);
        Collections.swap(word3, 9, 4);
        Collections.swap(word3, 9, 5);
        Collections.swap(word3, 8, 6);
        Collections.swap(word3, 8, 7);
        System.out.println("List 3: " + word3 + "\n");


        Collections.sort(word3, new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                return s1.compareToIgnoreCase(s2);
            }
        });
        System.out.println("Sorted items from A to Z: " + word3);
    }
}