package com.imooc.dao;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.imooc.entity.Employee;

public class EmployeeDao extends HibernateDaoSupport{

	public void saveEmployee(Employee employee) {
		// TODO Auto-generated method stub
		
		System.out.println("dao层执行了");
		this.getHibernateTemplate().save(employee);
	}

}
