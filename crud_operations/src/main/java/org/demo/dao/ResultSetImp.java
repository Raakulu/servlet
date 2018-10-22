package org.demo.dao;



import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.ResultSetExtractor;




public class ResultSetImp implements ResultSetExtractor<List<Employee>> {

	
	@Override
	public List<Employee> extractData(ResultSet rs) throws SQLException, DataAccessException {
		// TODO Auto-generated method stub
		List<Employee> elist = new ArrayList<Employee>();
		while(rs.next()) {
			System.out.println("in result set");
			Employee e = new Employee();
			e.setEmpno(rs.getInt(1));
			e.setEmpname(rs.getString(2));
			e.setSalary(rs.getInt(3));
			elist.add(e);
		}
		return elist;
	}

}
