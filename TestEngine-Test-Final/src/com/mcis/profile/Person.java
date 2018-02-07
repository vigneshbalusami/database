package com.mcis.profile;

import java.util.Date;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="type")
@DiscriminatorValue("PRES")
public class Person {
	@Id
	@GeneratedValue
	private Integer id;
	@Column(name="name",length=30,nullable=false)
	private String name;
	@Column(name="gender",nullable=false)
	private Gender gender;
	@Column(name="dob",nullable=false)
	@Temporal(TemporalType.DATE)
	private Date dateOfBirth;
	@Embedded
    @AttributeOverrides(value = {
            @AttributeOverride(name = "doorNumber", column = @Column(name="door_no",nullable=true)),
            @AttributeOverride(name = "streetName", column = @Column(name="street_name",nullable=true)),
            @AttributeOverride(name = "location", column = @Column(name="location",nullable=true)),
            @AttributeOverride(name = "city", column = @Column(name="city",nullable=true)),
            @AttributeOverride(name = "pincode", column = @Column(name="pincode",columnDefinition="int",length=11,nullable=true))
            
    })
	private Address address;
	@Column(name="dept",nullable=false,length=10)
	private String department;
	
	
	public Person() {
		super();
	}

	public Person(Integer id, String name, Gender gender, Date dateOfBirth, Address address, String department) {
		super();
		this.id = id;
		this.name = name;
		this.gender = gender;
		this.dateOfBirth = dateOfBirth;
		this.address = address;
		this.department = department;
	}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Gender getGender() {
		return gender;
	}
	public void setGender(Gender gender) {
		this.gender = gender;
	}
	public Date getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	
}
