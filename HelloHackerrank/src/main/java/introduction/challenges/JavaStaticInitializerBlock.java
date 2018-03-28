package introduction.challenges;

import java.util.Scanner;

public class JavaStaticInitializerBlock {

	private static int B;
	private static int H;
	private static boolean flag;
	static Scanner sc;

	static {
		B = 0;
		H = 0;
		sc = new Scanner(System.in);
		B = sc.nextInt();
		H = sc.nextInt();
		flag = B > 0 && H > 0 ? true : false;
		if (!flag) {
			System.out.println("java.lang.Exception: Breadth and height must be positive");
		}
	}

	public static void main(String[] args) {
		if (flag) {
			int area = B * H;
			System.out.print(area);
		}

	}// end of main

}
