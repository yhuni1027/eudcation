package JavaEudcation;

import java.util.*;
public class ScannerEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner  = new Scanner(System.in);
		System.out.println("숫자를이볅 받으세요");
		
		String input =scanner.nextLine();
		
		int num = Integer.parseInt(input);
		
		System.out.println("입력받은 값 : " + input);
		
		System.out.printf("num=%d%n", num);
		
	}

}
