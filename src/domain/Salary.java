package domain;

public class Salary {
	String dept, name;
	int sal, bonus;
	
	public void setDept(String dept) {
		this.dept = dept;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setSal(int sal) {
		this.sal = sal;
	}
	public void setBonus(int bonus) {
		this.bonus = bonus;
	}
	public String getDept() {
		return dept;
	}
	public String getName() {
		return name;
	}
	public int getSal() {
		return sal;
	}
	public int getBonus() {
		return bonus;
	}
	public String toString() {
		return String.format("%s | %s | %d | %d", dept, name, sal, bonus);
	}
}
