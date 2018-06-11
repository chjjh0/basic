package domain;
import java.util.Random;

public class Lotto {
	int count;
	int lottoNum[];
	String lottoList;
	Random random = new Random();
	public void setGameMoney(int gameMoney) {
		this.count = gameMoney/1000;
		System.out.println(count);
	}
	public void setBallNumber() {
		lottoNum = new int[7];
		int i=0, j=0;
		for(i=0;i<6;i++) {
			lottoNum[i] = random.nextInt(45)+1;
			System.out.println(lottoNum[0]);
			System.out.println(lottoNum[1]);
			System.out.println(lottoNum[2]);
			System.out.println(lottoNum[3]);
			System.out.println(lottoNum[4]);
			System.out.println(lottoNum[5]);
			System.out.println("end");
			for(j=0;j<i;j++) {
				if(lottoNum[i] == lottoNum[j]) {
					i--;
					break;
				} 
			}
		}
	}
	public void setLottoList() {
		for(int i=0;i<lottoNum.length;i++) {
			lottoList += lottoNum[i] + " ";
		}
	}
	public int getCount() {
		return this.count; 
	}
	public String getLottoList() {
		return this.lottoList;
	}
		}
	
	
