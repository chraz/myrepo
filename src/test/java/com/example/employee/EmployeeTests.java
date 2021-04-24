package com.example.employee;
import static org.assertj.core.api.Assertions.*;
import org.junit.jupiter.api.Test;

class EmployeeTests {
	@Test
	void calculateMonthlySalaryReturnsCorrectValue() {
	
		Employee employee = new Employee();	
		employee.setCar("cke257");			
		employee.setName("mini na");
		employee.setCompany("INFRA");

		assertThat(employee.getCar().equals("SPD01"));

	}

}
