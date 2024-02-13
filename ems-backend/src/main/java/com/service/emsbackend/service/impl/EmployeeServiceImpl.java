package com.service.emsbackend.service.impl;

import com.service.emsbackend.Mapper.EmployeeMapper;
import com.service.emsbackend.dto.EmployeeDto;
import com.service.emsbackend.entity.Employee;
import com.service.emsbackend.repository.EmployeeRepository;
import com.service.emsbackend.service.EmployeeService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class EmployeeServiceImpl implements EmployeeService {

    private EmployeeRepository employeeRepository;
    @Override
    public EmployeeDto createEmployee(EmployeeDto employeeDto) {

        Employee employee = EmployeeMapper.mapToEmployee(employeeDto);
        Employee savedEmployee = employeeRepository.save(employee);
        return EmployeeMapper.mapToEmployeeDto(savedEmployee);
    }
}
