package step3;

import javax.swing.JOptionPane;
public class Calc {
	public static void main(String[] args){
		String result = "", opCode="", temp = "0";
		while(true) {
			String num = JOptionPane.showInputDialog("수를 입력하세요");
			opCode = JOptionPane.showInputDialog("연산자를 입력하세요");
			result += num + " " + opCode;
			temp = num; num = "0";
			String total= "0";
/*
		switch(opCode) {
		case "+" : break;
			//total = String.valueOf(Integer.parseInt(total)+Integer.parseInt(temp)+Integer.parseInt(num));
			if(opCode.equals("=")) {
				JOptionPane.showMessageDialog(null, result +  total + "입니다");
				return;
			}
		case "-" : break;
		case "*" : break;
		case "/" : break;
		case "%" : break;
		default : break;
		}
		/*
		
		if(opcode.equals("+")){
			result1 = num1 + num2;
		} else if(opcode.equals("-")){
			result1 = num1 - num2;
		} else if(opcode.equals("*")){
			result1 = num1 * num2;
		} else if(opcode.equals("/")){
			result1 = num1 / num2;
		} else if(opcode.equals("%")){
			result1 = num1 % num2;
		} else {
			System.out.println("�߸� �Է��߽��ϴ�");
		}

		System.out.printf("����� %.1f %s %.1f = %.1f \n", num1, opcode, num2, result1);
*/
		}
		}
}