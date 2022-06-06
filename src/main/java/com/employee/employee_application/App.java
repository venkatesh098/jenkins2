package com.employee.employee_application;

import java.util.List;
import java.util.Optional;

import com.employee.dto.Employee;
import com.employee.service.EmployeeServiceImpl;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       EmployeeServiceImpl employeeService = new EmployeeServiceImpl();
       Employee employee = new Employee(102, "Surya", 10000.0,"JAVA" );
       Optional<Employee> addedEmpoyee= employeeService.addEmployee(employee);
       if(addedEmpoyee.isPresent()) {
    	   System.out.println("Employee added Success fully");
       }
       
       List<Employee> employees = employeeService.getEmployees();
       System.out.println(employees);
       
    }
}

