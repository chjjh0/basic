package step3;

public class Matrix5x5 {
public static void main(String[] arrayrgs) {
	int array[][] = new int[5][5];
	int plus = 0, fix = 5, rule = 0;
	
	//5
	for(int i=0;i<fix;i++) {
		for(int j=0;j<(fix-rule);j++) {
			plus++;
			array[i][j] = (j >= rule) ? plus : 0;
		}
		rule = i < 2 ? rule +1 : rule-1;
	}
	
	
	
	//4
	/*for(int i=0;i<5;i++) {
		if(i==0) {
			for(int j=2;j<3;j++) {
				plus++;
				array[i][j] = plus;
			}
		} else if(i==1) {
			for(int j=1;j<4;j++) {
				plus++;
				array[i][j] = plus;
			}
		} else if(i==2) {
			for(int j=0;j<5;j++) {
				plus++;
				array[i][j] = plus;
			}
		} else if(i==3) {
			for(int j=1;j<4;j++) {
				plus++;
				array[i][j] = plus;
			}
		} else if(i==4) {
			for(int j=2;j<3;j++) {
				plus++;
				array[i][j] = plus;
			}
		}
	}*/
	//3
	/*for(int i=0;i<5;i++) {
			if(i==1 || i==3) {
				for(int j=4;j>=0;j--)
				{
					plus++;
					array[i][j] = plus;
				}
			} else if(i==0 || i==2 || i==4){
				for(int j=0;j<5;j++) {
					plus++;
					array[i][j] = plus;
				}
		}
	}*/
	//2
	/*for(int i=0;i<5;i++){
	    for(int j=0;j<i+1;j++){
	    		if(i==0) {
			    	for(j=4;j<5;j++) {
				    	plus++;
				    	array[i][j] = plus;
				    }
			    } else if(i==1) {
	    			for(j=3;j<5;j++) {
	    				plus++;
	    				array[i][j] = plus;
	    			}
	    		} else if(i==2) {
	    			for(j=2;j<5;j++) {
	    				plus++;
	    				array[i][j] = plus;
	    			}
	    		} else if(i==3) {
	    			for(j=1;j<5;j++) {
	    				plus++;
	    				array[i][j] = plus;
	    			}
	    		} else if(i==4) {
	    			for(j=0;j<5;j++) {
	    				plus++;
	    				array[i][j] = plus;
	    			}
	    		}
	    		}
	 }*/
	//1
	/*for(i=0;i<5;i++){
	    for(j=0;j<i+1;j++){
	    	plus++;
	    	array[i][j] = plus;
	    }
	}*/
	for(int i=0;i<5;i++){
	    for(int j=0;j<5;j++){
	        System.out.print(array[i][j] + "\t ");
	    }
	    System.out.println();
	}
}
}
