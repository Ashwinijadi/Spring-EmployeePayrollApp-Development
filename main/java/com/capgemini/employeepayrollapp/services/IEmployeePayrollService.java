package com.capgemini.employeepayrollapp.services;

import java.util.List;
import com.capgemini.employeepayrollapp.dto.EmployeePayrollDTO;
import com.capgemini.employeepayrollapp.model.EmployeePayrollData;

public interface IEmployeePayrollService {
	List<EmployeePayrollData> getEmployeePayrollData();

	EmployeePayrollData getEmployeePayrollData(int empId);

	EmployeePayrollData createEmployeePayrollData(EmployeePayrollDTO empPayrollDTO);

	EmployeePayrollData updateEmployeePayrollData(EmployeePayrollDTO empPayrollDTO);

	void deleteEmployeePayrollData(int empId);
}
