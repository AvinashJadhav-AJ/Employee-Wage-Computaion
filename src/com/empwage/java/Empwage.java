package com.empwage.java;

public class Empwage {
	public static void main(String[] Args) {
		int is_full_time = 1;
		int Employee_wage_per_Hour = 20;
		int empHrs = 0;
		int empwage = 0;
		double empcheck = Math.floor(Math.random() * 100) % 3;
		if ( empcheck == is_full_time )
			empHrs = 8;
		else
			empHrs = 0;
		    empwage = empHrs * Employee_wage_per_Hour;
		    System.out.println("empwage: " + empwage);
	}

}
