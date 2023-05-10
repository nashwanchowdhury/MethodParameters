import java.util.ArrayList;
import java.util.Scanner;
public class SumOfList {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        boolean x = true;
        while (x) {
            int response = Integer.parseInt(scanner.nextLine());
            list.add(response);
            if (response == 0) {
                x = false;
                int sum = 0;
                for (int i = 0; i < list.size(); i++) {
                    sum = sum + list.get(i);
                }
                System.out.println(list + " were the items in the list. The sum of that list is: " + sum);
            }
        }
    }
}