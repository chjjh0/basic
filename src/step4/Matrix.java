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
	SNAIL,
}
public class Matrix {

public static String output5x5(String[][] params) {
		String result = new String();
		for(int row=0;row<5;row++) {
				for(int col=0;col<5;col++){
					result += params[row][col] + " \t  ";
				}
				result += "\n";
			}
			return result;
		}
public static String output7x4(String[][] params) {
	String result = new String();
	int count=1;
	for(int row=0;row<7;row++) {
		//System.out.println(count + "회전");
			for(int col=0;col<4;col++){
				//System.out.println("row: "+row+" col: "+col);
				result += params[row][col] + " \t  ";
			}
			//count++;
			result += "\n";
		}
		return result;
	}
public static String[][] leftTriangle() {
		String array[][] = new String[5][5]; 
		int num=1;
		for(int col=0;col<5;col++) {
			for(int row=0;row<col+1;row++) {
				array[col][row] = String.valueOf(num++);
			}
		}
		return array;
	}
public static String[][] rightTriangle() {
	String array[][] = new String[5][5];
	int num=1, p=4, row=0, col=0;
	for(row=0;row<=p;row++) {
		for(col = p-row;col<5;col++) {
	    	array[row][col] = String.valueOf(num++);
	    	}
	 	}
	return array;
	}
public static String[][] zigzag() {
	String array[][] = new String[5][5];
	int num=1, row=0, col=0;
	for(row=0;row<5;row++) {
		if(row==1 || row==3) {
			for(col=4;col>=0;col--) {
				array[row][col] = String.valueOf(num++);
			}
		} else {
			for(col=0; col<=4;col++) {
				array[row][col] = String.valueOf(num++);
			}
		}
	}
	return array;
}
public static String[][] diamond() {
	String array[][] = new String[5][5];
	int row=0, col=0, num=1;
	for(row=0;row<5;row++) {
		if(row==0 || row==4) {
			for(col=2;col<3;col++) {
				array[row][col] = String.valueOf(num++);
			}
		} else if(row==1 || row==3) {
			for(col=1;col<4;col++) {
				array[row][col] = String.valueOf(num++);
			}
		} else {
			for(col=0;col<5;col++) {
				array[row][col] = String.valueOf(num++);
			}
		}
	}
	return array;
}
public static String[][] sandGlass(){
String[][] array = new String[5][5];
int row=0, col=0, num=1, p=5, m=0; 
for(row=0;row<p;row++) {
	for(col=0;col<(p-m);col++) {
		array[row][col] = (col >= m) ? String.valueOf(num++) : "";
	}
	m = row < 2 ? m+1 : m-1;
}
return array; 
}
public static String[][] triangle(){
String[][] array = new String[7][4];
int row=0, col=0, num=1, p=3; 
for(col=0;col<=p;col++) {
	for(row=p-col;row<=col+p;row++) {
		array[row][col] = String.valueOf(num++);
	}
}
return array; 
}
/*public static String[][] snail(){
String[][] array = new String[5][5];
int row=0, col=0, num=1, p=3; 
	for(row=0;row<5;row++) {
		
				array[row][]
		count--;
	}
return array; 
}*/
public static void main(String[] args) {
	Butt[] buttons = {
		Butt.EXIT,
		Butt.LEFT_TRIANGLE,
		Butt.RIGHT_TRIANGLE,
		Butt.ZIGZAG,
		Butt.DIAMOND,
		Butt.SAND_GLASS,
		Butt.TRIANGLE,
		Butt.SNAIL,
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
		JOptionPane.showMessageDialog(null, output5x5(leftTriangle()));
		break;
	case RIGHT_TRIANGLE : 
		JOptionPane.showMessageDialog(null, output5x5(rightTriangle()));
		break;
	case ZIGZAG :
		JOptionPane.showMessageDialog(null, output5x5(zigzag()));
		break;
	case DIAMOND : 
		JOptionPane.showMessageDialog(null, output5x5(diamond()));
		break;
	case SAND_GLASS :
		JOptionPane.showMessageDialog(null, output5x5(sandGlass()));
		break;
	case TRIANGLE : 
		JOptionPane.showMessageDialog(null, output7x4(triangle()));
		break;
	case SNAIL : 
		//JOptionPane.showMessageDialog(null, output5x5(snail()));
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
