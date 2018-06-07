package step3;

class Example{



	public static void main(String[] args){

		int n = 7;
		int array[][]=new int[n][n/2+1];
		int num = 1, m = n/2;
		int row,col;

		for(col=0; col<=m; col++){
			System.out.println("for(int col=0; col<=m; col++)");
			System.out.println("col: " + col + "  m: " + m);
			System.out.println("\tnext");
			for(row=m-col; row<=col+m; row++){
				System.out.println("*********");
				System.out.println("for(row=m-col; row<=col+m; row++)");
				System.out.println("row: " + row + "  m: " + m + "  col: " + col + " ");
				System.out.println("\tnext");
				array[row][col]=num++;
				System.out.println("array[row][col]=num++;");
				System.out.println("row: " + row + "  col: " + col + "  num: " + num);
				System.out.println("\tend");
			}
		}
		for(row=0; row<n; row++){
			for(col=0; col<=m; col++){
				System.out.printf("%3d",array[row][col]);
			}
			System.out.println();
		}
	}
}




