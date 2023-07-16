package JavaEudcation;
public class GuguDan {

	public static void main(String[] args) {

		System.out.println("helloworld");

		for (int i = 2; i <= 9; i++) {

			String is = Integer.toString(i);

			for (int j = 1; j <= 9; j++) {

				String js = Integer.toString(j);

				int sum = i * j;
				String isum = Integer.toString(sum);
				System.out.println(is + " * " + js + " = " + isum);
			}
			System.out.println();

		}
		
		String[] nameArr = {"kim","lee","park"};
		String name = String.join(",", nameArr);
		System.out.println(name);
		
		
		
	}

}
