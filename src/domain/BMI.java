package domain;

public class BMI {
	String name, result, res;
	double height, weight;
	public void setName(String name) {
		this.name=name;
	}
	public void setRes(String res) {
		this.res += res + "\n";
	}
	public void setResult() {
		double a = weight/(height*height/10000);
		if (a < 20) {
			result = "저체중";
		} else if (a >= 20 && a <= 24) {
			result = "정상체중";
		} else if (a >= 25 && a <= 30) {
			result = "경도비만";
		} else
			result = "비만";
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public String getName() {
		return name;
	}
	public String getResult() {
		return result;
	}
	public String getRes() {
		return res;
	}
	public double getHeight() {
		return height;
	}
	public double getWeight() {
		return weight;
	}
	public String toString() {
		return String.format("%s | %.1f | %.1f | %s", name, height, weight, result);
	}
}
