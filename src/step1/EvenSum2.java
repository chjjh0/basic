package step1;

import java.util.Scanner;

/**
[수열011] 1-2+3-4+5-6....-100 = -50 합계(스캐너 없음)
 * */
public class EvenSum2 {

	public static void main(String[] args) {
		int num1 = 1, num2 = 100, sum = 0;
		String result = "";

		for (num1=1; num1 <= num2; num1++) {
			if (num1 % 2 == 1) {
				sum -= num1;
			} else
				sum += num1;
			result = (num1 % 2 == 1) ? 
					result + num1 + "-" : num1 == num2 ? 
							result + num1 + " = " : result + num1 + "+";
			if (num1 % 10 == 0) {
				result += "\n";
			}
		}
		System.out.println(result + sum);
	}
}