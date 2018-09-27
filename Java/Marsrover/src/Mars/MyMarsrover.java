package Mars;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MyMarsrover {

	public static void main(String[] args) {
		int position = 0;
		int speed = 1;
		int numTeams = 0;
		int number = 0;
		String instruction = "�������� ������� ������ �� �����.";

		Scanner scan = new Scanner(System.in);

		while (true) {
			System.out.print("������� ����� ����� �����: ");
			try {
				number = scan.nextInt();
				break;
			} catch (InputMismatchException ignore) {
				System.out.println("���������� ��� ���. (������������ ����: ��������� ����� �����).");
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
		System.out.println("������� ��������� = " + position);
		System.out.println("�������� ��������� = " + speed);
		System.out.println("����������� ���������� ������ � ����������  = " + numTeams);
		System.out.println("�������� ����������� ����������: " + instruction);
		scan.close();
	}
}
