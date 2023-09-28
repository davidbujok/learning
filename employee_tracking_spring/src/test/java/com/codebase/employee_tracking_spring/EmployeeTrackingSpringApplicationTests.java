package com.codebase.employee_tracking_spring;

import com.codebase.employee_tracking_spring.models.Employee;
import com.codebase.employee_tracking_spring.repositories.EmployeeRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Optional;

@SpringBootTest
class EmployeeTrackingSpringApplicationTests {

	@Autowired
	EmployeeRepository employeeRepository;

	@Test
	void contextLoads() {
	}

	@Test
	public void createEmployee(){
		Employee david = new Employee("David", 34, 433, "david@david.com");
		employeeRepository.save(david);
	}

}
