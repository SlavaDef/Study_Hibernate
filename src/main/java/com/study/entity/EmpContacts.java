package com.study.entity;

import jakarta.persistence.*;
import lombok.*;

//@NoArgsConstructor

//@AllArgsConstructor
//@Getter
//@Setter
@Data
@Table(name = "emp_contacts")
@Entity
public class EmpContacts {

    @Id
   // @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column( length = 25, nullable = false)
    private String mobPhone;
    @Column(name = "emp_address", length = 100)
    private String empAddress;
    @Column(name = "emp_email",length = 50, nullable = false)
    private String empEmail;
    @Column(name="employee_id")
    private Long employeeId;

   // @ToString.Exclude
   // @ManyToOne
   // @JoinColumn(name = "employer_id", nullable = true)
  //  private Employer employer;

    public EmpContacts(String mobPhone, String empAddress, String empEmail) {
        this.mobPhone = mobPhone;
        this.empAddress = empAddress;
        this.empEmail = empEmail;
    }

    public EmpContacts() {
    }

    /*
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
        if (!(o instanceof EmployerContacts contacts)) return false;
        return Objects.equals(getId(), contacts.getId()) && Objects.equals(getMobPhone(), contacts.getMobPhone()) && Objects.equals(getEmpAddress(), contacts.getEmpAddress()) && Objects.equals(getEmpEmail(), contacts.getEmpEmail()) && Objects.equals(getEmployer(), contacts.getEmployer());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getMobPhone(), getEmpAddress(), getEmpEmail(), getEmployer());
    } */
}
