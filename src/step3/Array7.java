package step3;

class Array7{
public static void main(String[] args) {
	int m = 3, row=0, col=0, num=1;
	int array[][]=new int[7][4];

		for(col=0; col<=m; col++){
			for(row=m-col; row<=col+m; row++){
				array[row][col]=num++;
			}
		}
		for(row=0; row<7; row++){
			for(col=0; col<=3; col++){
				System.out.printf("%5d",array[row][col]);
			}
			System.out.println();
		}
}
}