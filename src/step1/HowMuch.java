package step1;
import java.util.Scanner;
public class HowMuch {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        
        while(true) {
        int price = 100;
        int quantity = 0;
        int result1 = 0;
        String result2 = "";
        int dc = 0;
        
        System.out.println("얼마에요?");
        System.out.println(price + "원입니다");
        System.out.println("몇 개 드릴까요?");
        quantity = scan.nextInt();        
        System.out.println(quantity + "개 주세요");
        result1 = price * quantity;
        
        System.out.println("총 금액은" + result1 + "원 입니다");
        System.out.println("너무 비싸!!!");
        System.out.println("OK, 조금 깍아드릴께요... 몇 퍼센트 DC 할까요?");
        dc = scan.nextInt();
        result1 -= result1 * ((double)dc/100);
        
        
        result2 = dc >= 10 ? "훠이훠이, 다른 데 가이소" : result1 + "원 입니다";
        System.out.println(result2);
        
        System.out.println("0 : 종료 1 : 재시작");
        
        switch(scan.nextInt()) {
        	case 0 : return;
        	case 1 : continue;
        	default : System.out.println("ERROR"); break;
        
        }
        
        /*
        if(dc >= 10){
            result2 = "훠이훠이, 다른데 가이소";
        } else {
            result2 = result1 + "원 입니다";
        }
        */
        
    }
}
}
