package com.empwage.java;

public class Empwage {
	public static void main(String[] Args) {
		int is_full_time = 1;
		double empcheck = Math.floor(Math.random() * 100) % 2;
		if ( empcheck == is_full_time )
			System.out.println("Employee is Presnet");
		else
		System.out.println("Employee is Absent");
	}

}
