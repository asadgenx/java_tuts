package account;

import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.Arrays;
import java.io.File;
import java.io.IOException;

class DoPayroll {
		public static void main(String args[]) throws IOException {
			Scanner diskScanner = new Scanner(new File("/home/asadgenx/workspace/java/knowing_java_more/src/account/Employeeinfo.txt"));
			for (int empNum = 1; empNum <= 2; empNum++) {
			payOneEmployee(diskScanner);
			}
		}
		static void payOneEmployee(Scanner aScanner) {
			PartTimeEmployee anEmployee = new PartTimeEmployee();
			String line = aScanner.nextLine();
			String lineData[] = line.split(",");
			int Salary = 0;
			List lList = Arrays.asList(lineData);
			for(Iterator<String> i = lList.iterator(); i.hasNext(); ) {
				anEmployee.setName(i.next());
				anEmployee.setJobTitle(i.next());
				Salary = Integer.parseInt(i.next());
				anEmployee.setHourlySalary(Salary);
				anEmployee.cutCheck(Salary);
				}
			
			
			
		}
}