import java.util.Scanner;
import java.util.ArrayList;
public class FifthItem {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        boolean x = true;
        while (x) {
            String response = scanner.nextLine();
            list.add(response);
            if (response.equals("")) {
                x = false;
                System.out.println("The fifth item in the list is: " + list.get(4));
            }
        }
    }
}