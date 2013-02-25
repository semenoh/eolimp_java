import java.math.BigInteger;
import java.util.Scanner;

/**
 * @author oleg.semen
 * 
 *         Рівень паліндромності
 * 
 *         Задано натуральне число M. Якщо це не паліндром, то записуємо його у
 *         зворотному порядку та додаємо до заданого. Кроки повторюються, доки
 *         не буде отримано число-паліндром. Кількість виконаних операцій
 *         назвемо рівнем паліндромності заданого числа.
 * 
 *         Знайти рівень паліндромності числа М.
 * 
 *         Технічні умови:
 *         
 *         Вхідні дані:
 *         Єдине число М (0 < М < 10000).
 * 
 *         Вихідні дані:
 *         Єдине число - рівень паліндромності.
 * 
 *         Інформація про задачу 
 *         Ліміт часу: 1 секунда 
 *         Ліміт пам`яті: 64 MB 
 *         Бали за пройдений тест: 10 
 *         Складність: 36% 303/477 
 * 
 *         Приклад 
 *         Приклад вхідних даних 
 *         865 
 *         Приклад вихідних даних 2
 */

public class eolimp_0029_PalindromeLevel {
  static BigInteger reverse(BigInteger i) {
		return new BigInteger(new StringBuffer(i.toString()).reverse()
				.toString());
	}

	static boolean isPalindrome(BigInteger i) {
		return i.compareTo(reverse(i)) == 0;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		BigInteger n = new BigInteger(in.next());
		in.close();

		int counter = 0;
		while (!isPalindrome(n)) {
			n = n.add(reverse(n));
			++counter;
		}

		System.out.println(counter);
	}
}
