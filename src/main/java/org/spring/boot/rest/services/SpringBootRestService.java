package org.spring.boot.rest.services;

import java.util.List;

import org.spring.boot.rest.entity.SpringBootRestEntity;
import org.spring.boot.rest.exception.SpringBootRestEntityNotFoundException;
import org.spring.boot.rest.exception.SpringBootRestEntityNotSavedException;
import org.spring.boot.rest.jpa.SpringBootRestJPA;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SpringBootRestService {

	@Autowired
	private SpringBootRestJPA restJPA;

	public List<SpringBootRestEntity> getAllEmployees() {
		return restJPA.findAll();
	}

	public SpringBootRestEntity findEmployeeById(Integer empId) {
		return restJPA.findById(empId).orElseThrow(SpringBootRestEntityNotFoundException::new);
	}

	public SpringBootRestEntity createEmployee(SpringBootRestEntity employee) {
		try {
			employee = restJPA.save(employee);
		} catch (Exception e) {
			throw new SpringBootRestEntityNotSavedException();
		}
		return employee;
	}

	public SpringBootRestEntity updateEmployee(Integer empId, SpringBootRestEntity employee) {
		SpringBootRestEntity entity = restJPA.findById(empId).orElseThrow(SpringBootRestEntityNotFoundException::new);

		entity.setEmpName(employee.getEmpName());
		entity.setEmpDOB(employee.getEmpDOB());
		entity.setEmpAddress(employee.getEmpAddress());
		entity.setEmpMail(employee.getEmpMail());
		entity.setEmpSalary(employee.getEmpSalary());
		entity.setEmpMobile(employee.getEmpMobile());

		return restJPA.save(entity);

	}

	public SpringBootRestEntity updateEmployeeById(Integer empId, SpringBootRestEntity employee) {
		SpringBootRestEntity entity = restJPA.findById(empId).orElseThrow(SpringBootRestEntityNotFoundException::new);

		entity.setEmpName(employee.getEmpName());
		entity.setEmpDOB(employee.getEmpDOB());
		entity.setEmpAddress(employee.getEmpAddress());
		entity.setEmpMail(employee.getEmpMail());
		entity.setEmpSalary(employee.getEmpSalary());
		entity.setEmpMobile(employee.getEmpMobile());

		return restJPA.save(entity);
	}

	public SpringBootRestEntity deleteEmployeeById(Integer empId) {
		SpringBootRestEntity entity = restJPA.findById(empId).orElseThrow(SpringBootRestEntityNotFoundException::new);
		restJPA.delete(entity);
		return entity;
	}

}