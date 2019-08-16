package com.mounika.springemployeeapp.dao;

import java.util.List;
import com.mounika.springemployeeapp.modal.Employee;
public interface EmployeeDao {
	boolean createEmployee(Employee emp);
	Employee fetchEmployee(String empId);
	List<Employee> fetchEmployees();
	boolean deleteEmployee(String empId);
	boolean updateEmployee(Employee emp);
}
