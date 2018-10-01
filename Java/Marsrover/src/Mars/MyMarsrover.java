package Mars;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MyMarsrover {

	public static void main(String[] args) {
		int position1 = 0;
		int speed1 = 1;
		int numTeams1 = 0;
		String instruction1 = "";
		
		int position2 = 0;
		int speed2 = 1;
		int numTeams2 = 0;
		String instruction2 = "";
		
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
			//First method
			while (true) {
				if (position1 == number) {
					break;
				} else if ((position1 > number) & (speed1 > 0)) {
					speed1 = -1;
					instruction1 += "R";
					numTeams1++;
				} else if ((position1 < number) & (speed1 < 0)) {
					speed1 = 1;
					instruction1 += "R";
					numTeams1++;
				}
				position1 += speed1;
				speed1 *= 2;
				instruction1 += "A";
				numTeams1++;
			}
										
			if(number%2 != 0){
				//Second method
				while (true) {

					if (position2 == number) {
						break;
					} else if (((number-position2) < speed2) & (speed2 > 0)) {
						speed2 = -1;
						instruction2 += "R";
						numTeams2++;
					} else if (((number-position2) > speed2) & (speed2 < 0)) {
						speed2 = 1;
						instruction2 += "R";
						numTeams2++;					
					} 
					position2 += speed2;
					speed2 *= 2;
					instruction2 += "A";
					numTeams2++;
				}
				
				if(numTeams2 < numTeams1){
					System.out.println("Позиция марсохода = " + position2);
					System.out.println("Скорость марсохода = " + speed2);
					System.out.println("Минимальное количество команд в инструкции  = " + numTeams2);
					System.out.println("Наиболее оптимальная инструкция: " + instruction2);
				} else{
					System.out.println("Позиция марсохода = " + position1);
					System.out.println("Скорость марсохода = " + speed1);
					System.out.println("Минимальное количество команд в инструкции  = " + numTeams1);
					System.out.println("Наиболее оптимальная инструкция: " + instruction1);
				}
				
			} else{
				System.out.println("Позиция марсохода = " + position1);
				System.out.println("Скорость марсохода = " + speed1);
				System.out.println("Минимальное количество команд в инструкции  = " + numTeams1);
				System.out.println("Наиболее оптимальная инструкция: " + instruction1);
			}
	
	} else{
		System.out.println("Позиция марсохода = " + position1);
		System.out.println("Скорость марсохода = " + speed1);
		System.out.println("Минимальное количество команд в инструкции  = " + numTeams1);
		System.out.println("Наиболее оптимальная инструкция: " + instruction);
	}
		scan.close();
  }
}
