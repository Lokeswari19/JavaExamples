package org.samples;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

public class StudentJDBCTemplate implements StudentDAO{
	
	private DataSource dataSource;
	private JdbcTemplate jdbcTemplateObject;
	
	//Setter injection for datasource (information about db connection
	public void setDataSource(DataSource dataSource) {
		this.dataSource=dataSource;
		jdbcTemplateObject=new JdbcTemplate(dataSource); //DataSource is passed as an input
				
	}

	
	public void createStudent(Integer id, String name, Integer age) {
		String SQL ="insert into Student (id,name,age)values(?,?,?)";  //PreparedStatement 
		jdbcTemplateObject.uupdate(SQL, id , name, age);
		System.out.println("Created Record Name=" + name + " age = " + age);
	}

	@Override
	public Student getStudent(Integer id) {
		String SQL="select * from Student where id =?";
		Student student=jdbcTemplateObject.queryForObject(SQL, new Object[] { id }, new StudentMapper());
		
		return student;
	}

	@Override
	public List<Student> listStudent() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(Integer id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(Integer id, Integer age) {
		// TODO Auto-generated method stub
		
	}

}