package org.spring.boot.rest.controller;

import java.util.List;

import org.spring.boot.rest.entity.SpringBootRestEntity;
import org.spring.boot.rest.services.SpringBootRestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/employee")
public class SpringBootRestController {

	@Autowired
	private SpringBootRestService service;

	@GetMapping("/find")
	public ResponseEntity<List<SpringBootRestEntity>> getAllEmployees() {
		return ResponseEntity.ok(service.getAllEmployees());
	}

	@GetMapping("/find/{empId}")
	public ResponseEntity<SpringBootRestEntity> findEmployeeById(@PathVariable Integer empId) {
		return ResponseEntity.ok(service.findEmployeeById(empId));
	}

	@PostMapping("/create")
	public ResponseEntity<SpringBootRestEntity> createEmployee(@RequestBody SpringBootRestEntity employee) {
		return ResponseEntity.ok(service.createEmployee(employee));
	}

	@PutMapping("/update/{empId}")
	public ResponseEntity<SpringBootRestEntity> updateEmployee(@PathVariable("empId") Integer empId,
			@RequestBody SpringBootRestEntity employee) {
		return ResponseEntity.ok(service.updateEmployee(empId, employee));
	}

	@PatchMapping("/patch/{empId}")
	public ResponseEntity<SpringBootRestEntity> updateEmployeeById(@PathVariable("empId") Integer empId,
			@RequestBody SpringBootRestEntity employee) {
		return ResponseEntity.ok(service.updateEmployeeById(empId, employee));
	}

	@DeleteMapping("/delete/{empId}")
	public ResponseEntity<SpringBootRestEntity> deleteEmployeeById(@PathVariable("empId") Integer empId) {
		return ResponseEntity.ok(service.deleteEmployeeById(empId));
	}

}