package com.imooc.service;

import com.imooc.dao.EmployeeDao;
import com.imooc.entity.Employee;

/**
 * 保存员工service类
 * @author ha
 *
 */
public class EmployeeService {

	//使用spring自动注入EmployeeDao实例
	EmployeeDao employeeDao;
	
	
	public void setEmployeeDao(EmployeeDao employeeDao) {
		this.employeeDao = employeeDao;
	}


	public void saveEmployee(Employee employee) {
		// TODO Auto-generated method stub
		System.out.println("service执行了");
		employeeDao.saveEmployee(employee);
		
	}

}
