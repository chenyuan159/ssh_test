package com.imooc.action;

import com.imooc.entity.Employee;
import com.imooc.service.EmployeeService;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
/**
 * 保存员工的action
 * @author ha
 *
 */
public class EmployeeAction extends ActionSupport implements ModelDriven<Employee>{

	Employee employee = new Employee();
	
	@Override
	public Employee getModel() {
		// TODO Auto-generated method stub
		return employee;
	}
	
	//使用spring传入EmployeeService实例
	EmployeeService employeeService;
	
	public void setEmployeeService(EmployeeService employeeService) {
		this.employeeService = employeeService;
	}

	public String save(){
		System.out.println("action执行了");
		employeeService.saveEmployee(employee);
		
		return "success";
	}

	
}
