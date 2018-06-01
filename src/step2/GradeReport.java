package step2;

import java.util.Arrays;
import java.util.Scanner;

public class GradeReport {
	public static int[] input(Scanner scan) {
		int kor = 0, eng = 0, math = 0; 
		int[] result = new int[4];
		
		while (true) {
			System.out.println("국어 점수를 입력하세요");
			kor = scan.nextInt();
			if (kor >= 0 && kor <= 100) {
				System.out.println("영어 점수를 입력하세요");
				eng = scan.nextInt();
			} else {
				System.out.println("잘못 입력했습니다");
				continue;
			}

			if (eng >= 0 && eng <= 100) {
				System.out.println("수학 점수를 입력하세요");
				math = scan.nextInt();
			}
			if (math >= 0 && math <= 100) {
				result[0] = kor;
				result[1] = eng;
				result[2] = math;
				result[3]= (kor + eng + math) / 3;
			} else {
				System.out.println("잘못 입력했습니다");
				continue;
			}
			System.out.println(result);
			return result;
		}
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String name = "";
		
		System.out.print("이름을 입력하세요");
		name = scan.next();
		int result[] = input(scan);
		System.out.println(name + " " + result[0] + " " + result[1] + " " + result[2] + " " + result[3]);
		System.out.println(name + " " + Arrays.toString(result));
	}
}