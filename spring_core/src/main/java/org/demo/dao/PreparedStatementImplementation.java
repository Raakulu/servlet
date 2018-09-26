package org.demo.dao;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.PreparedStatementCallback;

public class PreparedStatementImplementation implements PreparedStatementCallback<Object> {
	
	Employee e;
	
	@Override
	public Object doInPreparedStatement(PreparedStatement ps) throws SQLException, DataAccessException {
		// TODO Auto-generated method stub

		ps.setInt(1, e.getEmpno());
		ps.setString(2, e.getEmpname());
		ps.setInt(3, e.getSalary());
		return ps.execute();
		
	}

	public PreparedStatementImplementation(Employee e) {
		super();
		this.e = e;
	}



}
