package org.demo.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCallback;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;

public class EmployeeDao {
	
	private JdbcTemplate template;
	
	


	public JdbcTemplate getTemplate() {
		return template;
	}

	public void setTemplate(JdbcTemplate template) {
		this.template = template;
	}

	/*public int saveEmployee(Employee e) {
		String query = "insert into public.employeee values ('"+ e.getEmpno()+"','"+e.getEmpname()+"','"+e.getSalary()+"')";
		int result = template.update(query);
		return result;
	}
	*/
	public Object saveEmployeeByPreparedStatement( Employee e) {
		String query = "insert into public.employeee values(?,?,?)";
		/*Map<String, Object> emap = new HashMap<String,Object>();
		emap.put("id", e.getEmpno());
		emap.put("name", e.getEmpname());
		emap.put("salary", e.getSalary());*/
		return template.execute(query, new PreparedStatementImplementation(e));
	}
	
	/*public List<Employee> getAllEmployee(){
		String query = "select * from public.employeee";
		return template.query(query, new ResultSetExtractor<List<Employee>>() {
			
			public List<Employee> extractData(ResultSet rs) throws SQLException , DataAccessException {
				
				List<Employee> le = new ArrayList<Employee>();
				while(rs.next()) {
					Employee e = new Employee(rs.getInt(1),rs.getString(2),rs.getInt(3));
					
					le.add(e);
					
				}
				
				return le;
			}
			
			
		}
		);
				
	}*/
	
	
	

}
