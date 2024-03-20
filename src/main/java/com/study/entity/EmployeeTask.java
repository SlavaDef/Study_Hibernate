package com.study.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name="task")
public class EmployeeTask {

    @Id
    @Column(name="id")
    private Integer id;

    @Column(name="name")
    private String description;

    @Column(name="employee_id")
    private Integer employeeId;



}
