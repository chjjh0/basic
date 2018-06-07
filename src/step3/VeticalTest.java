package step3;

public class VeticalTest {

	public static void main(String[] args) {
		int[][] array = new int[5][5];
		int num=1;
		
		for(int col=0;col<5;col++) {
			for(int row=0;row<col+1;row++) {
				array[row][col] = num++;
			}
		}
		for(int col=0;col<5;col++) {
			for(int row=0;row<5;row++) {
				System.out.print("\t" + array[row][col]);
			}
			System.out.println();
		}
	}
}