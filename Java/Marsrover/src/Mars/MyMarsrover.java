package Mars;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MyMarsrover {

	public static void main(String[] args) {
		int position = 0;
		int speed = 1;
		int numTeams = 0;
		int number = 0;
		String instruction = "Марсоход остался стоять на месте.";

		Scanner scan = new Scanner(System.in);

		while (true) {
			System.out.print("Введите любое целое число: ");
			try {
				number = scan.nextInt();
				break;
			} catch (InputMismatchException ignore) {
				System.out.println("Попробуйте еще раз. (Неправильный ввод: требуется целое число).");
				scan.nextLine();
			}
		}

		if (number != 0) {
			instruction = "";
			if (number < 0) {
				speed = -1;
				instruction += "R";
				numTeams++;
			}
			while (true) {
				if (position == number) {
					break;
				} else if ((position > number) & (speed > 0)) {
					speed = -1;
					instruction += "R";
					numTeams++;
				} else if ((position < number) & (speed < 0)) {
					speed = 1;
					instruction += "R";
					numTeams++;
				}
				position += speed;
				speed *= 2;
				instruction += "A";
				numTeams++;
			}
		}
		System.out.println("Позиция марсохода = " + position);
		System.out.println("Скорость марсохода = " + speed);
		System.out.println("Минимальное количество команд в инструкции  = " + numTeams);
		System.out.println("Наиболее оптимальная инструкция: " + instruction);
		scan.close();
	}
}
