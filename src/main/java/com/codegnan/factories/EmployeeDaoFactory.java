package com.codegnan.factories;

import com.codegnan.dao.Employeedao;
import com.codegnan.dao.EmployeeDaoImpl;

public class EmployeeDaoFactory {
	private static Employeedao employeeDao = null;
	static {
		employeeDao = new EmployeeDaoImpl();
	}

	public static Employeedao getEmployeeDao() {
		return employeeDao;
	}
}