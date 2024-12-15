package Program3;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class OddNumberSeries {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number (a): ");
        int a = scanner.nextInt();
        
        if (a % 2 == 0) {
            a -= 1;
        }
        
        List<Integer> series = new ArrayList<>();
        for (int i = 0; i < a; i++) {
            series.add(2 * i + 1); // Generate the ith odd number
        }
        
        System.out.println("Output: " + series);
        
        scanner.close();
    }

}
