package com.codegnan.factories;

import com.codegnan.Service.EmployeeService;
import com.codegnan.Service.EmployeeServiceImpl;

public class EmployeeServiceFactory {
	private static EmployeeService employeeService = null;
	static {
		employeeService = new EmployeeServiceImpl();
	}

	public static EmployeeService getEmployeeService() {
		return employeeService;
	}
}