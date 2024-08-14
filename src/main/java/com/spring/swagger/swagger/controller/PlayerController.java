package com.spring.swagger.swagger.controller;


import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Tag(name = "Player Controller", description = "Controller Player Layer")
@RestController
@RequestMapping("/api")
public class PlayerController {

    @GetMapping("/name")
   // @ApiOperation(value = "get Name",notes = "Empty Object",tags = "employee-controller")
    @Operation(summary = "get Name", description = "Empty Object", tags = "Employee Controller")// tags pour dire que cette requet appartien a l autre controller "Employee controller"
    public String getName(){
        return "Eslam Khder";
    }

    @GetMapping("/student")
    public String getStudent(){
        return "I am Stident (Eslam Khder)";
    }
}
