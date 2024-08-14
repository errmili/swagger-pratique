package com.spring.swagger.swagger.model;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import jakarta.persistence.*;

@Data
@Entity
@Table(name = "employee")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "employee_id")
    //@ApiModelProperty(value = "this is id of employee")
    @Schema(description = "this is id of employee", example = "123")
    private Long id;


    @Schema(description = "This is the full name of the employee", required = false)
    private String fullName;

    private String age;

    private String phone;

    private String address;
}
