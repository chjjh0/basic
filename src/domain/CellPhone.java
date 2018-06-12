package domain;
public class CellPhone extends Phone{
	static final String BRAND = "NOKIA", KIND = "SMARTPHONE";
	private boolean portable;
	private String move;
	public void setPortable(boolean portable) {
		/*if(portable) {
			setMove("이동 가능");
		} else {
			setMove("이동 불가능");
		}*/
		setMove((portable)?"이동 가능":"이동 불가능");
		this.portable = portable;
	}
	public void setMove(String move) {
		this.move = move;
	}
	public String getMove() {
		return move;
	}
	public boolean isPortable() {
		return portable;
	}
	public String toString() {
		setPortable(true);
		return String.format("[ %s ] 에게  [ %s ] 번호로 [ %s ] [ %s ] 제품  [ %s ] 를 사용해서 [ %s ] 라고 통화했다.",
		getName(), getPhoneNum(), move, BRAND, KIND, getCall());
	}
}
