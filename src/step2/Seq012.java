package step2;

import java.util.Scanner;

/**
 * [수열012] 홀수짝수의 합계
 * 미완성
 */
public class Seq012 {
	public static int[] input(Scanner sc) {
		int[] result = new int[2];
		result[0] = 0;
		result[1] = 0;
		int start = 0, end = 0;
		
		System.out.println("시작값을 입력하시오.");
		int num1 = sc.nextInt();
		System.out.println("끝값을 입력하시오");
		int num2 = sc.nextInt();
		
		if (num1 > num2) {
			start = num2;
			end = num1;
		} else {
			start = num1;
			end = num2;
		}
		result[0] = start;
		result[1] = end;
		System.out.println(result[0] + result[1]);
		return result;
	}

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            String result = "";
        
            System.out.println("0.종료 1.홀수의 합 2.짝수의 합");
            int start =0, end = 0, tmp=0, sum=0,count=0,totalCount=0;
            int[] range = new int[2];
            switch (sc.nextInt()) {
            
            case 0:
                return;
            case 1:
            	start =0; end = 0; tmp=0; sum=0; count=0; totalCount=0;
                range = input(sc);

                for(int i=start;i<=end;i++){
                    if(i%2 != 0){
                        count++;
                    }
                totalCount = count;
                count = 0;
                
	                for(int j = start; j <= end; j++) {
	                    if(i%2 != 0){
	                        count++;
	                    }
	                    if(count==totalCount){
	                            result += j+"=";
	                    } else{
	                            result += j+"+";
	                    }
	                      sum += j;
	                    }
                }
                System.out.println(result + sum);
                break;
            case 2:
                input(sc);
                for(int i=start;i<=end;i++){
                    if(i%2 == 0){
                        count++;
                    }
                totalCount = count;
                count = 0;
                
	                for(int j = start; j <= end; j++) {
	                    if(i%2 == 0){
	                        count++;
	                    }
	                    if(count==totalCount){
	                            result += j+"=";
	                    } else{
	                            result += j+"+";
	                    }
	                      sum += j;
	                    }
                }
                System.out.println(result + sum);
                break;
            default:
                return;
        }
        }
    }
}