package entities;

public class Employee {

	public String name;
	public double grossSalary;
	public double tax;

	public double netSalary() {
		return grossSalary -= tax;
	}

	public void increaseSalary(double p) {
		grossSalary += grossSalary * p / 100.0;

	}

}
