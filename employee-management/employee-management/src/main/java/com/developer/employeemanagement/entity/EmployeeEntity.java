package com.developer.employeemanagement.entity;

import jakarta.persistence.*;

import java.util.Date;

@Entity()
@Table(name ="employee_tbl")
public class EmployeeEntity {
    @Id()
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "emp_id")
    private long Id;
    @Column(name ="emp_name")
    private String name;
    @Column(name ="emp_gender")
    private String gender;
    @Column(name ="emp_dob")
    private Date dateOfBirth=getDateOfBirth();
    @Column(name ="emp_address")
    private String address;

    public EmployeeEntity() {

    }
    public EmployeeEntity(long id, String name, String gender, Date dateOfBirth, String address) {
        Id = id;
        this.name = name;
        this.gender = gender;
        this.dateOfBirth = dateOfBirth;
        this.address = address;
    }

    public long getId() {
        return Id;
    }

    public void setId(long id) {
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
