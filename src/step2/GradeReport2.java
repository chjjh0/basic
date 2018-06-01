package step2;

import java.util.Scanner;
public class GradeReport2 {

	public static String input(Scanner scan) {
		int kor = 0, eng = 0, math = 0; 
		String result = "";
		
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
				result += kor + "," + eng + "," + math + ","+ (kor+eng+math)/3;
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
		String resultString = input(scan);
		String[] resultSplit;
		resultSplit = resultString.split(",");
		System.out.println(name + " " + resultString + " "+ resultSplit);
		//int resultInt = Integer.parseInt(resultString);
		//System.out.println(name + " " + resultInt);
		//System.out.println(name + " " + Arrays.toString(result));
	}
}