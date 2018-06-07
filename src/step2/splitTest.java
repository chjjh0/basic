package step2;

import java.util.Arrays;
import javax.swing.JOptionPane;
public class splitTest {
	public static void main(String[] args) {
		String str1 = "1. 2. 3";
		String temp[] = { "", "", "" };
		System.out.println(str1);
		String str2[] = str1.split("\\.");
		System.out.println(Arrays.toString(str2));
		String info = JOptionPane.showInputDialog(null, "부서.이름.보너스");
		temp = info.split("\\.");
		System.out.println(Arrays.toString(temp));
		System.out.printf("%s %s %s", str2[0], str2[1], str2[2]);
	}
}
