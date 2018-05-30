package step1;
import java.util.Scanner;
/**
-주제 : for문 연습
-내용 : for문 연습
-기능 : 종료, 재시작
**/
public class ForDemo1 {
    public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
        
    while(true){
        int count = 0, sum = 0;
        
        System.out.println("0 : 종료 1 : 실행");
        switch(scan.nextInt()){
            case 0 : 
                System.out.println("종료!!");
                return;
            case 1 :
                System.out.println("실행!!");
                for(count=1;count < 11;count++){                   
                    sum+=count;
                }         
                break;
            default :
                System.out.println("ERROR!!");
                break;
        }
        System.out.println(sum);
    }
    
    }
    
}