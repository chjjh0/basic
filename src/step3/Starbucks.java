package step3;

import java.util.Scanner;

public class Starbucks {
public static String[] menu(int param) {
	String result[] = new String[3];
	String[] menu = { "1:아메리카노", "2:카페라떼", "3:카푸치노", "4:망고스무디", "5:자몽에이드" };
	String[] priceTable = { "3000", "3500", "4000", "4500", "5000" };
	switch(param) {
	case 1: result[0] = menu[0]; result[1] = priceTable[0]; break;
	case 2: break;
	case 3: break;
	case 4: break;
	case 5: break;
	default: break;
	}
	return result;
}
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	while(true) {
		String[] menu = { "1:아메리카노", "2:카페라떼", "3:카푸치노", "4:망고스무디", "5:자몽에이드" };
		String[] priceTable = { "3000", "3500", "4000", "4500", "5000" }; 
		String[] result = new String[4];
		int quantity = 0, price=0, total=0;
		String menuSelect = "";
		System.out.println("메뉴를 골라주세요");
		System.out.printf(
				"0:종료 \n" 
				+ "%s [%s원]\n"
				+ "%s [%s원]\n"
				+ "%s [%s원]\n"
				+ "%s [%s원]\n"
				+"%s [%s원]\n", 
				menu[0], priceTable[0], menu[1], priceTable[1], menu[2], priceTable[2], menu[3], priceTable[3], menu[4], priceTable[4]);
		
		switch(scan.nextInt()) {
			case 0: return;
			case 1: result[0] = menu[0]; result[1] = priceTable[0] ; break;
			case 2: result[0] = menu[1]; result[1] = priceTable[1] ; break;
			case 3: result[0] = menu[2]; result[1] = priceTable[2] ; break;
			case 4: result[0] = menu[3]; result[1] = priceTable[3] ; break;
			case 5: result[0] = menu[4]; result[1] = priceTable[4] ; break;
			default : break;
		}
		System.out.println("몇 잔 드릴까요?\n");
		quantity = scan.nextInt();
		result[2] = String.valueOf(quantity);
		result[3] = String.valueOf(Integer.parseInt(result[1]) * quantity);
		
		System.out.println("1:추가로 주문하시겠습니까?\n" + "0:주문 완료\n");
		switch(scan.nextInt()) {
		case 0: 
			System.out.printf("선택하신 메뉴는 [%s]\n" + "수량은 [%s]\n" +"결제금액은 [%s]원입니다\n", result[0], result[2], result[3]);
			break;
		case 1:
			continue;
		default : break;
		}
	}
}
}