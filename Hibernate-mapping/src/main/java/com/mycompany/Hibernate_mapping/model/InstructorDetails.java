package com.mycompany.Hibernate_mapping.model;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
//import javax.persistence.Table;
import javax.persistence.OneToOne;

import lombok.Data;

@Data
@Entity
//@Table(name="Instructor_Details")
public class InstructorDetails implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 6017543241456772360L;
	@Id
	@Column(name="Instructor_detail_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name="Youtube_channel")
	private String youtubeChannel;
	@Column(name="Twitter")
	private String Twitter;
	//@OneToOne(mappedBy ="instructor",cascade = CascadeType.ALL)
	//private Instructor instructor;
public InstructorDetails() {
		
	}

	public InstructorDetails(String youtubeChannel, String Twitter) {
		this.youtubeChannel = youtubeChannel;
		this.Twitter = Twitter;
	}

	

	@Override
	public String toString() {
		return "InstructorDetail [id=" + id + ", youtubeChannel=" + youtubeChannel + ", Twitter=" + Twitter + "]";
	}
}
