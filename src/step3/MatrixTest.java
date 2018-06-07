package step3;

import java.util.Scanner;
public class MatrixTest {
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
	for(int row=0;row<7;row++) {
			for(int col=0;col<4;col++){
				result += params[row][col] + " \t  ";
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
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("0: 종료 1:left 2:right 3:zigzag 4: diamond");
	switch(scan.nextInt()) {
	case 0: return;
	case 1: break;
	
	case 2: 
		System.out.println(output5x5(rightTriangle()));
		break;
	case 3: break;
	case 4:
		System.out.println(output5x5(diamond()));
		break;
	}
	}
}