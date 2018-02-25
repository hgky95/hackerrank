package introduction.challenges;

import java.util.Scanner;

import org.apache.commons.lang3.StringUtils;

/*
 * N * i = result
 */
public class JavaLoop {
	
	private static Scanner sc;

	public static void main(String[] args) {
		sc = new Scanner(System.in);
		String s = StringUtils.SPACE;
		int x = sc.nextInt();
		for (int i=1; i < 11; i++) {
			System.out.println(x + s + "x" + s + i + s + "=" + s + x*i);
		}
	}

}
