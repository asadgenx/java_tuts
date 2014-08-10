package account;

import static java.lang.System.out;

public class PartTimeEmployee extends Employee {

	private int hourlySalary;
	
	public void setHourlySalary(int salary) {
		hourlySalary = salary;
	}
	public int getHourlySalary(){
		return hourlySalary;
	}
	@Override
	public void cutCheck(double amountPaid) {
		out.printf("Pay to the order of %s ", getName());
		out.printf("(%s) ***$", getJobTitle());
		out.printf("---%d\n", getHourlySalary());
		}
}
