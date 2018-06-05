package step3;

import javax.swing.JOptionPane;
public class ArrayTest {
public static int getTotal(String[] param) {
	int total= 0;
	for(int i=1; i < 4; i++) {
		total = total + Integer.parseInt(param[i]);
	}
	return total;
}
public static String[] rank(String[] param) {
	String[] rank = { "0", "0", "0" };
	String[] result = { "0", "0", "0" };
	for(int i=0;i<param.length;i++) {
		result[2] = (Integer.parseInt(rank[2]) < Integer.parseInt(param[5])) ? param[1] + " | " + param[5] : result[2];
		rank[2] = (Integer.parseInt(rank[2]) < Integer.parseInt(param[5])) ? param[5] : param[5];
		
		result[1] = (Integer.parseInt(rank[1]) < Integer.parseInt(param[5])) ? param[1] + " | " + param[5] : result[1];
		rank[1] = (Integer.parseInt(rank[1]) < Integer.parseInt(param[5])) ? param[5] : param[5];
		
		result[0] = (Integer.parseInt(rank[0]) < Integer.parseInt(param[5])) ? param[1] + " | " + param[5] : result[0];
		rank[0] = (Integer.parseInt(rank[0]) < Integer.parseInt(param[5])) ? param[5] : param[5];
		
		/*} else if(Integer.parseInt(rank[1]) < Integer.parseInt(param[5])) {
			result[1] = param[1] + " | " + param[5] + "\n";
		} else if(Integer.parseInt(rank[0]) < Integer.parseInt(param[5])) {
			result[0] = param[1] + " | " + param[5] + "\n";
		}*/
	}
	System.out.println(result);
	return result;
}
public static int getAvg(int param) {
	int avg = param/3;
	return avg;
}
public static void main(String[] args) {
	String result[] = new String[10];
	String totalRank[] = new String[10];
	String rankSplit[] = new String[10];
	result[0] = "| 순번 | 이름 | 국어 | 영어 | 수학 | 총점 | 평균 |";
	int total = 0, avg = 0, i=0 ;
	while(true) {
	String menu = JOptionPane.showInputDialog("0:종료 1:성적입력 2:전체보기 3:순위보기 4: 초기화");
	switch(menu) {
	case "0" : return;
	case "1" : 
		String score = JOptionPane.showInputDialog("\t| 이름 | 국어 | 영어 | 수학 |");
		String[] arr = score.split("/");
		total = getTotal(arr);
		totalRank[i] = String.valueOf(total);
		String rankResult[] = new String[3];
		avg = getAvg(total);
		i++;
		result[i] = i + "|" + arr[0] + "|" + arr[1] + "|" + arr[2] + "|" + arr[3] + "|" + total + "|" + avg + "|\n";
		rankSplit = result[i].split("\\|");
		break;
	case "2" : 
		JOptionPane.showMessageDialog(null, result);
		break;
	case "3" : 
		System.out.println(rankSplit[0]);
		totalRank = rank(rankSplit);
		JOptionPane.showMessageDialog(null, totalRank);
		break;
	case "4" :
		total = 0; avg = 0;
		for(i=0;i<result.length;i++) {
			result[i] = " ";
			result[0] = " | 이름 | 국어 | 영어 | 수학 | 총점 | 평균 |\n";
			}
		JOptionPane.showMessageDialog(null, "초기화 완료");
		break;
	default : break;
	}
	}
}
}
