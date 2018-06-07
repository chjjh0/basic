package step4;

import java.util.Arrays;

import javax.swing.JOptionPane;

public class salary {
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
	String[][] mtx = new String[3][3];
	String temp[] = new String[4];
	int i=0, j=0;
	while(true) {
		
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
			String info = JOptionPane.showInputDialog(null, "부서/이름/보너스");
			temp = info.split("/");
			break;
		case LIST :
			JOptionPane.showMessageDialog(null, temp);
			break;
		default : 
			break;
			}
	}
	}
}

