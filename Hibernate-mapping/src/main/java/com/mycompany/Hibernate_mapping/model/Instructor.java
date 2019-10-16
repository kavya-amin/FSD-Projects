package com.mycompany.Hibernate_mapping.model;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import lombok.Data;

@Data
@Entity
/*@Table(name="Instructor")*/
public class Instructor implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 2779798469475801110L;
	@Id
	@Column(name="Instructor_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name="Instructor_fname")
	private String firstName;
	@Column(name="Instructor_lname")
	private String lastName;
	@Column(name="Instructor_email")
	private String email;
	@JoinColumn(name="Instructor_detail_id")
	@OneToOne(cascade = CascadeType.ALL)
	private InstructorDetails instructorDetailId;
	
public Instructor() {
		
	}

	public Instructor(String firstName, String lastName, String email) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
	}

	

	@Override
	public String toString() {
		return "Instructor [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", email=" + email
				+ ", instructorDetail=" + instructorDetailId + "]";
	}
	
}
