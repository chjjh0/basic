package step3;

public class MatrixTest {
public static void main(String[] args) {
int input=5;
int st=0;

input = (input % 2==0) ? input - 1 : input;

for (int i=0;i<input;i++) {
	for(int j = 0; j < (input-st);j++) {
		System.out.print((j >= st) ? "*" : " ");
	}
	st = i < (input / 2) ? st + 1 : st - 1;
	System.out.println();
	}
	}
}
