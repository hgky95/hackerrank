package introduction.challenges;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author hgky
 *
 */

public class JavaLoopII {

	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
		int a = 0,b = 0,n = 0;
		int queryNumber = in.nextInt();
		List<Integer> firstSubSequents = new ArrayList<Integer>();
		List<List<Integer>> secondSubSequents = new ArrayList<List<Integer>>();
		for (int i=0; i<queryNumber; i++) {
			prepareInput(in, firstSubSequents, secondSubSequents);
		}
		for (int i=0; i<queryNumber; i++) {
			a = secondSubSequents.get(i).get(0);
			b = secondSubSequents.get(i).get(1);
			n = secondSubSequents.get(i).get(2);
			int firstValue = a + b;
			List<Integer> results = new ArrayList<Integer>();
			results.add(firstValue);
			for (int j=1; j<n; j++) {
				calculateSequenceOfNumber(b, results, j);
			}
			for (Integer result:results) {
				System.out.printf("%s ",result);
			}
			System.out.println();
		}
        in.close();
	}

	private static void calculateSequenceOfNumber(int b, List<Integer> results, int j) {
		int value;
		value = (int) (results.get(j-1) + b*Math.pow(2, j));
		results.add(value);
	}

	private static void prepareInput(Scanner in, List<Integer> firstSubSequents, List<List<Integer>> secondSubSequents) {
		int a;
		int b;
		int n;
		a = in.nextInt();
		b = in.nextInt();
		n = in.nextInt();
		firstSubSequents.clear();
		firstSubSequents.add(a);
		firstSubSequents.add(b);
		firstSubSequents.add(n);
		secondSubSequents.add(new ArrayList<Integer>(firstSubSequents));
	}
}
