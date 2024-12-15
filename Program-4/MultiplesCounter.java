package Program4;
import java.util.*;
public class MultiplesCounter {
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1, 2, 8, 9, 12, 46, 76, 82, 15, 20, 30);

        int[] divisors = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        Map<Integer, Integer> result = new HashMap<>();

        for (int divisor : divisors) {
            result.put(divisor, 0);
        }
        for (int number : numbers) {
            for (int divisor : divisors) {
                if (number % divisor == 0) {
                    result.put(divisor, result.get(divisor) + 1);
                }
            }
        }
        System.out.println(result);
	}
}
