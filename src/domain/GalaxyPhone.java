package domain;
public class GalaxyPhone extends CellPhone{
	//홍길동%s에게 010번호%s로 삼성%s 제품 6인치%s 
	// 갤럭시노트%s를 사용해서 이동가능%s한 상태로
	// 안녕%s이라고 카톡%s했다.
	private String phoneSize, kaTalk;
	public static final String BRAND="삼성", KIND="갤럭시 노트";

	public void setPhoneSize() {
		//phoneSize;
	}
	public void setKaTalk() {
		kaTalk = "카톡";
	}
	public String getKaTalk() {
		return kaTalk;
	}
	public String toString() {
		setPortable(true);
		setKaTalk();
		return String.format("[ %s ] 에게 [ %s ] 한 [ %s ] 번호로 [ %s ] 브랜드의 [ %s ] 제품을 사용해서 [ %s ] 라고 [ %s ] 으로 전송했다",
				super.getName(), getMove(), super.getPhoneNum(), BRAND, KIND, super.getCall(), getKaTalk());
	}

}
