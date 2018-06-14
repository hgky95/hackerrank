package introduction.strings;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class JavaSubStringComparisons {

	public static String getSmallestAndLargest(String s, int k) {
        List<String> strings = new ArrayList<>();
        
       for (int i=0; i <= s.length() - k; i++) {
    	   strings.add(s.substring(i, i + k));
       }
       
       String smallest = strings.get(0);
       String largest = strings.get(0);
       
       for (int i=1; i < strings.size(); i++) {
    	   if (largest.compareTo(strings.get(i)) <= 0) {
    		   largest = strings.get(i);
    	   }
    	   if (smallest.compareTo(strings.get(i)) > 0) {
    		   smallest = strings.get(i);
    	   }
       }
       
       /*Collections.sort(strings);
       smallest = strings.get(0);
       largest = strings.get(strings.size() - 1);*/
       
       return smallest + "\n" + largest;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();
      
        System.out.println(getSmallestAndLargest(s, k));
    }

}
