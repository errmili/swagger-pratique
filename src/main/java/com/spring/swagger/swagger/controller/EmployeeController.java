package com.spring.swagger.swagger.controller;

import com.spring.swagger.swagger.model.Employee;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.spring.swagger.swagger.dao.EmployeeRepo;


// http://localhost:8080
@Tag(name = "Employee Controller", description = "Controller Employee Layer")
@RestController
@RequestMapping("/api")
public class EmployeeController {
    @Autowired
    private EmployeeRepo employeeRepository;

    // http://localhost:8080/api/save
    @PostMapping("/save")
    //@Tag(name = "Employee Controller Layer")
   // @ApiOperation(value = "Save Employee",notes = "You must pass object of employee")
    @Operation(summary = "Save Employee", description = "You must pass object of employee")
    public ResponseEntity<Employee> save(@RequestBody Employee employee){
        return ResponseEntity.status(HttpStatus.CREATED).body(
                employeeRepository.save(employee)
        );
    }

    @GetMapping("/show")
    //@ApiOperation(value = "show Employee",notes = "You must pass id of employee")
    @Operation(summary = "show Employee", description = "You must pass id of employee")
    public ResponseEntity<Employee> show(@RequestParam int id){
        return ResponseEntity.status(HttpStatus.OK).body(
                employeeRepository.findById((long) id).get()
        );
    }
    @DeleteMapping("/delete")
    //@ApiOperation(value = "delete Employee",notes = "You must id object of employee")
    @Operation(summary = "delete Employee", description = "You must id object of employee")
    public void delete(@RequestParam int id){
        employeeRepository.deleteById((long) id);
    }

    @PutMapping("/edit")
    //@ApiOperation(value = "edit Employee",notes = "You must pass object of employee")
    @Operation(summary = "edit Employee", description = "You must pass object of employee")
    public void edit(@RequestBody Employee employee){
        employeeRepository.save(employee);
    }
}
