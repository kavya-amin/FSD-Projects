package com.mycompany.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import org.hibernate.annotations.Immutable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
//@AllArgsConstructor
@Data
@Entity
@Table(name = "customer")
@Immutable
public class Customer{
	
	
	@Id
	@Column(name = "customer_id")
	private int id;
	@NotNull
	private String Customer_name=null;
	@NotNull
	private String Customer_type=null;
	public Customer(int id, String Customer_name, String Customer_type) {
		super();
		this.id = id;
		this.Customer_name = Customer_name;
		this.Customer_type = Customer_type;

}
}