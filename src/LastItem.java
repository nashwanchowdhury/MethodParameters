import java.util.ArrayList;
import java.util.Scanner;
public class LastItem {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        boolean x = true;
        while (x) {
            String response = scanner.nextLine();
            list.add(response);
            if (response.equals("")) {
                x = false;
                System.out.println("The last item in the list is: " + list.get(list.size() - 2));
            }
        }
    }
}