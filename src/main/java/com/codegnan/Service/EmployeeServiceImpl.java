package com.codegnan.Service;

import com.codegnan.dao.Employeedao;
import com.codegnan.dto.Employee;
import com.codegnan.factories.EmployeeDaoFactory;

public class EmployeeServiceImpl implements EmployeeService {

	@Override
	public String addEmployee(Employee employee) {
		Employeedao employeeDao = EmployeeDaoFactory.getEmployeeDao();
		String status = employeeDao.add(employee);
		return status;
	}

	@Override
	public Employee searchEmployee(int eno) {
		Employeedao employeeDao = EmployeeDaoFactory.getEmployeeDao();
		Employee employee = employeeDao.search(eno);
		return employee;
	}

	@Override
	public String updateEmployee(Employee employee) {
		Employeedao employeeDao = EmployeeDaoFactory.getEmployeeDao();
		String status = employeeDao.update(employee);
		return status;
	}

	@Override
	public String deleteEmployee(int eno) {
		Employeedao employeeDao = EmployeeDaoFactory.getEmployeeDao();
		String status = employeeDao.delete(eno);
		return status;
	}

}