package step4;

import javax.swing.JOptionPane;

public class Celely {
enum Butt {
	EXIT,
	INPUT,
	LIST,
}	
public static void main(String[] args) {
	Butt[] buttons = {
			Butt.EXIT,
			Butt.INPUT,
			Butt.LIST,
		};
	while(true) {
		String[][] mtx = new String[3][3];
		
		Butt select = (Butt)JOptionPane.showInputDialog(
				null,	//frame
				"MATRIX PAGE", //frame title
				"SELECT MATRIX MENU", //ORDER
				JOptionPane.QUESTION_MESSAGE, //type
				null, //icon
				buttons, //array of choices
				buttons[1] //default
				);
		switch (select) {
		case EXIT : return;
		case INPUT :
			
			String dept = JOptionPane.showInputDialog(null, "부서");
			mtx[0][0] = dept;
			String name = JOptionPane.showInputDialog("이름");
			mtx[1][1] = name;
			String bonus = JOptionPane.showInputDialog("보너스");
			mtx[2][2] = bonus;
			break;
		case LIST :
			System.out.println(mtx[0][0]);
			JOptionPane.showMessageDialog(null, mtx);
			break;
		default : 
			break;
			}
	}
	}
}

