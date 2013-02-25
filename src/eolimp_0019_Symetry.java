import java.util.Scanner;

/**
 * @author oleg.semen
 * 
 *         Степінь симетрії Степенем симетрії натурального числа назвемо
 *         кількість пар його десяткових цифр, у яких цифри співпадають і
 *         розташовані симетрично відносно середини десяткового запису цього
 *         числа. Якщо деяка цифра стоїть посередині десяткового запису, її теж
 *         треба враховувати у парі з нею самою. Знайти степінь симетрії числа
 *         N.
 * 
 *         Технічні умови 
 *         
 *         Вхідні дані
 * 
 *         У вхідному рядку міститься єдине натуральне число N (N < 2·109).
 * 
 *         Вихідні дані
 * 
 *         Потрібно вивести єдине число – степінь симетрії числа N.
 * 
 * 
 *         Інформація про задачу 
 *         Ліміт часу: 1 секунда 
 *         Ліміт пам`яті: 64 MB Бали
 *         за пройдений тест: 10 
 *         Складність: 11% 860/966 
 * 
 *         Приклад 
 *         Приклад вхідних даних  	Приклад вихідних даних 
 *         123322 						2
 *         55555 						3
 *          
 */

public class eolimp_0019_Symetry {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String s = in.next();
		in.close();
		int l = s.length();
		int counter = l % 2;

		for (int pos = l / 2 - 1; pos >= 0; --pos)
			if (s.charAt(pos) == s.charAt(l - pos - 1))
				++counter;

		System.out.println(counter);
	}
}