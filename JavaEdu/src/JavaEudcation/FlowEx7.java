package JavaEudcation;

import java.util.Scanner;

public class FlowEx7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

		System.out.println("가위(1), 바위(2), 보(3) 중 하나를 입력하세요.> ");

		int user = scanner.nextInt();
		int com = (int) (Math.random() * 3) + 1;

		System.out.println("당신은" + (user == 1 ? "가위" : user == 2 ? "바위" : "보"));
		System.out.println("컴퓨터는" + (com == 1 ? "가위" : com == 2 ? "바위" : "보"));

		switch (user - com) {
		case 2:
		case -1:
			System.out.println("당신은 졌습니다.");
			break;
		case 1:
		case -2:
			System.out.println("당신은 이겼습니다.");
			break;

		case 0:
			System.out.println("비겼습니다.");
			break;
		default:
			break;
		}

	}

}
