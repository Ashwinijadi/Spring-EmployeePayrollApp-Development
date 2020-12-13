
package com.capgemini.employeepayrollapp.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.employeepayrollapp.dto.EmployeePayrollDTO;
import com.capgemini.employeepayrollapp.dto.ResponseDTO;
import com.capgemini.employeepayrollapp.model.EmployeePayrollData;
import com.capgemini.employeepayrollapp.services.IEmployeePayrollService;

@RestController
@RequestMapping("/employeepayrollservice")
public class EmployeePayrollController {
	@Autowired
	private IEmployeePayrollService employeePayrollService;

	@RequestMapping(value = { "", "/", "/get" })
	public ResponseEntity<ResponseDTO> getEmployeePayrollData() {
		List<EmployeePayrollData> empDataList = null;
		empDataList = employeePayrollService.getEmployeePayrollData();
		ResponseDTO respDTO = new ResponseDTO("Get call successful ", empDataList);
		return new ResponseEntity<ResponseDTO>(respDTO, HttpStatus.OK);
	}

	@GetMapping("/get/{empId}")
	public ResponseEntity<ResponseDTO> getEmployeePayrollData(@PathVariable("empId") int empId) {
		EmployeePayrollData empData = null;
		empData = employeePayrollService.getEmployeePayrollData(empId);
		ResponseDTO respDTO = new ResponseDTO("Get call for ID successful ", empData);
		return new ResponseEntity<ResponseDTO>(respDTO, HttpStatus.OK);
	}

	@PostMapping("/post")
	public ResponseEntity<ResponseDTO> addEmployeePayrollData(@RequestBody EmployeePayrollDTO employeeDTO) {
		EmployeePayrollData empData = null;
		empData = employeePayrollService.createEmployeePayrollData(employeeDTO);
		ResponseDTO respDTO = new ResponseDTO("Get call for ID successful ", empData);
		return new ResponseEntity<ResponseDTO>(respDTO, HttpStatus.OK);
	}

	@PutMapping("/update")
	public ResponseEntity<ResponseDTO> updateEmployeePayrollData(@RequestBody EmployeePayrollDTO employeeDTO) {
		EmployeePayrollData empData = null;
		empData = employeePayrollService.createEmployeePayrollData(employeeDTO);
		ResponseDTO respDTO = new ResponseDTO("Updated Employee Payroll Data Successfully ", empData);
		return new ResponseEntity<ResponseDTO>(respDTO, HttpStatus.OK);
	}

	@DeleteMapping("/delete/{empId}")
	public ResponseEntity<ResponseDTO> deleteEmployeePayrollData(@PathVariable("empId") int empId) {
		employeePayrollService.deleteEmployeePayrollData(empId);
		ResponseDTO respDTO = new ResponseDTO("Employee Payroll Data Deleted Successfully: ", empId);
		return new ResponseEntity<ResponseDTO>(respDTO, HttpStatus.OK);
	}

}