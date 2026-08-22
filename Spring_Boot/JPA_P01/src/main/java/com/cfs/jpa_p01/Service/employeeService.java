package com.cfs.jpa_p01.Service;

import com.cfs.jpa_p01.entity.employee;

import java.util.List;

public interface employeeService {

    employee saveEmployee(employee employee);

    List<employee> getAllEmployees();
    employee getEmployeeId(Integer id);
    employee updateEmployee(Integer id , employee employee);
     void deleteEmployee(Integer id);
}
