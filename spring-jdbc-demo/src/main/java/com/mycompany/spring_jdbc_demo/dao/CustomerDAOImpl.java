package com.mycompany.spring_jdbc_demo.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

import com.mycompany.spring_jdbc_demo.model.Customer;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CustomerDAOImpl implements CustomerDAO {

/**
private DataSource dataSource=null;
	
	
	@Override
	public void createCustomer(Customer customer) {
		Connection connection=null;
		 Statement statement=null;
		 PreparedStatement pStatement=null;
		
		try {
			connection=dataSource.getConnection();
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		System.out.println(dataSource.toString());
		try {
			pStatement=connection.prepareStatement("insert into customer(first_name,last_name,email) values(?,?,?)");
			pStatement.setString(1, customer.getFirstName());
			pStatement.setString(2, customer.getLastName());
			pStatement.setString(3, customer.getEmail());
			pStatement.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

**/
	private JdbcTemplate jdbcTemplate;

	@Override
	public void createCustomer(Customer customer) {
		jdbcTemplate.update("insert into customer(first_name,last_name,email) values (?,?,?)",customer.getFirstName()
				,customer.getLastName(),customer.getEmail());
		
	}

	@Override
	public void deleteCustomer(int id) {
		// TODO Auto-generated method stub
		jdbcTemplate.update("delete from customer where id=?",id);
	}

	@Override
	public void updateCustomer(int id) {
		// TODO Auto-generated method stub
		jdbcTemplate.update("update customer set first_name=?, last_name=?, email=? where id=?", 
				"Kavya","Amin" , "kavya@gmail.com", id);
	}

	//public CustomerDAOImpl(DataSource dataSource) {
		
		//this.dataSource = dataSource;
	//}
}
