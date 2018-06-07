package step4;

public class Gugudan {
public static void main(String[] args) {
	String[][] array = new String[10][10];
	int a=0, b=0, multi=0;
	
	for(int i=0;i<10;i++) {
		for(int j=0;j<10;j++) {
			array[i][j] = "";
		}
	}
			
	for(int i=1; i<10; i++) {
		for(int j=2; j<10; j++) {
			multi=j*i;
			if(b<4) {
				array[a][b] = j + " X " + i +" = "+ String.valueOf(multi + "   \t ");
			} else if(b>=4) {
				array[a][b] += "\n";
				array[a][b] = j + " X " + i +" = "+ String.valueOf(multi + "   \t ");
			}
			b++;
		} 
		if(multi % 9==0) {
			array[a][b] += "\n";
		}
		a++;
		b=0;
	}
	for(int i=0;i<10;i++) {
		for(int j=0;j<10;j++) {
			System.out.print(array[i][j]);
		}
	}
}
}

