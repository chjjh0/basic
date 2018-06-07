package step4;

import javax.swing.JOptionPane;
enum Butt {
	EXIT,
	LEFT_TRIANGLE,
	RIGHT_TRIANGLE,
	ZIGZAG,
	DIAMOND,
	SAND_GLASS,
	TRIANGLE,
}
public class Matrix {
	//5
	/*for(int i=0;i<fix;i++) {
		for(int j=0;j<(fix-rule);j++) {
			plus++;
			array[i][j] = (j >= rule) ? plus : 0;
		}
		rule = i < 2 ? rule +1 : rule-1;
	}*/
	
	
	
	//4
	/*for(int i=0;i<5;i++) {
		if(i==0) {
			for(int j=2;j<3;j++) {
				plus++;
				array[i][j] = plus;
			}
		} else if(i==1) {
			for(int j=1;j<4;j++) {
				plus++;
				array[i][j] = plus;
			}
		} else if(i==2) {
			for(int j=0;j<5;j++) {
				plus++;
				array[i][j] = plus;
			}
		} else if(i==3) {
			for(int j=1;j<4;j++) {
				plus++;
				array[i][j] = plus;
			}
		} else if(i==4) {
			for(int j=2;j<3;j++) {
				plus++;
				array[i][j] = plus;
			}
		}
	}*/
	//3
	/*for(int i=0;i<5;i++) {
			if(i==1 || i==3) {
				for(int j=4;j>=0;j--)
				{
					plus++;
					array[i][j] = plus;
				}
			} else if(i==0 || i==2 || i==4){
				for(int j=0;j<5;j++) {
					plus++;
					array[i][j] = plus;
				}
		}
	}*/
	
public static String output(String[][] params) {
		String result = new String();
		for(int col=0;col<5;col++) {
				for(int row=0;row<5;row++){
					result += params[row][col] + "   ";
				}
				result += "\n";
			}
			return result;
		}
	
public static String[][] leftTriangle() {
		String array[][] = new String[5][5]; 
		int num=1;
		for(int col=0;col<5;col++) {
			for(int row=0;row<col+1;row++) {
				array[row][col] = String.valueOf(num++);
			}
			
		}
		
		
		return array;
	}
public static String[][] rightTriangle() {
String array[][] = new String[5][5];
int num=1, m=4, row=0, minus=0;
for(int col=0;col<m;col++) {
	for(row = m;row<5;row++) {
    	array[col][row] = String.valueOf(num++);
    	if(col == 1 && row == 1) {
    		minus--;
    	}
 	}
}
	return array;
}

public static void main(String[] args) {
	Butt[] buttons = {
		Butt.EXIT,
		Butt.LEFT_TRIANGLE,
		Butt.RIGHT_TRIANGLE,
		Butt.ZIGZAG,
		Butt.DIAMOND,
		Butt.SAND_GLASS,
		Butt.TRIANGLE,
	};
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
	case LEFT_TRIANGLE :
		//output(leftTriangle());
		JOptionPane.showMessageDialog(null, output(leftTriangle()));
		break;
	case RIGHT_TRIANGLE : 
		JOptionPane.showMessageDialog(null, output(rightTriangle()));
		break;
	case ZIGZAG : 
		break;
	case DIAMOND : 
		break;
	case SAND_GLASS : 
		break;
	case TRIANGLE : 
		break;
	default : 
		break;
		}
	}
	/*String menu = "1.LeftTriangle"
			+"2.RightTriangle"
			+"3.ZigZag"
			+"4.Diamond"
			+"5.SandGlass"
			+"6.MatrixConversion";*/
	
}
}
