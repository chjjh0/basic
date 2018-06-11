package domain;

public class Grade {
	String name, total, result, temp[];
	int sum;
	public void setName(String name) {
		this.name = name;
	}
	public void setTotal(String score) {
		this.temp = score.split("/");
		this.sum = 0;
		for(int i=0;i<temp.length;i++) {
			this.sum += Integer.parseInt(temp[i]);
		}
		this.total = String.valueOf(this.sum);
	}
	public void setResult() {
		this.result = String.valueOf(this.sum/3);
	}
	public String getName() {
		return name;
	}
	public String getScore() {
		return total;
	}
	public String getResult() {
		return result;
	}
	public String toString() {
		return String.format("%s | %s | %s", name, total, result);
	}
}
