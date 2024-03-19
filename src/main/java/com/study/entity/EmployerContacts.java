package com.study.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.Objects;

@NoArgsConstructor

@AllArgsConstructor
@Getter
@Setter
@Table(name = "emp_contacts")
@Entity
public class EmployerContacts {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column( length = 25, nullable = false)
    private String mobPhone;
    @Column(name = "emp_address", length = 100)
    private String empAddress;
    @Column(name = "emp_email",length = 50, nullable = false)
    private String empEmail;

    @ToString.Exclude
    @ManyToOne
    @JoinColumn(name = "employer_id")
    private Employer employer;

    public EmployerContacts(String mobPhone, String empAddress, String empEmail) {
        this.mobPhone = mobPhone;
        this.empAddress = empAddress;
        this.empEmail = empEmail;
    }

    public EmployerContacts(Long id, String mobPhone, String empAddress, String empEmail) {
        this.id = id;
        this.mobPhone = mobPhone;
        this.empAddress = empAddress;
        this.empEmail = empEmail;
    }

    public EmployerContacts(String mobPhone, String empAddress, String empEmail, Employer employer) {
        this.mobPhone = mobPhone;
        this.empAddress = empAddress;
        this.empEmail = empEmail;
        this.employer = employer;
    }

    @Override
    public String toString() {
        return "EmployerContacts{" +
                "emp_id=" + id +
                ", mobPhone='" + mobPhone + '\'' +
                ", empAddress='" + empAddress + '\'' +
                ", empEmail='" + empEmail + '\'' +
                ", employer=" + employer +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof EmployerContacts that)) return false;
        return Objects.equals(getId(), that.getId()) && Objects.equals(getMobPhone(), that.getMobPhone()) && Objects.equals(getEmpAddress(), that.getEmpAddress()) && Objects.equals(getEmpEmail(), that.getEmpEmail()) && Objects.equals(getEmployer(), that.getEmployer());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getMobPhone(), getEmpAddress(), getEmpEmail(), getEmployer());
    }
}
