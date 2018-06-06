package step3;

public class MatrixTest {
public static void main(String[] args) {
int input=5;
int st=0;


for (int i=0;i<input;i++) {
	//System.out.println(i + " " + input);
	for(int j = 0; j < (input-st);j++) {
		//System.out.println(j + " " + input + " " + st);
		System.out.print((j >= st) ? "*" : " ");
		//System.out.println("*****" + j + " " + st);
	}
	st = i < 2 ? st + 1 : st - 1;
	System.out.println();
	//System.out.println("end " + st + " = " + i + " < " + input + "/2");
	}
	}
}
