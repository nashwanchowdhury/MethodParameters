import java.util.ArrayList;
import java.util.Scanner;
public class IndexOfInteger {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        boolean x = true;
        while (x) {
            int response = Integer.parseInt(scanner.nextLine());
            list.add(response);
            if (response == 0) {
                x = false;
                System.out.println("Done entering integers into the list");
                System.out.println("What number are you looking for in the list?");
                int response2 = Integer.parseInt(scanner.nextLine());
                for (int i = 0; i < list.size(); i++) {
                    if (list.get(i) == response2) {
                        System.out.println(response2 + " is at index " + i);
                    }
                }
            }
        }
    }
}