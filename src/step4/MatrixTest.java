package step4;

public class MatrixTest {
	static int i=0, j=0, plus=0;
	
	public static String[][] leftTriangle() {
		String array[][] = new String[5][5];

		for(i=0;i<=j;i++){
		    for(j=0;j<i+1;j++){
		    	plus++;
		    	array[i][j] = String.valueOf(plus);
		    }
		}
		return array;
	}

	public static void output(String[][] params) {
		String result[][] = params;
		for(int i=0;i<6;i++){
		    for(int j=0;j<6;j++){
		        System.out.print("*" + "\t ");
		    }
		    System.out.println();
	}
	}
public static void main(String[] args) {
	output(leftTriangle());
}

}