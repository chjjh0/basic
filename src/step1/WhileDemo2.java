package step1;
import java.util.Scanner;
/**
-주제 : while문으로 프로그램 종료/실행 기능 연습
-내용 : 종료/실행 중 선택에 따라 프로그램 종료/실행 기능 구현
-입력 : 종료/실행
-출력 : -
-기능 : 종료, 실행
**/
class WhileDemo2 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        
        for(;;){
            int flag = 0;
            
            System.out.print("0: 스톱 1: 실행");
            flag = scan.nextInt();
            switch(flag){
                case 0 :
                    System.out.println("시스템을 종료합니다");
                    return;
                case 1 :
                    System.out.println("시스템을 실행합니다");
                    break;
                default : 
                    break;
            }
        }
    }
}

