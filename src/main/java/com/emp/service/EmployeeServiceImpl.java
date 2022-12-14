package com.emp.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.emp.entity.Employee;

@Service
public class EmployeeServiceImpl implements IEmployeeService {

	List<Employee> list = List.of(new Employee(1311L, "Peter Parker", "45787112547"),
			new Employee(1311L, "Peter Parker", "45787112547"), new Employee(1315L, "Aushutosh Parker", "45787112547"),
			new Employee(1312L, "Parker", "45787112547"), new Employee(1316L, "Peter Chaman", "45787112547"),
			new Employee(1313L, "Avanish Parker", "45787112547"), new Employee(1317L, "Darmendar Parker", "45787112547"),
			new Employee(1314L, "Vishal Parker", "45787112547"), new Employee(1318L, "Raja Parker", "45787112547"));

	@Override
	public Employee getEmployee(Long id) {
		// TODO Auto-generated method stub
		return list.stream().filter(employee -> employee.geteId().equals(id)).findAny().orElse(null);
	}
}