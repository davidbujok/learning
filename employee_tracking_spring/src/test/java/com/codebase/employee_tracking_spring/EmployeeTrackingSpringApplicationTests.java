package com.codebase.employee_tracking_spring;

import com.codebase.employee_tracking_spring.models.Department;
import com.codebase.employee_tracking_spring.models.Employee;
import com.codebase.employee_tracking_spring.models.Project;
import com.codebase.employee_tracking_spring.repositories.DepartmentRepository;
import com.codebase.employee_tracking_spring.repositories.EmployeeRepository;
import com.codebase.employee_tracking_spring.repositories.ProjectRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Optional;

@SpringBootTest
class EmployeeTrackingSpringApplicationTests {

	@Autowired
	EmployeeRepository employeeRepository;
	@Autowired
	DepartmentRepository departmentRepository;
	@Autowired
	ProjectRepository projectRepository;

	@Test
	void contextLoads() {
	}

	@Test
	public void createEmployee(){
		Department newDep = new Department("guyswithties");
		departmentRepository.save(newDep);
		Employee david = new Employee("David", 34, 433, "david@david.com", newDep);
		employeeRepository.save(david);

		Project project = new Project("Eventless", 5);
		project.addEmployee(david);
		projectRepository.save(project);



	}

}
