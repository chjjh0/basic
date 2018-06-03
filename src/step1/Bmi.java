package step1;

import java.util.Scanner;

/**
 * -주제 : BMI 지수 구하기 
 * -내용 : '몸무게'와 '키'를 입력받고 연산하여 BMI 지수를 출력 
 * -입력 : 이름, 몸무게, 키 
 * -출력 : 이름, BMI 지수, 정상/비정상 여부 
 * -기능 : 실행, 종료
 **/
public class Bmi {

	public static String calc(String[] params) {
		double height = Integer.parseInt(params[1]) * 0.01;
		double weight = Integer.parseInt(params[0]);
		
		String bmi = String.valueOf((int)((weight / (height * height))));
		return bmi;
	}
	
	public static String grade(int param) {
		String result = "";
		
		if (param < 20) {
			result = "저체중";
		} else if (param >= 20 && param <= 24) {
			result = "정상체중";
		} else if (param >= 25 && param <= 30) {
			result = "경도비만";
		} else
			result = "비만";
		return result; 
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		while (true) {
			System.out.println("[0] : 종료 [1] 실행");
			switch(scan.nextInt()) {
				case 0: return;
				case 1: 
			
					String[] category = { "몸무게", "키" };
					String name = "";
					String[] temp = new String[category.length];
					String[] result = new String[3];

					System.out.println("이름을 입력하세요");
					name = scan.next();
					
					for (int i = 0; i < category.length; i++) {
						System.out.printf("[ %s ]를 입력하세요", category[i]);
						temp[i] = scan.next();
					}
					result[0] = calc(temp);
					result[1] = grade(Integer.parseInt(result[0])); 
					
					System.out.printf("%s 님의 BMI 지수는  %s 로 [ %s ] 입니다 \n",
										name, result[0], result[1]);
					break;
				default : System.out.println("ERROR");
			}
		}
	}
}