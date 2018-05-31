package step1;

import java.util.Scanner;

/**
[수열 010]
1+2+3+...+100 까지의 합계 변형된 요구사항: 정수를 입력받아 두 수 사이의 합을 구하는 프로그램을 구현하시오 
출력 : 1+2+3+...+10=55

[수열012] 홀수짝수의 합계
**/
public class EvenSum {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int evensum = 0, oddsum = 0, start = 0, end = 0, tmp = 0, num1 = 0, num2 = 0, count = 0, totalCount = 0;
		String oddResult = "", evenResult = "";
		
		for(;;) {
			oddResult = ""; evenResult = ""; count = 0;
			System.out.println("첫번째 수를 입력하시오");
			num1 = scan.nextInt();
			System.out.println("두번째 수를 입력하시오");
			num2 = scan.nextInt();
			if (num1 > num2) {
				start = num2;
				end = num1;
			} else {
				start = num1;
				end = num2;
			}
			System.out.println("입력한 값의 범위는 " + start + "부터 " + end + "까지 입니다");
			System.out.println("0 : 종료 1 : 홀수의 합 2 :짝수의 합");
			switch (scan.nextInt()) {
			case 0:
				return;
			case 1:
				totalCount = end;
				for (; start <= totalCount; start++) {
					if (start % 2 == 1) {
						oddsum += start;
						count++;
					}
					oddResult = (start % 2 == 1)
							? (start == end - 1) ? 
									oddResult + start + " = " : 
									oddResult + start + " + "
							: oddResult + " ";
				}
				System.out.println(oddResult + oddsum + count + totalCount);
				break;
			case 2:
				for (; start <= end; start++) {
					if (start % 2 == 0) {
						evensum += start;
					}
					evenResult = (start % 2 == 0)
							? (start == end) ? evenResult + start + " = " : evenResult + start + " + "
							: evenResult + " ";
				}
				System.out.println(evenResult + evensum);
				break;
			default:
				System.out.println("잘못 입력했습니다");
				return;
			}
		}
	}
}