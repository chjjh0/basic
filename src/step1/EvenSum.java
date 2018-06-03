package step1;

import java.util.Scanner;

/**
[수열 010]
1+2+3+...+100 까지의 합계 변형된 요구사항: 정수를 입력받아 두 수 사이의 합을 구하는 프로그램을 구현하시오 
출력 : 1+2+3+...+10=55

[수열012] 홀수짝수의 합계
**/
public class EvenSum {
	static Scanner scan = new Scanner(System.in);

	public static String[] input () {
		String[] params = { "", "" };
		System.out.println("첫번째 수를 입력하시오");
		params[0] = scan.next();
		System.out.println("두번째 수를 입력하시오");
		params[1] = scan.next();
		return params;
	}
	
	public static String[] swap (String[] params) {
		int num1 = Integer.parseInt(params[0]), num2 = Integer.parseInt(params[1]);
		String[] result = new String[2];
		if (num1 > num2) {
			result[0] = String.valueOf(num2);
			result[1] = String.valueOf(num1);
		} else {
			result[0] = String.valueOf(num1);
			result[1] = String.valueOf(num2);
		}
		System.out.printf("입력한 값의 범위는  [%s] 부터 [%s] 까지입니다\n", result[0], result[1]);
		return result;
	}
	
	public static String[] total (String[] params) {
		int start = 0, end = 0, oddSum = 0, evenSum = 0;
		String[] result = { "", "", "", "" };
		start = Integer.parseInt(params[0]);
		end = Integer.parseInt(params[1]);
		
		for(;start<=end;start++) {
			if (start % 2 == 1) {
				oddSum += start;
				result[0] = String.valueOf(oddSum);
				result[1] += (start == end-1) ? 
						  start + " = " :
						  start + " + ";
			} else if(start % 2 == 0) { 
				evenSum += start;
				result[2] = String.valueOf(evenSum);
				result[3] += (start == end) ? 
					    start + " = " :
						start + " + ";
			} else System.out.println("ERROR");
		}
		return result;
		}
	
	public static void main(String[] args) {
		String[] params = new String[2];
		String[] range = new String[4];
		String[] result;
		
		while(true) {
			System.out.println("[0] 종료  [1] 홀수의 합  [2] 짝수의 합");
			switch(scan.nextInt()) {
				case 0: return;
				case 1: 
					params = input();
					result = total(swap(params));
					System.out.printf("결과값 : %s %s \n", result[1], result[0]);
					break;
				case 2:
					params = input();
					result = total(swap(params));
					System.out.printf("결과값 : %s %s \n", result[3], result[2]);
					break;
				default : System.out.println("ERROR"); break;
			}
		}
	}
}