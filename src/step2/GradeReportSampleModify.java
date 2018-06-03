package step2;

import java.util.Scanner;

public class GradeReportSampleModify {
	public static boolean input(int param) {
		boolean flag = (param>=0 && param<=100)? true:false ;
		return flag;
	}
	public static String[] getTotal(String[] params){
		//ver 1
		String[] result = new String[2];
		int sum = 0;
		
		for(int i=0;i<params.length;i++) {
			result[0] = String.valueOf(sum += Integer.parseInt(params[i]));
		}
		
		/*ver 2
		String[] result = new String[2];
		int sum = 0;
		result[0] = String.valueOf(sum); 
						
		for(int i=0;i<params.length;i++) {
			result[0] = String.valueOf(Integer.parseInt(result[0]) + Integer.parseInt(params[i]));
		}*/
		
		result[1] = String.valueOf(Integer.parseInt(result[0])/params.length);
		return result;
	}
	public static String[] getGrade(String[] params){
		String[] result = new String[3];
		for(int i=0;i<params.length;i++) {
			result[i] = params[i];
		}
	    switch(Integer.parseInt(params[1])/10){
            case 9: result[2]="A"; break;
            case 8: result[2]="B"; break;
            case 7: result[2]="C"; break;
            case 6: result[2]="D"; break;
            case 5: result[2]="E"; break;
            default : result[2]="F"; break;
        }
	    return result;
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String[] subjects = {"국어","영어","수학", "사회", "java", "oracle"};
		String[] params = new String[subjects.length];

		System.out.print("이름을 입력하세요");
		String name = scan.next();
		
		for(int i=0;i<params.length;i++){
			System.out.println(subjects[i]+" 점수를 입력하세요");
			int temp = scan.nextInt();
			if(input(temp)){
				params[i] = String.valueOf(temp);
			}else{
				i--;
			}
		}
		String[] arr = getGrade(getTotal(params));
		System.out.printf("************************************\n" +
							"| 이름  |  총점     |  평균    | 등급  |\n" +
							"-------------------------------------\n" +
							"| %s | %s | %s | %s |\n" +
							"************************************",
							name,arr[0],arr[1],arr[2]);
	}
}