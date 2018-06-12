package introduction.strings;

import java.util.Scanner;

import org.apache.commons.lang3.StringUtils;

public class StringsIntroduction {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        sc.close();
        
        System.out.println(A.length() + B.length());
        System.out.println(A.compareTo(B) <= 0 ? "No" : "Yes");
        System.out.println(StringUtils.join(A.substring(0, 1).toUpperCase(), A.substring(1)) + StringUtils.SPACE + StringUtils.join(B.substring(0, 1).toUpperCase(), B.substring(1)));
	}

}
