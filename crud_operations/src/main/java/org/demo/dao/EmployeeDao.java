package org.demo.dao;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;



public class EmployeeDao {

	private JdbcTemplate template;

	public JdbcTemplate getTemplate() {
		return template;
	}

	public void setTemplate(JdbcTemplate template) {
		this.template = template;
	}

	
/*	public void saveEmployeeByPreparedStatement(Employee e) {
		String query = "insert into public.employeee values(?,?,?)";
		template.execute(query, new PreparedStatementImplementation(e));

	}*/

	public List<Employee> getAllEmployee() {
		String query = "select * from public.employeee";
		 List<Employee> list = template.query(query, new ResultSetImp());
		
		return list;

	}

}
