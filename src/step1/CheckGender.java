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
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        
        while(true){
            
        	String name = "", idNumber = "", gender = "", error = "ERROR", result = "";
        	char ch = 0;
        
        	scan.nextLine();
        	System.out.print("이름");
        	name = scan.nextLine();
        	
        System.out.print("주민번호");
        idNumber = scan.nextLine();
        
        ch = idNumber.charAt(7);
        
        switch(ch){
            case '1' : case '3' : gender = "남자"; break;
            case '2' : case '4' : gender = "여자"; break;
            case '5' : case '6' : gender = "외국인"; break;
            default : result = error; }
        //System.out.println(result);
        
        if(!result.equals(error)){
            result = "이름 : " + name + " 성별 : "+ gender + "입니다";
        } else {
            result = result;            
        }
        System.out.println(result);
        System.out.println("0 : 종료 1 : 재시작");
            switch(scan.nextInt()){
                case 0 : return; 
                case 1 : continue;
                default : System.out.println(error); return;
        }
    }
}
}