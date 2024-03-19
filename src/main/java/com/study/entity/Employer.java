package com.study.entity;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.sql.Date;
import java.util.Objects;

@NamedQueries({
        @NamedQuery(name = "Employer_FindAll_Employer",
                query = "from Employer"),
        @NamedQuery(name = "Employer_FindById",
                query = "from Employer where id = :id") } )

@NoArgsConstructor
@Getter
@Setter
@Table(name = "employer")
@Entity
public class Employer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "name")
    private String name;
    private String department;
    private String project;
    private Date deadline;

    public Employer(String name, String department, String project, Date deadline) {
        this.name = name;
        this.department = department;
        this.project = project;
        this.deadline = deadline;
    }

    public Employer(long id, String name, String department, String project, Date deadline) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.project = project;
        this.deadline = deadline;
    }

    @Override
    public String toString() {
        return "Employer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", department='" + department + '\'' +
                ", project='" + project + '\'' +
                ", deadline=" + deadline +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Employer employer)) return false;
        return getId() == employer.getId() && Objects.equals(getName(), employer.getName()) && Objects.equals(getDepartment(), employer.getDepartment()) && Objects.equals(getProject(), employer.getProject()) && Objects.equals(getDeadline(), employer.getDeadline());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getName(), getDepartment(), getProject(), getDeadline());
    }
}
