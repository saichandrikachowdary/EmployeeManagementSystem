package com.codegnan.dao;
 
import com.codegnan.dto.Employee;
 
public interface Employeedao {
  	public String add(Employee employee);
 
  	public Employee search(int eno);
 
  	public String update(Employee employee);
 
  	public String delete(int eno);
}