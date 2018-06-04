package step3;

import javax.swing.JOptionPane;
import java.util.Random;
public class Rps {
public static void main(String[] args) {
	Random random = new Random();
	String com[] = {"", ""};
	int[] count = { 0, 0, 0, 0 };
	while(true) {
	int calc = 0;
	String ran = String.valueOf(random.nextInt(3)+1);
	String player1[] = {"", ""};
	String[] result = {"", ""};
	player1[0]= String.valueOf(Integer.parseInt(JOptionPane.showInputDialog("Player1\n 0:종료 1:가위 2:바위 3:보 4:전적")));
	if(player1[0].equals("0")) {return;}
	player1[1] = (player1[0].equals("1")) ? "가위" : (player1[0].equals("2")) ? "바위" : "보";
	com[0] = ran;
	com[1] = (com[0].equals("1")) ? "가위" : (com[0].equals("2")) ? "바위" : "보"; 
	JOptionPane.showMessageDialog(null, player1[1] + " VS " + com[1]);
	result[1] = String.valueOf(Integer.parseInt(player1[0]) - Integer.parseInt(com[0]));
	calc = Integer.parseInt(result[1]);
	count[0]++;
	switch(player1[0]) {
	case "1": 
		if(calc == -2) {
			result[0] = "승리"; 
			count[1]++;
		} else if(calc == -1) { 
			result[0] = "패배";
			count[3]++;
		} else {
			result[0] = "무승부";
			count[2]++;
		}
		break;
	case "2":
		if(calc == -2) {
			result[0] = "승리"; 
			count[1]++;
		} else if(calc == -1) { 
			result[0] = "패배";
			count[3]++;
		} else {
			result[0] = "무승부";
			count[2]++;
		}
		break;
	case "3": 
		if(calc == -2) {
			result[0] = "승리"; 
			count[1]++;
		} else if(calc == -1) { 
			result[0] = "패배";
			count[3]++;
		} else {
			result[0] = "무승부";
			count[2]++;
		}
		break;
	}
	JOptionPane.showMessageDialog(null, result[0] + "입니다");
	JOptionPane.showMessageDialog(null, "전적: " + count[0] + "\n승리: " + count[1] + "\n무승부: " + count[2] + "\n패배: " + count[3]);
	}
}
}