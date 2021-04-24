package com.example.employee;

import java.net.URI;
import java.util.ArrayList;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

@Service
public class EmployeeService {

	private final EmployeeRepository employeeRepository;
    
    EmployeeService(EmployeeRepository employeeRepository) {
        super();
        this.employeeRepository = employeeRepository;
    }

    List<Employee> getAll(){
        var l = new ArrayList<Employee>();
        for(Employee r : employeeRepository.findAll())
        {
            l.add(r);
        }
        return l;
    }

    Employee get(Integer id){
        return employeeRepository.findById(id).get();
    }

    Employee update(Integer id, Employee updatedEmployee){
        Employee dbemployee = employeeRepository.findById(id).get();
        dbemployee.setName(updatedEmployee.getName().toString());
        dbemployee.setCar(updatedEmployee.getCar());
        dbemployee.setCompany(updatedEmployee.getCompany());
        return dbemployee;

    }


    ResponseEntity<Object> add(Employee p){
    employeeRepository.save(p);
    URI location = ServletUriComponentsBuilder.fromCurrentRequest()
    .path("/{id}")
    .buildAndExpand(p.getId())
    .toUri();  
    return ResponseEntity.created(location).build();  
    }
}

    
    

