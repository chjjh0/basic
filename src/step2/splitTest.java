package step2;

import java.util.Arrays;

public class splitTest {
	public static void main(String[] args) {
		String str1 = "1. 2. 3";
		System.out.println(str1);
		String str2[] = str1.split("\\.");
		System.out.println(Arrays.toString(str2));
		System.out.printf("%s %s %s", str2[0], str2[1], str2[2]);
	}
}
