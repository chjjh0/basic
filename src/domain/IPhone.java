package domain;
public class IPhone extends CellPhone{
	// 홍길동에게 010 - 번호 로 애플 제품 아이폰을 사용해서 이동 가능한 상태로
    // 스마트폰이기 때문에 이용 가능한 상태로 홍길동에게 010번호로
    // 아이폰을 사용해서 안녕이라고 편지를 전송했다
	private String auto_010;
	public static final String BRAND="애플", KIND="아이폰";
	public void CellPhone() {
		auto_010 = "010-";
	}
	public void setAuto_010 () {
		auto_010 = "010-" + getPhoneNum() + "";
	}
	public String toString() {
		setPortable(true);
		setAuto_010();
		return String.format("[ %s ] 에게 [ %s ] [ %s ] 한 번호로 [ %s ] 브랜드의 [ %s ] 제품을 사용해서 [ %s ] 라고 전송했다",
				getName(), auto_010, getMove(), BRAND, KIND, getCall());
	} 
}
