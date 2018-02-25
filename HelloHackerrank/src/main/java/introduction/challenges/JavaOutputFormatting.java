package introduction.challenges;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class JavaOutputFormatting {

	private static Scanner scanner;

	public static void main(String[] args) {
		scanner = new Scanner(System.in);
        List<String> strings = new ArrayList<>();
        List<Integer> listOfInteger = new ArrayList<>();
        inputValue(strings, listOfInteger);
        if (strings.size() == 3) {
        	showResult(strings, listOfInteger);
        }
        
	}

	private static void showResult(List<String> strings, List<Integer> listOfInteger) {
		System.out.println("================================");	
		for(int i=0; i<3; i++) {
			System.out.println(String.format("%-15s%03d", strings.get(i), listOfInteger.get(i)));
		}
		System.out.println("================================");
	}

	private static void inputValue(List<String> strings, List<Integer> listOfInteger) {
		for(int i=0; i<3; i++)
        {
            String s = scanner.next();
            int x = scanner.nextInt();
            if (s.length() > 10 || x < 0 || x > 999) {
            	break;
            }
            strings.add(s);
            listOfInteger.add(x);
        }
	}
}
