package com.capgemini.employeepayrollapp.services;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;
import com.capgemini.employeepayrollapp.dto.EmployeePayrollDTO;
import com.capgemini.employeepayrollapp.model.EmployeePayrollData;

@Service
public class EmployeePayrollService implements IEmployeePayrollService{
private List<EmployeePayrollData> empPayrollList=new ArrayList<>();
	
	@Override
	public List<EmployeePayrollData> getEmployeePayrollData() {
		return empPayrollList;
	}

	@Override
	public EmployeePayrollData getEmployeePayrollData(int empId) {
		return empPayrollList.get(empId-1);
	}

	@Override
	public EmployeePayrollData createEmployeePayrollData(EmployeePayrollDTO empPayrollDTO) {
		EmployeePayrollData empData = null;
		empData = new EmployeePayrollData(empPayrollList.size()+1, empPayrollDTO);
		empPayrollList.add(empData);
		return empData;
	}

	@Override
	public EmployeePayrollData updateEmployeePayrollData(int empId, EmployeePayrollDTO empPayrollDTO) {
		EmployeePayrollData empData = this.getEmployeePayrollData(empId);
		empData.setName(empPayrollDTO.name);
		empData.setSalary(empPayrollDTO.salary);
		empPayrollList.set(empId-1, empData);
		return empData;
	}

	@Override
	public void deleteEmployeePayrollData(int empId) {
		empPayrollList.remove(empId-1);
	}
}
