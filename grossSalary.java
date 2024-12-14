package homework_day_4;

import java.util.Scanner;

public class grossSalary {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("enter your gross salary:");
		int salary = sc.nextInt();
		double gross;
		if(salary <= 10000 && salary >= 5000) {
			gross = salary + (0.4 * salary);
			System.out.println("Your salary is: "+gross);
		}else if(salary >= 10000 && salary <= 50000) {
			gross = salary + (0.5 * salary);
			System.out.println("Your salary is: "+gross);
		}else {
			System.out.println("invalid salary");
		}
	}

}
