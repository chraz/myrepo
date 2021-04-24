package com.example.employee;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping(path="/")
    @CrossOrigin()
    String empty()
    {
        return "jepp TEST";
    }


    @GetMapping(path="/employee")
    @CrossOrigin()
    List<Employee> getAll(){
        return employeeService.getAll();
    }

    @GetMapping(path="/employee/{id}")
    @CrossOrigin()
    Employee getSingle(@PathVariable Integer id){
        return employeeService.get(id);
    }

      /**
     * Update
     * @param id
     * @param updatedEmployee
     * @return
     */
    @PutMapping(path ="/employee/{id}", consumes="application/json", produces = "application/json")
    @CrossOrigin()
    Employee update(@PathVariable Integer id, @RequestBody Employee updatedEmployee){
        employeeService.update(id, updatedEmployee);

        return employeeService.get(id);

    }

      /**
     * ADD
     * @param p
     * @return
     */
    @PostMapping(path="/employee", consumes="application/json", produces = "application/json")
    @CrossOrigin()
    Employee add(@RequestBody Employee p){
        return p;
       
    }

    
}
