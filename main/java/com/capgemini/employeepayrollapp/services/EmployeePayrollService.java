package com.capgemini.employeepayrollapp.services;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;
import com.capgemini.employeepayrollapp.dto.EmployeePayrollDTO;
import com.capgemini.employeepayrollapp.model.EmployeePayrollData;

@Service
public class EmployeePayrollService implements IEmployeePayrollService{
	@Override
	public List<EmployeePayrollData> getEmployeePayrollData() {
		List<EmployeePayrollData> empDataList = new ArrayList<>();
		empDataList.add(new EmployeePayrollData(1, new EmployeePayrollDTO("Ashwini", 500000)));
		return empDataList;
	}

	@Override
	public EmployeePayrollData getEmployeePayrollData(int empId) {
		EmployeePayrollData empData = null;
		empData = new EmployeePayrollData(1, new EmployeePayrollDTO("Ashwini", 500000));
		return empData;
	}

	@Override
	public EmployeePayrollData createEmployeePayrollData(EmployeePayrollDTO empPayrollDTO) {
		EmployeePayrollData empData = null;
		empData = new EmployeePayrollData(1, empPayrollDTO);
		return empData;
	}

	@Override
	public EmployeePayrollData updateEmployeePayrollData(EmployeePayrollDTO empPayrollDTO) {
		EmployeePayrollData empData = null;
		empData = new EmployeePayrollData(1, empPayrollDTO);
		return empData;
	}

	@Override
	public void deleteEmployeePayrollData(int empId) {
	}
}
