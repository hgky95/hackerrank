package introduction.challenges;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.apache.commons.lang3.StringUtils;

public class JavaEndOfFile {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = "";
		List<String> list = new ArrayList<>();
		int index =0;
		while (sc.hasNext()) {
			s = sc.nextLine();
			list.add(s);
			index++;
			System.out.println(index + StringUtils.SPACE + s);
		}
		sc.close();
	}

}
