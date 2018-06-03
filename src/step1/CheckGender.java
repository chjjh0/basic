package step1;
/**
-주제 : 주민번호로 성별 알려주기
-내용 : 주민번호 7번째 자리를 기준으로 성별 구별하여 출력 
-입력 : 이름, 주민번호
-출력 : 이름, 성별
-기능 : 종료, 재시작
**/
import java.util.Scanner;
public class CheckGender {
	public static String check(String param) {
		String result="";
		char ch = param.charAt(7);
		switch(ch){
        	case '1' : case '3' : result = "남자"; break;
        	case '2' : case '4' : result = "여자"; break;
        	case '5' : case '6' : result = "외국인"; break;
        	default : result = "ERROR"; break;}
		return result;
}
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        while(true){
            System.out.println("[0] 종료 [1] 실행");
            switch(scan.nextInt()) {
            case 0: return;
            case 1:
	        	String category[] = {"이름", "주민번호"};
	        	String[] temp = new String[2];
	        	String[] result = new String[2];
	        	
	        	for(int i=0;i<category.length;i++) {
	        		System.out.printf("[ %s ]을 입력하세요", category[i]);
	        		temp[i] = scan.next();
	        	}
	        	result[0] = temp[0];
	        	result[1] = check(temp[1]);
	        	System.out.printf("이름: %s 성별: %s\n", result[0], result[1]);
	        	break;
	        default : System.out.println("ERROR"); break;
            }
        }
    }
}