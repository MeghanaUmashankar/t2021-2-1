package Program2;
import java.util.Scanner;
public class GenerateSeries {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer (a): ");
        int a = scanner.nextInt();

        System.out.print("Output: ");
        for (int i = 0; i < a; i++) {
            
            System.out.print(1 + 2 * i);
            if (i < a - 1) {
                System.out.print(", ");
            }
        }
        scanner.close();
	}
}
