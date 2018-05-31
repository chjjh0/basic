package step1;
/**
항 사이의 증가하는 값이 일정한 비율로 증가하는 수열(스캐너 없음)
1+2+4+7+11+16+22+...순서로 나열되는
수열의 20번째 항까지의 합계
 * */
public class EvenSum3 {
public static void main(String[] args) {
	int start = 1, end = 300, plus = 0, sum = 1, count =0;
	String result = "";
	
	for(;start <= end;) {
		count++;
		if(count == 21) {
			break;
		}
		result = count == 20 ?	
					result + start + " = " : result + start + "+";
		if (count % 10 == 0) {
			result += "\n";
		}
		plus++;
		start += plus;
		for(; count < 20;) {
			sum +=start;
			break;
		}
			
	} System.out.println(result + " " + sum);
}
}
