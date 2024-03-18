package com.study.entity;


import jakarta.persistence.*;
import lombok.Data;

import java.sql.Date;
@NamedQueries({
        @NamedQuery(name = "Employer_FindAll_Employer",
                query = "from Employer"),
        @NamedQuery(name = "Employer_FindById",
                query = "from Employer where id = :id") } )

@Entity
@Data
@Table(name = "employer")
public class Employer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "name")
    private String name;
    private String department;
    private String project;
    private Date deadline;
}
