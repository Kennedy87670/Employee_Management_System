package com.service.emsbackend.Mapper;

import com.service.emsbackend.dto.EmployeeDto;
import com.service.emsbackend.entity.Employee;

public class EmployeeMapper {

    public static EmployeeDto mapToEmployeeDto (Employee employee){
        return new EmployeeDto(
                employee.getId(),
                employee.getFirstName(),
                employee.getFirstName(),
                employee.getEmail()
        );
    }

    public static  Employee mapToEmployee(EmployeeDto employeeDto){
        return new Employee(
                employeeDto.getId(),
                employeeDto.getFirstName(),
                employeeDto.getLastName(),
                employeeDto.getEmail()
        );
    }
}
